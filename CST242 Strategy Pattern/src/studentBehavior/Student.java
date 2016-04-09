package studentBehavior;

public class Student {
	private Behavior behavior;
	
	public Student() {
	};
	
	public void setBehavior(Behavior behavior) {
		this.behavior = behavior;
	}
	

	public void attendanceBehavior() {
		behavior.attendanceBehavior();
	}

	public void testBehavior() {
		behavior.testBehavior();
	}

	public void homeworkBehavior() {
		behavior.homeworkBehavior();
	}

	public void overallBehavior() {
		attendanceBehavior();
		testBehavior();
		homeworkBehavior();
	}
}
