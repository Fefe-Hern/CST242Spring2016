package prob2;

import javafx.stage.Stage;
import javafx.stage.StageStyle;

/**
 *
 * @author Fefe-Hern <https://github.com/Fefe-Hern>
 */
public class Controller {
    public static void createBook(String title, String price, String isbn) {
        Book book = new Book(title, price, isbn);
        View.listBook(book.getTitle(), book.getPriceString(), book.getIsbn());
    }
}
