package data;

import java.util.ArrayList;
import javafx.scene.chart.XYChart;
import javafx.scene.chart.XYChart.Data;


/**
 *
 * @author Fefe-Hern <https://github.com/Fefe-Hern>
 */
public class YearSeries {
    private static final int YEAR2006 = 0; //Start the index at 2006
    private static ArrayList<XYChart.Series> seriesList;
    private static XYChart.Series series;
    
    /**
     * Creates the first stock instance which is within the year 2006 along with the
     *  list to hold future values.
     */
    public static void initializeYearList() {
        seriesList = new ArrayList<>();
        series = new XYChart.Series<>();
        series.setName("2006");
    }
    /**
     * 
     */
    public static void addSeriesDataPoint(String month, double value) {
        seriesList.remove(series);
        series.getData().add(new Data(month, value));
        seriesList.add(series);
    }
    /**
     * Should the years be the same, this method will return true to append
     * the data point to the current year. Otherwise, it will create a new 'line' or
     *  'bar' series which is a new year and append it to that new series.
     * @param year The year of the current data point.
     * @return True if the years match.
     */
    public static boolean compareYearToCurrentSeries(String year) {
        return series.getName().equals(year);
    }
    public static int getLengthOfList() {
        return seriesList.size();
    }
    /**
     * Creates a new line/bar series of the next year.
     * @param year The new year to create a series of.
     */
    public static void addYear(String year) {
        series = new XYChart.Series<>();
        series.setName(year);
    }
    public static XYChart.Series getSeries(int i) {
        return seriesList.get(i);
    }
}
