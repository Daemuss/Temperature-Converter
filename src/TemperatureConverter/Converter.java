package TemperatureConverter;

public class Converter
{
    private Temperature temperature;
    private float getCelsiusTemp;

    // Constructor and setter for the celsius temperature
    public Converter(float celsius)
    {
        this.temperature = new Temperature();
        temperature.celsius = celsius;
        this.getCelsiusTemp = temperature.getCelsius();
    }

    // Convert celsius to fahrenheit
    public float celsiusToFahrenheit()
    {
        float fahrenheit;
        fahrenheit = (float) (this.getCelsiusTemp * 1.8 + 32);

        return fahrenheit;
    }

    // Convert celsius to kelvin
    public float celsiusToKelvin()
    {
        float kelvin;
        kelvin = (float) (this.getCelsiusTemp + 273.15);

        return kelvin;
    }
}
