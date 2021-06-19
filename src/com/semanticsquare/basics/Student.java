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
	
	Student(String name, String gender, int id,  int age, int rank, long phone, float gpa, char degree) {
		this(name, gender, id, age, rank, phone, gpa, degree, false);
	}
	
	Student(String name, String gender, int id,  int age, int rank, long phone, float gpa, char degree, boolean international) {
		this.name  = name;
		this.gender = gender;
		this.id = id;
		this.age = age;
		this.rank = rank;
		this.phone = phone;
		this.gpa = gpa;
		this.degree = degree;
		this.international = international;
		
		compute();
		
		System.out.println("\nCount number: " + computeCount);
		
		System.out.println("\nname: " + this.name);
		System.out.println("gender: " + this.gender);
		System.out.println("id: " + this.id);
		System.out.println("age: " + this.age);
		System.out.println("rank: " + this.rank);
		System.out.println("phone number: " + this.phone);
		System.out.println("gpa: " + this.gpa);
		System.out.println("degree: " + this.degree);
		System.out.println("tution fees: " + tuitionFees);
	}
	
	void compute(){
		computeCount = computeCount + 1;
		if(international) {
			tuitionFees = tuitionFees + internationalFees;
		}
		
	}
	
	//static Student s2 = new Student();
	
	public static void main(String[] arg) {
		Student s1 = new Student("John", "male", 1000, 18, 156,992667664352L, 3.8f, 'B');
		
		Student s2 = new Student("Ram", "male", 1010, 20, 106, 992667664542L, 3.4f, 'M', true);
		
		System.out.println("\nname of Student 1: " + s1.name);
		System.out.println("\nname of Student 2: " + s2.name);
	}
}