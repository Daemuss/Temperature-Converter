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
        Converter converter = new Converter();

        float fahrenheit = converter.convertFahrenheit(10).fahrenheit;

        System.out.println(fahrenheit);
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
