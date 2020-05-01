package TemperatureConverter;

import javafx.geometry.Insets;
import javafx.scene.layout.GridPane;

import javafx.scene.control.*;

import java.text.NumberFormat;
import java.util.Locale;

public class Pane
{
    private Label labelHeader, labelCelsius, labelFahrenheit, labelKelvin;
    private TextField textfieldCelcius, textfieldFahrenheit, textfieldKelvin;
    private Button buttonSubmit, buttonCancel;

    public Pane(GridPane p)
    {
        this.setGridPaneSettings(p);
        this.createFXComponents();
        this.addToGridPane(p);
        this.convertCelsiusEvent();
        this.cancelButtonEvent();
    }

    // Set the grid pane settings
    private void setGridPaneSettings(GridPane p)
    {
        p.setPadding(new Insets(10, 10, 100, 10));
    }

    // Creates new FX components
    private void createFXComponents()
    {
        labelHeader = new Label("Temperature Converter");
        labelCelsius = new Label("Celsius: ");
        labelFahrenheit = new Label("Fahrenheit: ");
        labelKelvin = new Label("Kelvin: ");

        textfieldCelcius = new TextField();
        textfieldFahrenheit = new TextField();
        textfieldKelvin = new TextField();

        buttonSubmit = new Button("OK");
        buttonCancel = new Button("Cancel");
    }

    // Add the FX components to the grid pane
    private void addToGridPane(GridPane p)
    {
        p.add(labelHeader, 0, 0);
        p.add(labelCelsius, 0, 1);
        p.add(labelFahrenheit, 0, 2);
        p.add(labelKelvin, 0, 3);

        p.add(textfieldCelcius, 1, 1);
        p.add(textfieldFahrenheit, 1, 2);
        p.add(textfieldKelvin, 1, 3);

        p.add(buttonSubmit, 0, 4);
        p.add(buttonCancel, 1, 4);
    }

    // OK button to convert celsius to other temperatures
    private void convertCelsiusEvent()
    {
        buttonSubmit.setOnAction(event -> {
            textfieldCelcius.setStyle("-fx-background-color: white;-fx-text-inner-color: black;");
            try
            {
                float celsiusValue = Float.parseFloat(this.textfieldCelcius.getText());
                Converter converter = new Converter();
                Temperature temp = converter.convertCelsius(celsiusValue);
                NumberFormat numberFormat = NumberFormat.getNumberInstance(Locale.US);
                numberFormat.setMaximumFractionDigits(2);
                String fahrenheit = numberFormat.format(temp.fahrenheit);
                String kelvin = numberFormat.format(temp.kelvin);

                textfieldFahrenheit.setText(fahrenheit);
                textfieldKelvin.setText(kelvin);
            }
            catch(NumberFormatException e)
            {
                System.out.println(e);
                textfieldCelcius.setStyle("-fx-background-color: red;-fx-text-inner-color: white;");
            }
        });
    }

    // Cancel button to empty the fields
    private void cancelButtonEvent()
    {
        buttonCancel.setOnAction(event -> {
            textfieldCelcius.setText("");
            textfieldFahrenheit.setText("");
            textfieldKelvin.setText("");
        });
    }
}
