package TemperatureConverter;

public class Converter
{
    private Temperature temperature;

    // Constructor
    public Converter(float celsius, float fahrenheit, float kelvin)
    {
        this.temperature = new Temperature(celsius, fahrenheit, kelvin);
    }

    public float getTemperatureCelsius()
    {
        return temperature.getTemperature().celsius;
    }

    // Convert celsius to fahrenheit
    public Temperature celsiusToFahrenheit()
    {
        float fahrenheit;
        fahrenheit = (float) (this.getTemperatureCelsius() * 1.8 + 32);
        Temperature temp = new Temperature(this.getTemperatureCelsius(), fahrenheit, 0);

        return temp;
    }

    // Convert celsius to kelvin
    public Temperature celsiusToKelvin()
    {
        float kelvin;
        kelvin = (float) (this.getTemperatureCelsius() + 273.15);
        Temperature temp = new Temperature(this.getTemperatureCelsius(), celsiusToFahrenheit().fahrenheit, kelvin);

        return temp;
    }
}
