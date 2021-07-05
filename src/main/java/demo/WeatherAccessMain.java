package demo;

import demo.impl.WeatherAccessImpl;

public class WeatherAccessMain {

    public static void main(String[] args) {
        WeatherAccess weatherAccess = new WeatherAccessImpl();
        System.out.println(weatherAccess.hourlyTemperature());
    }
}
