package demo;

import java.util.Date;

public class DateTemp {
    private Date date;
    private double temperature; // temperature in Kelvin

    public DateTemp(Date date, double temperature) {
        this.date = date;
        this.temperature = temperature;
    }

    public Date getDate() {
        return date;
    }

    public void setDate(Date date) {
        this.date = date;
    }

    public double getTemperature() {
        return temperature;
    }

    public void setTemperature(double temperature) {
        this.temperature = temperature;
    }

    @Override
    public String toString() {
        return "DateTemp{" +
                "date=" + date +
                ", temperature=" + temperature +
                '}';
    }
}