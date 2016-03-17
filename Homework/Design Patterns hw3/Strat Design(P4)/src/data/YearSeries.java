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
    
    public static void initializeYearList() {
        seriesList = new ArrayList<>();
        series = new XYChart.Series<>();
        series.setName("2006");
    }
    public static void addSeriesDataPoint(String month, double value) {
        seriesList.remove(series);
        series.getData().add(new Data(month, value));
        seriesList.add(series);
    }
    public static boolean compareYearToCurrentSeries(String year) {
        return series.getName().equals(year);
    }
    public static int getLengthOfList() {
        return seriesList.size();
    }
    public static void addYear(String year) {
        series = new XYChart.Series<>();
        series.setName(year);
    }
    public static XYChart.Series getSeries(int i) {
        return seriesList.get(i);
    }
}
