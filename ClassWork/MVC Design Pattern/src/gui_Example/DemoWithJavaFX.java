package gui_Example;

import javafx.application.Application;
import javafx.stage.Stage;

/**
 *
 * @author Fefe-Hern <https://github.com/Fefe-Hern>
 */
public class DemoWithJavaFX extends Application {
    public static void main(String[] args) {
        launch(args);
    }
    @Override
    public void start(Stage primaryStage) throws Exception {
        WindowView window = new WindowView(primaryStage);
        Student model = new Student();
        StudentController controller = new StudentController(model, window);
    }
    
}
