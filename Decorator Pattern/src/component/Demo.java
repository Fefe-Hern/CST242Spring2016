package component;

public class Demo {

	public static void main(String[] args) {
		ConcreteComponent cc = new ConcreteComponent();
		cc.doJob();
		System.out.println("-------------");
		ConcreteDecoratorEX1 ex1 = new ConcreteDecoratorEX1();
		ex1.setComponent(cc);
		ex1.doJob();
		System.out.println("-------------");
		ConcreteDecoratorEX2 ex2 = new ConcreteDecoratorEX2();
		ex2.setComponent(cc);
		ex2.doJob();
	}
}
