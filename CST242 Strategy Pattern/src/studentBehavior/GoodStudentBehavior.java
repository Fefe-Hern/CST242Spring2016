package studentBehavior;

public class GoodStudentBehavior implements Behavior {
	@Override
	public void attendanceBehavior() {
		System.out.println("I'm never late.");
	}

	@Override
	public void testBehavior() {
		System.out.println("My programs always runs during tests.");
	}

	@Override
	public void homeworkBehavior() {
		System.out.println("I always do my homework.");
	}

	@Override
	public void overallBehavior() {
		attendanceBehavior();
		testBehavior();
		homeworkBehavior();
	}

}
