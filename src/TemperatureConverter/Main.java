package TemperatureConverter;

import javafx.application.Application;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.layout.GridPane;
import javafx.stage.Stage;

public class Main extends Application {

    @Override
    public void start(Stage primaryStage) throws Exception
    {
        Parent root = new GridPane();
        primaryStage.setTitle("Hello World");
        primaryStage.setScene(new Scene(root, 300, 275));
        primaryStage.show();
    }

    public static void test()
    {
        Converter converter = new Converter(10);

        converter.setFahrenheit(32);
        float fahrenheit = converter.celsiusToFahrenheit();
        float kelvin = converter.celsiusToKelvin();

        System.out.println(converter.setFahrenheit(50));
    }

    public static void main(String[] args)
    {
//        if(args.length > 0 && args[0] == "test")
//        {
//            test();
//        }
        test();

        launch(args);
    }
}
