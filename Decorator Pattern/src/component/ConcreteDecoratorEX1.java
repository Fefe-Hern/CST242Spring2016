package component;

public class ConcreteDecoratorEX1 extends Decorator {
	public void doJob() {
		super.doJob();
		System.out.println("Newly added behavior 1");
	}
}
