package studentBehavior;

/**
 *
 * @author Fefe-Hern <https://github.com/Fefe-Hern>
 */
public class GoodStudentBehavior implements Behavior {

    @Override
    public void attendanceBehavior() {
        System.out.println("Good Attendance");
    }

    @Override
    public void testBehavior() {
        System.out.println("Good Tests");
    }

    @Override
    public void homeworkBehavior() {
        System.out.println("Good Homeworks");
    }

    @Override
    public void overallBehavior() {
        System.out.println("Good Overall");
    }
    
}
