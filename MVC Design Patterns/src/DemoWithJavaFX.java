

import controller.StudentController;
import model.Student;
import view.WindowView;
import javafx.application.Application;
import javafx.stage.Stage;

public class DemoWithJavaFX extends Application {

	public static void main(String[] args) {
		launch(args);
	}

	@Override
	public void start(Stage stage) throws Exception {
		WindowView window = new WindowView(stage);
		Student model = new Student();
		StudentController controller = 
				new StudentController(model, window);
	}

}
