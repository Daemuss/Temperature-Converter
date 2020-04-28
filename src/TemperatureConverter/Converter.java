package TemperatureConverter;

public class Converter
{
    private float celcius, fahrenheit, kelvin;

    // Setters
    public void setCelcius(float value)
    {
        this.celcius = value;
    }

    public void celciusToFahrenheit(float value)
    {
        this.fahrenheit = (float) (value * 1.8 + 32);
    }

    public void celciusToKelvin(float value)
    {
        this.celcius = (float) (value + 273.15);
    }

    // Getters
    public float getCelcius()
    {
        return this.celcius;
    }

    public float getFahrenheit()
    {
        return this.fahrenheit;
    }

    public float getKelvin()
    {
        return this.kelvin;
    }
}
