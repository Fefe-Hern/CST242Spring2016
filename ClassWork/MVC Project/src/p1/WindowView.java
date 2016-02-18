/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package p1;

import javafx.event.ActionEvent;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.layout.HBox;
import javafx.stage.Stage;

/**
 *
 * @author Fefe-Hern <https://github.com/Fefe-Hern>
 */
public class WindowView {
    private Label nameLbl;
    private Label idLbl;
    private Button okBtn;
    private TextField nameField;
    private TextField idField;
    private HBox pane;
    private WindowListener windowListener;
    private Stage stage;
    
    public WindowView(Stage stage) {
        this.stage = stage;
        nameLbl = new Label("Name: ");
        nameLbl.setAlignment(Pos.CENTER_RIGHT);
        idLbl = new Label("ID: ");
        idLbl.setAlignment(Pos.CENTER_RIGHT);
        okBtn = new Button("OK");
        nameField = new TextField();
        idField = new TextField();
        pane = new HBox(30);
        pane.setAlignment(Pos.CENTER);
        
        okBtn.setOnAction((event) -> {
            String name = nameField.getText();
            String id = idField.getText();
            WindowEvent ev = new WindowEvent(this, new Student(name, id));
            if(windowListener != null) {
                windowListener.buttonClicked(ev);
            }
        });
        
        pane.getChildren().addAll(nameLbl, nameField, idLbl, idField, okBtn);
        stage.setScene(new Scene(pane, 600, 100));
        stage.show();
    }
    
    public void setWindowListener(WindowListener windowListener) {
        this.windowListener = windowListener;
    }
}
