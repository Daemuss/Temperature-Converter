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
        GridPane root = new GridPane();
        new Pane(root);

        primaryStage.setTitle("Hello World");
        primaryStage.setScene(new Scene(root, 300, 275));
        primaryStage.show();
    }

    public static void test()
    {
        Converter converter = new Converter();

        Temperature temp = converter.convertCelsius(10);

        System.out.println(temp.kelvin);
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
