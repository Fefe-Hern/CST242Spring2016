package multipleChoice;

public class MyChoice1 implements IChoice {

	@Override
	public void myChoice(String str1, String str2) {
		System.out.println("I am doing things based on myChoice1: " + str1 + str2);
	}
}
