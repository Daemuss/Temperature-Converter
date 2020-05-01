package TemperatureConverter;

public class Converter
{
    // Calculation for celsius to fahrenheit
    private float celsiusToFahrenheit(float celsius)
    {
        float fahrenheit;
        fahrenheit = celsius * 1.8f + 32;

        return fahrenheit;
    }

    // Calculation for celsius to kelvin
    private float celsiusToKelvin(float celsius)
    {
        float kelvin;
        kelvin = celsius + 273.15f;

        return kelvin;
    }

    // Convert celsius to fahrenheit
    public Temperature convertCelsius(float celsius)
    {
        Temperature temperature = new Temperature(celsius, this.celsiusToFahrenheit(celsius), this.celsiusToKelvin(celsius));

        return temperature;
    }
}
