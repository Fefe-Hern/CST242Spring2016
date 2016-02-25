package component;

public class ConcreteDecoratorEX2 extends Decorator {
	public void doJob() {
		super.doJob();
		System.out.println("Newly added Behavior 2");
	}
 }
