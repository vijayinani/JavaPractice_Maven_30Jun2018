package demo;

import java.util.List;

// Questions
// 1) Implement interface to return hourly temperature forecast
//    for next 48 hours. Temperatures must increase from 7am to 6pm by a random increment 0 - 0.5 every hour. 
//    Then decrease from 7 pm to 6 am by a random value between 0 - 0.5 every hour. Repeat
//    Start at 15 deg C. Return temperatures in K (C + 273).
// 2) Write a unit test for 1)

public interface WeatherAccess {
    public List<DateTemp> hourlyTemperature();
}