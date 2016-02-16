package basic2;

import javafx.application.Application;
import javafx.stage.Stage;

public class DemoWithJavaFXNotWorking extends Application {

	public static void main(String[] args) {
		launch(args);
	}

	@Override
	public void start(Stage stage) throws Exception {
//		Student model  = new Student();
		Student model = retriveStudentFromDatabase();
		
	      //Create a view : to write student details on console
		WindowView windowView = new WindowView(stage);
		
	      StudentController controller = new StudentController(model, windowView);
	      controller.updateView();  // still gets "Robert" and "11" at this point
	      
	      // the following shows the remaining code gets executed without waiting for input from the 
	      // the text fields in the view
	      String[] info = controller.getStudentDetails();
	     controller.setStudentDetails(info);
	     controller.updateView();   // the objects get overwritten with nulls
	}
	
	   private static Student retriveStudentFromDatabase(){
	      Student student = new Student();
	      student.setName("Robert");
	      student.setIdNum("11");
	      return student;
	   }
}
