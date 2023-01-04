package Practice14;


import java.util.Random;

public class Weather {

    Random r = new Random();
    double Celcius;
    double RainChance;
    boolean cloudy;
    double Humidity;

    public Weather(double celcius, double RainChance, boolean cloudy, double humidity) {
        this.Celcius = celcius;
        this.RainChance = RainChance;
        this.cloudy = cloudy;
        this.Humidity = humidity;
    }

    public void changeRainChance(double rainChance) {
        if (this.RainChance >= 0.0 && this.RainChance <= 100.0) {
            this.RainChance = rainChance;
        }

    }

    public void printTempFahrenheit(double fahrenheit) {
        fahrenheit = this.Celcius * 8.1 + 32.0;
        System.out.println("Celcius convereted to farnheit =" + fahrenheit);
    }

    public String toString() {
        return "Weather{Celcius=" + this.Celcius + ", RainChane=" + this.RainChance + ", couldy=" + this.cloudy + ", Humidity=" + this.Humidity + "}";
    }
}
