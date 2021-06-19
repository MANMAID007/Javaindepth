class Student {
	static int computeCount;
	
	String name;
	String gender;
	int id;
	int age;
	int rank;
	long phone;
	//long bignumbr = 364578765533213414645756896970235346456787679667723432546546447558767576L;
	//long maxValue = Long.MAX_VALUE;
	float gpa;
	char degree;
	boolean international;
	double tuitionFees = 12000.0, internationalFees = 5000.0;
	
	Student(String newName, String newGender, int newId,  int newAge, int newRank, long newPhone, float newGpa, char newDegree, boolean isInternational) {
		name  = newName;
		gender = newGender;
		id = newId;
		age = newAge;
		rank = newRank;
		phone = newPhone;
		gpa = newGpa;
		degree = newDegree;
		international = isInternational;
		
		compute();
	}
	
	void compute(){
		computeCount = computeCount + 1;
		if(international) {
			tuitionFees = tuitionFees + internationalFees;
		}
		System.out.println("\nCount number: " + computeCount);
		
		System.out.println("\nname: " + name);
		System.out.println("gender: " + gender);
		System.out.println("id: " + id);
		System.out.println("age: " + age);
		System.out.println("rank: " + rank);
		System.out.println("phone number: " + phone);
		System.out.println("gpa: " + gpa);
		System.out.println("degree: " + degree);
		System.out.println("tution fees: " + tuitionFees);
	}
	
	//static Student s2 = new Student();
	
	public static void main(String[] arg) {
		Student s1 = new Student("John", "male", 1000, 18, 156,992667664352L, 3.8f, 'B', false);
		
		Student s2 = new Student("Ram", "male", 1010, 20, 106, 992667664542L, 3.4f, 'M', true);
	}
}