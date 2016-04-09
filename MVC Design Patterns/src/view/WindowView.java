package view;

import javafx.geometry.Insets;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.layout.HBox;
import javafx.scene.layout.VBox;
import javafx.stage.Stage;

public class WindowView {
	private HBox topPane; // for input
	private Label nameLbl;
	private Label idLbl;
	private TextField nameField;
	private TextField idField;
	private Button okButton;
	
	private HBox bottomPane; // for output
	private Label nameOutLbl;
	private Label idOutLbl;
	private TextField nameOutField;
	private TextField idOutField;
	
	private VBox pane; // to contain topPane and bottomPane
	private OKButtonListener okButtonListener;
	
	public WindowView(Stage stage) {
		topPane = new HBox(30);
		nameLbl = new Label("Name: ");
		nameLbl.setAlignment(Pos.CENTER_RIGHT);
		nameField = new TextField();
		idLbl = new Label("ID: ");
		idLbl.setAlignment(Pos.CENTER_RIGHT);
		idField = new TextField();
		okButton = new Button("OK");
		
		okButton.setOnAction(e -> {
			String name = nameField.getText();
			String id = idField.getText();
			OKButtonEventObject ev = 
					new OKButtonEventObject(this, name, id);
			if (okButtonListener != null) {
				okButtonListener.okButtonClicked(ev);
			}
		});
		
		
		topPane.getChildren().addAll(nameLbl, nameField, idLbl, 
				idField, okButton);
		topPane.setAlignment(Pos.BASELINE_LEFT);
		topPane.setMargin(nameLbl, new Insets(50, 0, 0, 30));
		
		
		bottomPane = new HBox(30);
		nameOutLbl = new Label("Name: ");
		nameOutLbl.setAlignment(Pos.CENTER_RIGHT);
		nameOutField = new TextField();
		idOutLbl = new Label("ID: ");
		idOutLbl.setAlignment(Pos.CENTER_RIGHT);
		idOutField = new TextField();
		bottomPane.getChildren().addAll(nameOutLbl, nameOutField, idOutLbl, 
				idOutField);
		bottomPane.setAlignment(Pos.BASELINE_LEFT);
		bottomPane.setMargin(nameOutLbl, new Insets(0, 0, 0, 30));
		
		// parent pane
		pane = new VBox(30);
		pane.getChildren().addAll(topPane, bottomPane);
		
		stage.setScene(new Scene(pane, 600, 200));
		stage.show();
		
	}
	
	public void setOKButtonListener(OKButtonListener okButtonListener){
		this.okButtonListener = okButtonListener;
	}
	
	public void setNameField(String name){
		nameField.clear();
		nameOutField.setText(name);
	}
	
	public void setIdField(String id){
		idField.clear();
		idOutField.setText(id);
	}
}
