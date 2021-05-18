package handsonday4.inheritanceone;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//		Person obj1_person = new Person("Krishna Paul","Dumdum");
//		Person obj2_person = new Person("Bikramjit Bhuiya","Baranagar");
//		
//		Staff obj1_staff = new Staff("Krishna Paul","Dumdum","TINT",30000);
//		Student obj1_student = new Student("Bikramjit Bhuiya","Baranagar","MCA",3,40000);  
		
		Person obj1_person = new Person();
		obj1_person.setName("Krishna Paul");
		obj1_person.setAddress("Dumdum");
		
		Person obj2_person = new Person();
		obj2_person.setName("Bikramjit Bhuiya");
		obj2_person.setAddress("Baranagar");
		
		Staff obj1_staff = new Staff();
		obj1_staff.setName("Krishna Paul");
		obj1_staff.setAddress("Dumdum");
		obj1_staff.setSchool("TINT");
		obj1_staff.setPay(30000);
		
		Student obj1_student = new Student();
		obj1_student.setName("Bikramjit Bhuiya");
		obj1_student.setAddress("Baranagar");
		obj1_student.setProgram("MCA");
		obj1_student.setYear(3);
		obj1_student.setFee(40000);
		
		System.out.println(obj1_person);
		System.out.println(obj2_person);
		
		System.out.println(obj1_staff);
		System.out.println(obj1_student);
	}

}
