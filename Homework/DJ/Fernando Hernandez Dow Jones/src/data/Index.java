package data;

import java.math.BigDecimal;

/**
 *
 * @author fefe
 */
public class Index {
    private String month;
    private int monthNum;
    private String year;
    private double value;
    private BigDecimal formatValue;

    /**
     * Creates a specific stock index of $Value for specific month and year.
     * @param month The month of the year given as an int. Converted to String for viewing.
     * @param year The year of the specified index so as to differentiate from the same month
     * @param value The actual stock price average.
     */
    public Index(int month, String year, double value) {
        switch(month) {
            case 1: this.month = "Jan"; break;
            case 2: this.month = "Feb"; break;
            case 3: this.month = "Mar"; break;
            case 4: this.month = "Apr"; break;
            case 5: this.month = "May"; break;
            case 6: this.month = "Jun"; break;
            case 7: this.month = "Jul"; break;
            case 8: this.month = "Aug"; break;
            case 9: this.month = "Sep"; break;
            case 10: this.month = "Oct"; break;
            case 11: this.month = "Nov"; break;
            case 12: this.month = "Dec"; break;
            default: this.month = "null"; break;
        }
        this.monthNum = month;
        
        this.year = year;
        this.value = value;
        this.formatValue = BigDecimal.valueOf(value);
    }
    
    /**
     * Overloaded constructor with only month as argument for nextIndex method.
     * @param month The month of the year given as an int. Converted to String for viewing.
     */
    public Index(int month) {
        switch(month) {
            case 1: this.month = "Jan"; break;
            case 2: this.month = "Feb"; break;
            case 3: this.month = "Mar"; break;
            case 4: this.month = "Apr"; break;
            case 5: this.month = "May"; break;
            case 6: this.month = "Jun"; break;
            case 7: this.month = "Jul"; break;
            case 8: this.month = "Aug"; break;
            case 9: this.month = "Sep"; break;
            case 10: this.month = "Oct"; break;
            case 11: this.month = "Nov"; break;
            case 12: this.month = "Dec"; break;
            default: this.month = "null"; break;
        }
        this.monthNum = month;
    }

    /**
     *
     * @return
     */
    public String getMonth() {
        return month;
    }

    /**
     *
     * @return
     */
    public int getMonthNum() {
        return monthNum;
    }

    /**
     *
     * @return
     */
    public String getYear() {
        return year;
    }

    /**
     *
     * @return
     */
    public double getValue() {
        return value;
    }

    /**
     *
     * @param year
     */
    public void setYear(String year) {
        this.year = year;
    }

    /**
     *
     * @param value
     */
    public void setValue(double value) {
        this.value = value;
        this.formatValue = BigDecimal.valueOf(value);
    }

    
    
    @Override
    public String toString() {
        return month + " " + year + "\t" + formatValue.setScale(2);
    }
    
    /**
     * Provides the index for the next month. Should all months be provided and
     *  the number goes to 13, the Index will return the next year at January.
     * @return
     */
    public Index nextIndex() {
        if((monthNum + 1) == 13) {
            return new Index(1);
        }
        return new Index(monthNum + 1);
    }
}
