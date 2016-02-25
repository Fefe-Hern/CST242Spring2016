package choices;

public class MyChoice2 implements IChoice {

	@Override
	public void myChoice(String str1, String str2) {
		System.out.println("I am doing things based on myChoice2: " + 
				(Integer.parseInt(str1) + Integer.parseInt(str2) ));
	}

}
