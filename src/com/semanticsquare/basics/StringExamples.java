class StringExamples {
	static void stringexample(){
		String s = "Hello World!";
		System.out.println(s);
		System.out.println("length: " + s.length());
		System.out.println("is empty: " + s.isEmpty());
		
		System.out.println("equals: " + s.equals("Hello World"));
		System.out.println("equals ignore case: " + s.equalsIgnoreCase("HELLO WORLD!"));
		System.out.println("compare to: " + s.compareTo("HELLO WORLD!"));
		
		System.out.println("contains world: " + s.contains("world"));
		System.out.println("contains Hello: " + s.contains("Hello"));
		System.out.println("starts with Hello: " + s.startsWith("Hello"));
		System.out.println("starts with world: " + s.startsWith("world"));
		System.out.println("ends with !: " + s.endsWith("!"));
		System.out.println("index of !: " + s.indexOf("!"));
		System.out.println("index of z: " + s.indexOf("z"));
		System.out.println("last index of o: " + s.lastIndexOf("o"));
		
		System.out.println("character at 4: " + s.charAt(4));
		
		System.out.println("substring from 7: " + s.substring(7));
		System.out.println("substring from 4 to 8: " + s.substring(4, 8));
		
		System.out.println("Upper Case: " + s.toUpperCase());
		System.out.println("Lower Case: " + s.toLowerCase());
		
		System.out.println("Trim: " + s.trim()); // remove whitespaces from start and end
		
		System.out.println("replace all o with r: " + s.replaceAll("o", "r"));
		
		//static method
		System.out.println(String.valueOf(1.3));
		
		System.out.println("\n");
		
		StringBuffer sb = new StringBuffer(s); //StringBuilder
		sb.append(" Good ").append("Morning...");
		System.out.println("new string: " + sb.toString());
		System.out.println("new string length: " + sb.length());
		sb.delete(25,27);
		System.out.println("new string: " + sb.toString());
		System.out.println("new string length: " + sb.length());
		sb.delete(20,25).insert(20,"sdffddg");
		System.out.println("new string: " + sb.toString());
		System.out.println("new string length: " + sb.length());
	}
	public static void main(String[] arg) {
		stringexample();
		
	}
}