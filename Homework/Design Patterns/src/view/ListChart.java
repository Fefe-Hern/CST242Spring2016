package view;


import controller.IndexStrings;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Optional;
import javafx.application.Application;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.scene.Scene;
import javafx.scene.chart.CategoryAxis;
import javafx.scene.chart.LineChart;
import javafx.scene.chart.NumberAxis;
import javafx.scene.chart.XYChart;
import javafx.scene.chart.XYChart.Data;
import javafx.scene.chart.XYChart.Series;
import javafx.scene.control.Alert;
import javafx.scene.control.Alert.AlertType;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.ListView;
import javafx.scene.control.TextField;
import javafx.scene.control.TextInputDialog;
import javafx.scene.layout.BorderPane;
import javafx.stage.Modality;
import javafx.stage.Stage;
import model.YearSeries;

/**
 *
 * @author Fefe-Hern <https://github.com/Fefe-Hern>
 */
public class ListChart extends Application {

    private BorderPane border;
    private LineChart<String, Number> lineChart;
    private ListView<String> list;
    private ObservableList<String> items;
    private CategoryAxis xAxis;
    private NumberAxis yAxis;
    private Scene scene;
    private Series series;
    private Button newNodeButton;
    
    @Override
    public void start(Stage stage) {
        stage.setTitle("Design Pattern");
        createLayout();
        prepareLineChart();
        prepareListView();
        prepareButtonPane(stage);
        inputData();
        createScene();
        scene = new Scene(border, 800, 600);
        stage.setScene(scene);
        stage.show();
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
    
    private void inputData() {
        for(int i = 0; i < YearSeries.getLengthOfList(); i++) {
            series = YearSeries.getSeries(i);
            lineChart.getData().add(series);
        }
    }

    private void prepareListView() {
        list = new ListView<>();
        items = FXCollections.observableArrayList(IndexStrings.getIndexData());
        list.setItems(items);
    }
    
    private void prepareButtonPane(Stage stage) {
        newNodeButton = new Button("Add Next");
        newNodeButton.setOnAction((ActionEvent event) -> {
            TextInputDialog dialog = new TextInputDialog("");
            dialog.setTitle("Value Input");
            dialog.setHeaderText("Enter value for " + IndexStrings.getNextMonth());
            dialog.setContentText("Please enter a stock value:"
                    + "\nNote that the data point will remain in memory until the next one is added.");
            Optional<String> result = dialog.showAndWait();
            if (result.isPresent()) {
                if (IndexStrings.newIndex(IndexStrings.getNextMonthNumber(), result.get())) {
                    prepareLineChart();
                    prepareListView();
                    inputData();
                    createScene();
                } else {
                    Alert alert = new Alert(AlertType.WARNING);
                    alert.setTitle("Warning");
                    alert.setContentText("Invalid number entered");
                    alert.showAndWait();
                }
            }
        });
   }

    private void createScene() {
        border.setCenter(lineChart);
        border.setRight(list);
        border.setBottom(newNodeButton);
    }

}
