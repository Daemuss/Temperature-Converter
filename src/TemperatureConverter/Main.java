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

        converter.celciusToFahrenheit(10);
        float result = converter.getFahrenheit();

        System.out.println(result);
    }

    public static void main(String[] args)
    {
        if(args.length > 0 && args[0] == "test")
        {
            test();
        }

        launch(args);
    }
}
