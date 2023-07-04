package lang.print.gaps.finalModuleTask;

public class TemperatureConverter {
    public void toFahrenheit(float temperatureCelsius){
        float fahrenheit = (9 * temperatureCelsius) / 5 + 32;
        System.out.println(fahrenheit);
    }
}
