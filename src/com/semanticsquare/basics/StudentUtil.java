import java.util.ArrayList;

public class StudentUtil {
	
	public static int GradeConverter(char Grade) {
		int value;
		if(Grade == 'A') value = 4;
		else if(Grade == 'B') value = 3;
		else value = 2;
		return value;
	}

    public static double[] calculateGPA(int[] studentIdList, char[][] studentsGrades) {
		double[] GPAlist = new double[studentIdList.length];
        for(int i = 0; i < studentIdList.length; i++){
			double sum = 0;
			for(int j = 0; j < studentsGrades[i].length; j++){
				sum = sum + GradeConverter(studentsGrades[i][j]);
			}
			GPAlist[i] = sum/studentsGrades[i].length;
		}
		return GPAlist;
    }
    
    public static int[] getStudentsByGPA(double lower, double higher, int[] studentIdList, char[][] studentsGrades) {
        // perform parameter validation. Return null if passed parameters are not valid
		if(lower > higher || lower < 0 || higher > 4.0){
			return null;
		}
        
        // invoke calculateGPA
		double[] GPAs = calculateGPA(studentIdList,studentsGrades);
        
        // construct the result array and return it. You would need an extra for loop to compute the size of the resulting array
		ArrayList<Integer> arrayList1 = new ArrayList<>();
		for(int i = 0; i < GPAs.length; i++){
			if(GPAs[i] >= lower && GPAs[i] <= higher) {
				arrayList1.add(studentIdList[i]);
			}
		}
		int[] goodStudentIdList = new int[arrayList1.size()];
		for(int i = 0; i < goodStudentIdList.length; i++){
			goodStudentIdList[i] = arrayList1.get(i);
		}
		
		return goodStudentIdList;
    }
	
	public static void main(String[] arg) {
		int[] studentIdList = {1001, 2346, 6783, 5628};
		char[][] studentsGrades = {{'A', 'B', 'B'}, {'A', 'C', 'B', 'A'}, {'A'}, {'C', 'C', 'B', 'C'}};
		double lower = 1.0;
		double higher = 4.0;
		System.out.println("GPAs of the students");
		for(int i = 0; i < studentIdList.length; i++){
			System.out.println(calculateGPA(studentIdList,studentsGrades)[i]);
		}
		System.out.println("\nIDs of the students who have required GPA");
		for(int i = 0; i < getStudentsByGPA(lower, higher, studentIdList,studentsGrades).length; i++){
			System.out.println(getStudentsByGPA(lower, higher, studentIdList,studentsGrades)[i]);
		}
	}
    
}