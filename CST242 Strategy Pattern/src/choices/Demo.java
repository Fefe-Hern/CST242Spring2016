package choices;
import java.util.Scanner;

public class Demo {

	public static void main(String[] args) {
		Scanner keyboard = new Scanner(System.in);
		System.out.println("Enter the first whole numbers: ");
		String str1 = keyboard.nextLine();
		System.out.println("Enter the second whole numbers: ");
		String str2 = keyboard.nextLine();
		Context context = new Context();
		IChoice ic;
		
		for (int i = 0; i < 2; i++) {
			System.out.println("Enter your choice (1 or 2): ");
			String choice = keyboard.nextLine();
			if (choice.equals("1")) {
				ic = new MyChoice1();
			} else {
				ic = new MyChoice2();
			} 
			
			context.setChoice(ic);
			context.doThingsBasedOnChoiceMade(str1, str2);
		}
	}

}
