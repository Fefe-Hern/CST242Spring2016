package model;

import java.math.BigDecimal;

/**
 *
 * @author Fefe-Hern <https://github.com/Fefe-Hern>
 */
public class Index {
    private String month;
    private int monthNum;
    private String year;
    private double value;
    private BigDecimal formatValue;

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

    public String getMonth() {
        return month;
    }

    public int getMonthNum() {
        return monthNum;
    }

    public String getYear() {
        return year;
    }

    public double getValue() {
        return value;
    }

    public void setYear(String year) {
        this.year = year;
    }

    public void setValue(double value) {
        this.value = value;
        this.formatValue = BigDecimal.valueOf(value);
    }

    
    
    @Override
    public String toString() {
        return month + " " + year + "\t" + formatValue.setScale(2);
    }
    
    public Index nextIndex() {
        if((monthNum + 1) == 13) {
            return new Index(1);
        }
        return new Index(monthNum + 1);
    }
}
