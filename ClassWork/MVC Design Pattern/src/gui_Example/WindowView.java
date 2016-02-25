package gui_Example;

import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.layout.HBox;
import javafx.scene.layout.VBox;
import javafx.stage.Stage;

/**
 *
 * @author Fefe-Hern <https://github.com/Fefe-Hern>
 */
public class WindowView {
    private HBox topPane; // for input
    private Label nameLabel;
    private Label idLabel;
    private TextField nameField;
    private TextField idField;
    private Button okButton;
    
    private HBox bottomPane; // for output
    private Label nameOutLabel;
    private Label idOutLabel;
    private TextField nameOutField;
    private TextField idOutField;
    
    private VBox pane; // to contain topPane
    private OkButtonListener okButtonListener;

    public WindowView(Stage stage) {
        topPane = new HBox(30);
        nameLabel = new Label("Name: ");
        nameField = new TextField();
        idLabel = new Label("ID: ");
        idField = new TextField();
        okButton = new Button("OK");
        
        okButton.setOnAction(e->{
            String name = nameField.getText();
            String id = idField.getText();
            OKButtonEventObject ev = new OKButtonEventObject(name, id, this);
            if (okButtonListener != null) {
                okButtonListener.okButtonClicked(ev);
            }
            
        });
        
        
        topPane.getChildren().addAll(nameLabel, nameField, idLabel, idField, okButton);
        topPane.setAlignment(Pos.BASELINE_LEFT);
        
        bottomPane = new HBox(30);
        nameOutLabel = new Label("Name: ");
        nameOutField = new TextField();
        idOutLabel = new Label("ID: ");
        idOutField = new TextField();
        bottomPane.getChildren().addAll(nameOutLabel, nameOutField, idOutLabel, idOutField);
        bottomPane.setAlignment(Pos.BASELINE_LEFT);
        
        //Parent Pane
        pane = new VBox(30);
        pane.getChildren().addAll(topPane, bottomPane);
        stage.setScene(new Scene(pane, 700, 140));
        stage.show();
        
    }
    public void setokButtonListener(OkButtonListener okButtonListener) {
        this.okButtonListener = okButtonListener;
    }
    public void setNameField(String name) {
        nameField.clear();
        nameOutField.setText(name);
    }
    public void setIdField(String id) {
        idField.clear();
        idOutField.setText(id);
    }
}
