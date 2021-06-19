class StudentTest {
	public static void main(String[] arg) {
		Student s1 = new Student("John", "male", 1000, 18, 156,992667664352L, 3.8f, 'B');
		
		Student s2 = new Student("Ram", "male", 1010, 20, 106, 992667664542L, 3.4f, 'M', true);
		
		System.out.println("\nname of Student 1: " + s1.name);
		System.out.println("\nname of Student 2: " + s2.name);
	}
}