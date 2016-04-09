package studentBehavior;

public class Demo {

	public static void main(String[] args) {
		Student student = new Student();
		student.setBehavior(new BadStudentBehavior());
		student.overallBehavior();
		System.out.println("------------------------");
		student.setBehavior(new GoodStudentBehavior());
		student.overallBehavior();
		
	}

}
