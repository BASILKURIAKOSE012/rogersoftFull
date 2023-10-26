package oops.inheritance;

public class InheritanceMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Teacher teacher1 = new Teacher();
		teacher1.setCollegeName("RogerSoft");
		teacher1.setTeacherName("Jaya");
		System.out.println(teacher1.getCollegeName());
		System.out.println(teacher1.getTeacherName());
		Student student1 = new Student();
		student1.setCollegeName("KSR");
		student1.setTeacherName("Vidhya");
		student1.setStudentName("Ryan");
		System.out.println(student1.getCollegeName());
		System.out.println(student1.getTeacherName());
		System.out.println(student1.getStudentName());
	}

}
