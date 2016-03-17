package data;


import choice.Context;
import choice.MyChoice1;
import choice.MyChoice2;
import java.io.IOException;
import java.util.Optional;
import javafx.application.Application;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.event.ActionEvent;
import javafx.scene.Scene;
import javafx.scene.chart.BarChart;
import javafx.scene.chart.CategoryAxis;
import javafx.scene.chart.LineChart;
import javafx.scene.chart.NumberAxis;
import javafx.scene.chart.XYChart.Series;
import javafx.scene.control.Alert;
import javafx.scene.control.Alert.AlertType;
import javafx.scene.control.Button;
import javafx.scene.control.ButtonBar.ButtonData;
import javafx.scene.control.ButtonType;
import javafx.scene.control.ListView;
import javafx.scene.control.TextInputDialog;
import javafx.scene.layout.BorderPane;
import javafx.stage.Stage;

/**
 *
 * @author Fefe-Hern <https://github.com/Fefe-Hern>
 */
public class ListChart extends Application {

    private BorderPane border;
    private LineChart<String, Number> lineChart;
    private BarChart<String, Number> barChart;
    private ObservableList<String> items;
    private CategoryAxis xAxis;
    private NumberAxis yAxis;
    private Scene scene;
    private Series series;
    private Context context = new Context();
    int resultNum;
    
    @Override
    public void start(Stage stage) {
        stage.setTitle("Design Pattern");
        createOptionDialog();
        createLayout();
        switch(resultNum) {
            case 1:
                prepareLineChart();
                inputLineData();
                createLineScene();
                scene = new Scene(border, 800, 600);
                stage.setScene(scene);
                stage.show();
                break;
            case 2:
                prepareBarChart();
                inputBarData();
                createBarScene();
                scene = new Scene(border, 800, 600);
                stage.setMaximized(true);
                stage.setScene(scene);
                stage.show();
                break;
            default:
                break;
        }
    }

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) throws IOException {
        IndexStrings.setUpFiler();
        IndexStrings.readFile();
        launch(args);
    }

    private void createLayout() {
        border  = new BorderPane();
    }

    private void prepareLineChart() {
        xAxis = new CategoryAxis();
        yAxis = new NumberAxis();
        xAxis.setLabel("Month");       
        lineChart = new LineChart<>(xAxis,yAxis);
        lineChart.setTitle("Stock Monitoring");
    }

    private void prepareBarChart() {
        xAxis = new CategoryAxis();
        yAxis = new NumberAxis();
        xAxis.setLabel("Month");       
        barChart = new BarChart<>(xAxis,yAxis);
        barChart.setTitle("Stock Monitoring");
    }
    
    private void inputLineData() {
        for(int i = 0; i < YearSeries.getLengthOfList(); i++) {
            series = YearSeries.getSeries(i);
            lineChart.getData().add(series);
        }
    }
    
    private void inputBarData() {
        for(int i = 0; i < YearSeries.getLengthOfList(); i++) {
            series = YearSeries.getSeries(i);
            barChart.getData().add(series);
        }
    }

    private void createLineScene() {
        border.setCenter(lineChart);
    }
    private void createBarScene() {
        border.setCenter(barChart);
    }

    private void createOptionDialog() {
        Alert alert = new Alert(AlertType.CONFIRMATION);
        alert.setTitle("Choose type of graph.");
        alert.setHeaderText("Choose between a line and bar graph to display.");
        alert.setContentText("Choose your option.");

        ButtonType buttonTypeOne = new ButtonType("Line");
        ButtonType buttonTypeTwo = new ButtonType("Bar");
        ButtonType buttonTypeCancel = new ButtonType("Cancel", ButtonData.CANCEL_CLOSE);

        alert.getButtonTypes().setAll(buttonTypeOne, buttonTypeTwo, buttonTypeCancel);
        Optional<ButtonType> result = alert.showAndWait();
        if (result.get() == buttonTypeOne) {
            resultNum = context.setChoice(new MyChoice1());
        } else if (result.get() == buttonTypeTwo) {
            resultNum = context.setChoice(new MyChoice2());
        } else {
            // ... user chose CANCEL or closed the dialog
        }
    }

}
