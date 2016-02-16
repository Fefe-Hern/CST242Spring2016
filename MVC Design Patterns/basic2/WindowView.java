package basic2;

import java.util.Scanner;

import intermediate1.Student;
import intermediate1.WindowEvent;
import intermediate1.WindowListener;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.layout.HBox;
import javafx.stage.Stage;

public class WindowView {
	
	private Label nameLbl;
	private Label idLbl;
	private Button okBtn;
	private TextField nameField;
	private TextField idField;
	private HBox pane;
	private Stage stage;
	private String[] info = new String[2];
	
	public WindowView(Stage stage) {
		this.stage = stage;
		nameLbl = new Label("Name: ");
		nameLbl.setAlignment(Pos.CENTER_RIGHT);
		idLbl = new Label("GPA: ");
		idLbl.setAlignment(Pos.CENTER_RIGHT);
		okBtn = new Button("OK");
		nameField = new TextField();
		idField = new TextField();
		pane = new HBox(30);
		pane.setAlignment(Pos.CENTER);
		
		okBtn.setOnAction(event -> {
			String name = nameField.getText();
			String id = idField.getText();
			info[0] = name;
			info[1] = id;
			printStudentDetails(info[0], info[1]);
			
			/* this following block code made this whole idea impossible
			 * as it requires to know about the controller and the model
			 * Otherwise the program will just execute the rest of the 
			 * Demo program without waiting for the new input from the textfields.
			 String[] info = controller.getStudentDetails();
		     controller.setStudentDetails(info);
		     controller.updateView();
		     */
		});
		pane.getChildren().addAll(nameLbl, nameField, idLbl, idField, okBtn);
		stage.setScene(new Scene(pane, 600, 100));
		stage.show();
	}
	
	 public String[] getStudentDetails() {
		   return info;
	   }
	 
	 public void printStudentDetails(String name, String id){
	      System.out.println("Student: ");
	      System.out.println("Name: " + name);
	      System.out.println("Id Number: " + id);
	   }
}
