package multipleChoice;

public class Context{
	
	private IChoice myRealChoice;
	
	public Context() {};
	
	public void setChoice(IChoice ic) {
		myRealChoice = ic;
	}
	
	public void doThingsBasedOnChoiceMade(String str1, String str2) {
		myRealChoice.myChoice(str1, str2);
	}

}
