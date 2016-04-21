package name;

import com.sun.javafx.scene.control.skin.ComboBoxPopupControl;
import javafx.application.Application;
import javafx.application.Platform;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.layout.GridPane;
import javafx.scene.layout.StackPane;
import javafx.stage.Stage;

/**
 *
 * @author Fefe-Hern <https://github.com/Fefe-Hern>
 */
public class Name extends Application {
    Label nameLabel;
    TextField nameField;
    
    Label firstNameLabel;
    Label lastNameLabel;
    TextField firstNameField;
    TextField lastNameField;
    
    Button generateNameButton;
    Button exitButton;
    
    GridPane grid;
    
    @Override
    public void start(Stage primaryStage) {
        generateLayout();
        addNameFields();
        addButtons();
        
        StackPane root = new StackPane();
        root.getChildren().add(grid);
        
        Scene scene = new Scene(root, 800, 150);
        
        primaryStage.setTitle("Hello World!");
        primaryStage.setScene(scene);
        primaryStage.show();
    }

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        launch(args);
    }

    private void generateLayout() {
        grid = new GridPane();
    }

    private void addNameFields() {
        nameLabel = new Label("Enter name eg:\n \"John Doe\"\n or \"Doe, John\":");
        firstNameLabel = new Label("First Name:");
        lastNameLabel = new Label("Last Name:");
        
        nameField = new TextField("Doe, John");
        firstNameField = new TextField();
        lastNameField = new TextField();
        
        firstNameField.setEditable(false);
        lastNameField.setEditable(false);
        
        grid.addRow(0, nameLabel, nameField);
        grid.addRow(1, firstNameLabel, firstNameField);
        grid.addRow(2, lastNameLabel, lastNameField);
    }

    private void addButtons() {
        generateNameButton = new Button();
        generateNameButton.setText("Generate Name");
        generateNameButton.setOnAction((ActionEvent event) -> {
            StringManipulator manipulator = new StringManipulator(nameField.getText());
            firstNameField.setText(manipulator.getFirstName());
            lastNameField.setText(manipulator.getLastName());
        });
        
        exitButton = new Button();
        exitButton.setText("Exit");
        exitButton.setOnAction((ActionEvent event) -> {
            Platform.exit();
        });
        
        
        grid.addRow(3, generateNameButton, exitButton);
    }
    
}
