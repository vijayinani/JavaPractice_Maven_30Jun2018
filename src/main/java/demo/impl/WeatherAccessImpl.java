package demo.impl;

import demo.DateTemp;
import demo.WeatherAccess;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.Random;

public class WeatherAccessImpl implements WeatherAccess {

    Random random = new Random();

    @Override
    public List<DateTemp> hourlyTemperature() {
        int count = 0;
        double currTemp = 15.0;
        List<DateTemp> dateTempList = new ArrayList<>(48);
        Date date = new Date();
        while (count < 48) {
            int hours = date.getHours();
            if (hours >= 7 && hours < 18) {
                currTemp = currTemp + getNextTemperature();
            } else {
                currTemp = currTemp - getNextTemperature();
            }
            DateTemp dateTemp = new DateTemp(date, currTemp + 273.0);
            dateTempList.add(dateTemp);
            date = new Date(date.getTime() + (1000 * 3600));
            count++;
        }
        return dateTempList;
    }

    private double getNextTemperature() {
        return random.nextDouble() / 2.0;
    }
}
