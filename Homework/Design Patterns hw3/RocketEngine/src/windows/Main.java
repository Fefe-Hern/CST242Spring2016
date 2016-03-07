package windows;

import java.awt.BorderLayout;
import javafx.application.Application;
import javafx.beans.value.ChangeListener;
import javafx.beans.value.ObservableValue;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.scene.Group;
import javafx.scene.Scene;
import javafx.scene.chart.CategoryAxis;
import javafx.scene.chart.LineChart;
import javafx.scene.chart.NumberAxis;
import javafx.scene.chart.XYChart;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.Slider;
import javafx.scene.layout.BorderPane;
import javafx.scene.layout.HBox;
import javafx.scene.layout.StackPane;
import javafx.stage.Stage;
import rocketSubjectObserver.RateObserver;
import rocketSubjectObserver.Subject;
import rocketSubjectObserver.ThrustObserver;

/**
 *
 * @author Fefe-Hern <https://github.com/Fefe-Hern>
 */
public class Main extends Application {

    Slider slider = new Slider(0, 100, 50);
    Label sliderLabel = new Label("Peak Time");
    Label incrementLabel = new Label(Double.toString(slider.getValue()));
    Subject subject = new Subject();
    RateObserver rateObserver = new RateObserver(subject);
    ThrustObserver thrustObserver = new ThrustObserver(subject);
    BorderPane border;
    NumberAxis xAxis;
    NumberAxis yAxis;
    LineChart<Number, Number> rateLineChart;
    LineChart<Number, Number> thrustLineChart;

    @Override
    public void start(Stage primaryStage) {
        slider.setShowTickLabels(true);
        slider.setShowTickMarks(true);
        //slider.setMajorTickUnit(30);
        //slider.setMinorTickCount(5);
        //slider.setBlockIncrement(10);
        //slider.setMax(60);
        
        slider.setMajorTickUnit(0.2);
        slider.setMinorTickCount(1);
        slider.setBlockIncrement(0.5);
        slider.setMax(1.0);
        slider.setValue(0.5);
        subject.setState(0.5);
        
        slider.valueProperty().addListener(new ChangeListener<Number>(){
            @Override
            public void changed(ObservableValue<? extends Number> observable, Number oldValue, Number newValue) {
                incrementLabel.setText(String.format("%.2f minutes", newValue));
                subject.setState(slider.getValue());
                inputRateLineChartData();
                inputThrustLineChartData();
            }
        });
        
        
        xAxis = new NumberAxis();
        yAxis = new NumberAxis();
        xAxis.setLabel("Time (Min)");
        yAxis.setLabel("Rate");
        rateLineChart = new LineChart<>(xAxis,yAxis);
        rateLineChart.setTitle("Burn Rate Monitoring");
        inputRateLineChartData();
        
        xAxis = new NumberAxis();
        yAxis = new NumberAxis();
        xAxis.setLabel("Time (Min)");       
        yAxis.setLabel("Thrust");       
        thrustLineChart = new LineChart<>(xAxis,yAxis);
        thrustLineChart.setTitle("Thrust Monitoring");
        inputThrustLineChartData();
        
        
        border = new BorderPane();
        HBox sliderPane = new HBox(sliderLabel, slider, incrementLabel);
        border.setBottom(sliderPane);
        HBox chartPane = new HBox(rateLineChart, thrustLineChart);
        border.setCenter(chartPane);
        
        Scene scene = new Scene(border, 700, 450);
        primaryStage.setTitle("Rocket Engine Ignition");
        primaryStage.setScene(scene);
        primaryStage.show();
    }

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        launch(args);
    }
    
    private void inputRateLineChartData() {
        rateLineChart.getData().clear();
        XYChart.Series series = new XYChart.Series();
        for (int i = 0; i < rateObserver.getRates().length; i++) {
            series.getData().add(new XYChart.Data(i/10, rateObserver.getRates(i/10)));
            
        }
        rateLineChart.getData().add(series);
    }

    private void inputThrustLineChartData() {
        thrustLineChart.getData().clear();
        XYChart.Series series = new XYChart.Series();
        for (int i = 0; i < thrustObserver.getThrusts().length; i++) {
            series.getData().add(new XYChart.Data(i/10, thrustObserver.getThrusts(i/10)));
            
        }
        thrustLineChart.getData().add(series);
    }
    
}
