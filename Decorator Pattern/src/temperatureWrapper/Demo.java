package temperatureWrapper;

public class Demo {

	public static void main(String[] args) {
		Convert c = new Convert();
		System.out.println(c.letsConvertF2C(32));
		System.out.println("-----------------");
		TempWrapper theWrapper = new TempWrapper(new Convert());
		System.out.println(theWrapper.letsConvertC2F(0));
	}
}
