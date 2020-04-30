package TemperatureConverter;

public class Converter
{
    // Calculation for celsius to fahrenheit
    private float celsiusToFahrenheit(float celsius)
    {
        float fahrenheit;
        fahrenheit = (float) (celsius * 1.8 + 32);

        return fahrenheit;
    }

    // Calculation for celsius to kelvin
    private float celsiusToKelvin(float celsius)
    {
        float kelvin;
        kelvin = (float) (celsius + 273.15);

        return kelvin;
    }

    // Convert celsius to fahrenheit
    public Temperature convertFahrenheit(float celsius)
    {
        Temperature temperature = new Temperature(0, this.celsiusToFahrenheit(celsius), 0);

        return temperature;
    }
}
