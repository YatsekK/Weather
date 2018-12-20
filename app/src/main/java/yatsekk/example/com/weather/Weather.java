package yatsekk.example.com.weather;

public class Weather {
    private String temperature;
    private String comfortTemperature;
    private String humidity;
    private String barometr;
    private String wind;

    public Weather(String temperature, String comfortTemperature, String wind, String humidity) {
        this.temperature = temperature;
        this.comfortTemperature = comfortTemperature;
        this.wind = wind;
        this.humidity = humidity;
    }

    public String getHumidity() {
        return humidity;
    }

    public String getTemperature() {
        return temperature;
    }

    public String getComfortTemperature() {
        return comfortTemperature;
    }

    public String getWind() {
        return wind;
    }
}
