package data;

import data.StockFiler;
import java.io.IOException;
import java.util.ArrayList;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import data.Index;
import data.YearSeries;

/**
 *
 * @author fefe
 */
public class IndexStrings {
    private static String stringLine;
    private static String monthString;
    private static String yearString;
    private static String valueString;
    private static ArrayList<String> indexData = new ArrayList<>();
    private static Index index;
    
    /**
     * Prepares the file for reading.
     */
    public static void setUpFiler() {
        StockFiler.generateFile();
    }
    
    /**
     * Reads the DJIA.txt file which contains stock data.
     * The list of indexes is created by YearSeries, and the program inputs every line
     * of aggregate data one-by-one into this list (Year, Month, then Value) until it is complete.
     * @throws IOException
     */
    public static void readFile() throws IOException {
        YearSeries.initializeYearList();
        stringLine = StockFiler.readLine();
        while (stringLine != null) {
            if (stringLine.startsWith("2")) { 
                //20xx-xx-01(delete 01)(two spaces) XXXX.X~
                //Find and store year
                yearString = storeYear(stringLine);
                //Find and store month in -XX-, then trim off the -
                monthString = storeMonth(stringLine);
                //Find and store Value
                valueString = storeValue(stringLine);
                //Store information into index
                index = new Index(Integer.parseInt(monthString), yearString, 
                                Double.parseDouble(valueString));
                //Add index data to chart data
                if(YearSeries.compareYearToCurrentSeries(yearString)) {
                    YearSeries.addSeriesDataPoint(index.getMonth(), index.getValue());
                } else {
                    YearSeries.addSeriesDataPoint(index.getMonth(), index.getValue());
                    YearSeries.addYear(yearString);
                }
                //Add Index data (month year and value) to Arraylist for reading to list
                indexData.add(index.toString());
                //Iterate to the next line
                stringLine = StockFiler.readLine();
            } else {
                stringLine = StockFiler.readLine();
            }
        }
    }

    private static String storeYear(String stringLine) {
        Pattern patternForYear = Pattern.compile("20[0-9][0-9]");
        Matcher matcherForYear = patternForYear.matcher(stringLine);
        return matcherForYear.find() ? matcherForYear.group() : "NullYear";
    }

    private static String storeMonth(String stringLine) {
        Pattern patternForMonth = Pattern.compile("-[0-1][0-9]-");
        Matcher matcherForMonth = patternForMonth.matcher(stringLine);
        return matcherForMonth.find() ? matcherForMonth.group().replaceAll("-", "") : "NullMonth";
    }

    private static String storeValue(String stringLine) {

        Pattern patternForValue = Pattern.compile("([0-9])?[0-9][0-9][0-9][0-9]\\.[0-9][0-9]");
        Matcher matcherForValue = patternForValue.matcher(stringLine);
        return matcherForValue.find() ? matcherForValue.group() : "10000.0";
    }

    /**
     *
     * @return
     */
    public static ArrayList<String> getIndexData() {
        return indexData;
    }

    /**
     *
     * @return
     */
    public static String getNextMonth() {
        return index.nextIndex().getMonth();
    }

    /**
     *
     * @return
     */
    public static int getNextMonthNumber() {
        return index.nextIndex().getMonthNum();
    }

    /**
     * Depreciated method. Utilized for Testing and user control to add custom values.
     * @param nextMonth
     * @param value
     * @return True should the input be accurate to generate a new index.
     */
    public static boolean newIndex(int nextMonth, String value) {
        try{
            if (nextMonth == 1) {
                Index newIndex = new Index(
                        nextMonth,
                        Integer.toString(Integer.parseInt(index.getYear()) + 1),
                        Double.parseDouble(value));
                YearSeries.addSeriesDataPoint(newIndex.getMonth(), newIndex.getValue());
                YearSeries.addYear(newIndex.getYear());
                indexData.add(newIndex.toString());
                index = newIndex;
                return true;
            } else {
                Index newIndex = new Index(nextMonth, index.getYear(), Double.parseDouble(value));
                YearSeries.addSeriesDataPoint(newIndex.getMonth(), newIndex.getValue());
                indexData.add(newIndex.toString());
                index = newIndex;
                return true;
            }
        } catch (NumberFormatException e) {
            return false;
        }
    }
    
}
