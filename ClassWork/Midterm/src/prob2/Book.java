package prob2;

/**
 * Model
 * @author Fefe-Hern <https://github.com/Fefe-Hern>
 */
public class Book implements BookMarkup {
    private String title;
    private String priceString;
    private double price;
    private String isbn;

    public Book(String title, String priceString, String isbn) {
        this.title = title;
        this.priceString = priceString;
        price = Double.valueOf(priceString);
        markUp();
        this.isbn = isbn;
    }

    @Override
    public void markUp() {
        price = (price * 1.2);
        priceString = String.format("%.2f", price);
    }

    public String getTitle() {
        return title;
    }

    public String getPriceString() {
        return priceString;
    }

    public double getPrice() {
        return price;
    }

    public String getIsbn() {
        return isbn;
    }
    
    
    
}
