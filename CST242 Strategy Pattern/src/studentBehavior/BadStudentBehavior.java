package studentBehavior;

public class BadStudentBehavior implements Behavior {

	@Override
	public void attendanceBehavior() {
		System.out.println("I'm usually late, except on Tuesdays.");
	}

	@Override
	public void testBehavior() {
		System.out.println("My programs crashes during exams.");
	}

	@Override
	public void homeworkBehavior() {
		System.out.println("I rarely do my homework.");
	}

	@Override
	public void overallBehavior() {
		attendanceBehavior();
		testBehavior();
		homeworkBehavior();
	}

}
