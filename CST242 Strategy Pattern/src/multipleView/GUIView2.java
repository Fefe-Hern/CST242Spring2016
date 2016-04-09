package multipleView;

import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.layout.HBox;
import javafx.scene.layout.VBox;
import javafx.stage.Stage;

public class GUIView2 implements View {
		
	private Stage stage;
	private GUIVIEW1Listener guiView1Listener;
	private TextField nameOutField;
	private TextField nameField;
	private TextField idOutField;
	private TextField idField;
		
	public GUIView2(Stage stage) {
			this.stage = stage;
			Label nameLbl = new Label("Name: ");
			Label idLbl = new Label("ID: ");
			nameField = new TextField();
			idField = new TextField();
			Button okButton = new Button("OK");
			
			okButton.setOnAction(e -> {
				String name = nameField.getText();
				String id = idField.getId();
				GUIView1EventObject ev = new GUIView1EventObject(this, name, id);
				if(guiView1Listener != null) {
					guiView1Listener.okButtonClicked(ev);
				}
			});
			
			VBox paneLeft = new VBox(30);
			paneLeft.setAlignment(Pos.CENTER);
			paneLeft.getChildren().addAll(nameLbl, nameField, idLbl, idField, okButton);
			
			VBox paneRight = new VBox(30);
			nameOutField = new TextField();
			idOutField = new TextField();
			Label nameOutLbl = new Label("Name: ");
			Label idOutLbl = new Label("ID: ");
			paneRight.getChildren().addAll(nameOutLbl, nameOutField, idOutLbl, idOutField );
			
			HBox pane = new HBox(20);
			pane.getChildren().addAll(paneLeft, paneRight);
			
			Scene scene = new Scene(pane, 300, 700);
			this.stage.setScene(scene);
			this.stage.show();
		}

		@Override
		public void display(String str1, String str2) {
			nameField.clear();
			idField.clear();
			nameOutField.setText(str1);
			idOutField.setText(str2);
		}
		
		public void setGUIVIEWListener(GUIVIEW1Listener guiView1Listener) {
			this.guiView1Listener = guiView1Listener;
		}

}
