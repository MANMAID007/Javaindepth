// Wrong Solution, it will be modified later.

import java.util.Arrays;

public class SentimentAnalyzer {
    // Tip: labeled continue can be used when iterating featureSet + convert review to lower-case
	public static int[] detectProsAndCons(String review, String[][] featureSet, String[] posOpinionWords,
			String[] negOpinionWords) {
		int[] featureOpinions = new int[featureSet.length]; // output
 
        // your code ~ you will be invoking getOpinionOnFeature	
		int n = featureSet.length;
        int m = 0;
        int j = 0;
        for(int i=0;i<n;i++){
            j=0;
            m=featureSet[i].length;
            do{
            featureOpinions[i] = getOpinionOnFeature(review.toLowerCase(), featureSet[i][j], posOpinionWords,negOpinionWords);
            j++;
            if(featureOpinions[i]==1||featureOpinions[i]==-1){
                break;
            }
            }while(j<m);
        }
 
		return featureOpinions;
	}

	// First invoke checkForWasPhrasePattern and 
	// if it cannot find an opinion only then invoke checkForOpinionFirstPattern
	private static int getOpinionOnFeature(String review, String feature, String[] posOpinionWords, String[] negOpinionWords) {
		
		// your code
		int res = 0;
		res = checkForWasPhrasePattern(review, feature, posOpinionWords, negOpinionWords);
		if(res==0){
		    res = checkForOpinionFirstPattern(review, feature, posOpinionWords, negOpinionWords);
		}
		return res;
		
	}	

	// Tip: Look at String API doc. Methods like indexOf, length, substring(beginIndex), startsWith can come into play
	// Return 1 if positive opinion found, -1 for negative opinion, 0 for no opinion
	// You can first look for positive opinion. If not found, only then you can look for negative opinion
	private static int checkForWasPhrasePattern(String review, String feature, String[] posOpinionWords, String[] negOpinionWords) {
		int opinion = 0;
		String pattern = feature + " was ";

		// your code
		    
        //int len = pattern.length();
        int index = -1;
        index = review.indexOf(pattern);  
        
        if (index != -1) {
			// Move index to the opinion word
			// Note: will go out of bounds if at end of review string, but we shouldn't be at the end of a string mid-sentence
			index += pattern.length(); 
 
			// Error check
			if (index >= review.length())
				return 0; // We have found an incomplete sentence at the end of the string.
			// Since we are not out of bounds, find opinion
			String sub = review.substring(index);
 
			for (String s : posOpinionWords) {
				// If we have a positive opinion
				if (sub.startsWith(s)) {
					opinion = 1;
					return opinion;
				}
			}
 
			for (String s : negOpinionWords) {
				// If we have a negative opinion
				if (sub.startsWith(s)) {
					opinion = -1;
					return opinion;
				}
			}
		}

		return opinion; 	
	}
	
	// You can first look for positive opinion. If not found, only then you can look for negative opinion
	private static int checkForOpinionFirstPattern(String review, String feature, String[] posOpinionWords,
			String[] negOpinionWords) {
		// Extract sentences as feature might appear multiple times. 
		// split() takes a regular expression and "." is a special character 
		// for regular expression. So, escape it to make it work!!
		String[] sentences = review.split("\\.");
		int opinion = 0;
		
		// your code for processing each sentence. You can return if opinion is found in a sentence (no need to process subsequent ones)
		int index;
		for (String s : sentences) {
		  System.out.println(s);
			for (String p : posOpinionWords) {
				index = s.indexOf(p + " "+ feature);
				// If we've found the feature + opinion, return
				if (index != -1) {
					opinion = 1; // Used explicit syntax for readability.
					return opinion;
				}
			}
		}
		// Find negative adjevtive + feature combination
		for (String s : sentences) {
			for (String n : negOpinionWords) {
				index = s.indexOf(feature + n);
				// If we've found the feature + opinion, return
				if (index != -1) {
					opinion = -1; // Used explicit syntax for readability.
					return opinion;
				}
			}
		}

		return opinion;
	}

	public static void main(String[] args) {
		String review = "Haven't been here in years! Fantastic service and the food was delicious! Definetly will be a frequent flyer! Francisco was very attentive";
		
		//String review = "Sorry OG, but you just lost some loyal customers. Horrible service, no smile or greeting just attitude. The breadsticks were stale and burnt, appetizer was cold and the food came out before the salad.";
		
		String[][] featureSet = { 
		        { "ambiance", "ambience", "atmosphere", "decor" },
				{ "dessert", "ice cream", "desert" }, 
				{ "food" }, 
				{ "soup" },
				{ "service", "management", "waiter", "waitress", "bartender", "staff", "server" } };
		String[] posOpinionWords = { "good", "fantastic", "friendly", "great", "excellent", "amazing", "awesome",
				"delicious" };
		String[] negOpinionWords = { "slow", "bad", "horrible", "awful", "unprofessional", "poor" };

		int[] featureOpinions = detectProsAndCons(review, featureSet, posOpinionWords, negOpinionWords);
		System.out.println("Opinions on Features: " + Arrays.toString(featureOpinions));
	}
}