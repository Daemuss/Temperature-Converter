package TemperatureConverter;

import javafx.geometry.Insets;
import javafx.scene.layout.GridPane;

import javafx.scene.control.*;

public class Pane
{
    private Label lblHeader, lblCelsius, lblFahrenheit, lblKelvin;
    private TextField txtCelcius, txtFahrenheit, txtKelvin;
    private Button btnSubmit, btnCancel;

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
        lblHeader = new Label("Temperature Converter");
        lblCelsius = new Label("Celsius: ");
        lblFahrenheit = new Label("Fahrenheit: ");
        lblKelvin = new Label("Kelvin: ");

        txtCelcius = new TextField();
        txtFahrenheit = new TextField();
        txtKelvin = new TextField();

        btnSubmit = new Button("OK");
        btnCancel = new Button("Cancel");
    }

    // Add the FX components to the grid pane
    private void addToGridPane(GridPane p)
    {
        p.add(lblHeader, 0, 0);
        p.add(lblCelsius, 0, 1);
        p.add(lblFahrenheit, 0, 2);
        p.add(lblKelvin, 0, 3);

        p.add(txtCelcius, 1, 1);
        p.add(txtFahrenheit, 1, 2);
        p.add(txtKelvin, 1, 3);

        p.add(btnSubmit, 0, 4);
        p.add(btnCancel, 1, 4);
    }

    // OK button to convert celsius to other temperatures
    private void convertCelsiusEvent()
    {
        btnSubmit.setOnAction(event -> {
            float celsiusValue = Float.parseFloat(txtCelcius.getText());
            Converter converter = new Converter();
            Temperature temp = converter.convertCelsius(celsiusValue);
            txtFahrenheit.setText(String.valueOf(temp.fahrenheit));
            txtKelvin.setText(String.valueOf(temp.kelvin));
        });
    }

    // Cancel button to empty the fields
    private void cancelButtonEvent()
    {
        btnCancel.setOnAction(event -> {
            txtCelcius.setText("");
            txtFahrenheit.setText("");
            txtKelvin.setText("");
        });
    }
}
