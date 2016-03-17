package prob2;

import com.sun.javafx.scene.control.skin.ComboBoxPopupControl;
import javafx.application.Application;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.layout.BorderPane;
import javafx.scene.layout.GridPane;
import javafx.scene.layout.StackPane;
import javafx.stage.Stage;

/**
 *
 * @author Fefe-Hern <https://github.com/Fefe-Hern>
 */
public class View extends Application {
    Label bookTitleLabel = new Label("Title: ");
    Label bookPriceLabel = new Label("Price: ");
    Label bookIsbnLabel = new Label("ISBN: ");
    Label bookTitleLabelLocked = new Label("Title: ");
    Label bookPriceLabelLocked = new Label("Price: ");
    Label bookIsbnLabelLocked = new Label("ISBN: ");
    
    TextField bookTitleTextField = new TextField();
    TextField bookPriceTextField = new TextField();
    TextField bookIsbnTextField = new TextField();
    static TextField bookTitleTextFieldLocked = new TextField();
    static TextField bookPriceTextFieldLocked = new TextField();
    static TextField bookIsbnTextFieldLocked = new TextField();
    
    Button generateButton = new Button("Generate Listing");
    Button clearButton = new Button("Clear Listing");
    
    @Override
    public void start(Stage primaryStage) {
        generateButton.setOnAction(new EventHandler<ActionEvent>() {
            @Override
            public void handle(ActionEvent event) {
                try {
                Controller.createBook(bookTitleTextField.getText(),
                        bookPriceTextField.getText(),
                        bookIsbnTextField.getText());
                } catch(NumberFormatException e) {
                    System.out.println("No/Invalid price inserted.");
                }
            }
        });
        
        clearButton.setOnAction(new EventHandler<ActionEvent>() {
            @Override
            public void handle(ActionEvent event) {
                bookTitleTextFieldLocked.clear();
                bookPriceTextFieldLocked.clear();
                bookIsbnTextFieldLocked.clear();
            }
        });
        GridPane gridTop = new GridPane();
        gridTop.add(bookTitleLabel, 0, 0);
        gridTop.add(bookTitleTextField, 1, 0);
        gridTop.add(bookPriceLabel, 0, 1);
        gridTop.add(bookPriceTextField, 1, 1);
        gridTop.add(bookIsbnLabel, 0, 2);
        gridTop.add(bookIsbnTextField, 1, 2);
        gridTop.add(generateButton, 1, 3);
        
        bookTitleTextFieldLocked.setEditable(false);
        bookPriceTextFieldLocked.setEditable(false);
        bookIsbnTextFieldLocked.setEditable(false);
        GridPane gridBottom = new GridPane();
        gridBottom.add(bookTitleLabelLocked, 0, 0);
        gridBottom.add(bookTitleTextFieldLocked, 1, 0);
        gridBottom.add(bookPriceLabelLocked, 0, 1);
        gridBottom.add(bookPriceTextFieldLocked, 1, 1);
        gridBottom.add(bookIsbnLabelLocked, 0, 2);
        gridBottom.add(bookIsbnTextFieldLocked, 1, 2);
        gridBottom.add(clearButton, 1, 3);
        
        BorderPane border = new BorderPane();
        border.setTop(gridTop);
        border.setBottom(gridBottom);
        Scene scene = new Scene(border, 300, 250);
        
        primaryStage.setTitle("Book Listing Test!");
        primaryStage.setScene(scene);
        primaryStage.show();
    }

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        launch(args);
    }
    
    public static void listBook(String title, String price, String isbn) {
        bookTitleTextFieldLocked.setText(title);
        bookPriceTextFieldLocked.setText("$" + price);
        bookIsbnTextFieldLocked.setText(isbn);
    }
}
