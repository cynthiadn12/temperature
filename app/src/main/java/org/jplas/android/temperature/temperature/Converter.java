package org.jplas.android.temperature.temperature;

public class Converter {
    private double temp; //Temperature in Celcius

    /* Default constructor that set temperature 0 Celcius Degree*/
    public Converter() {
        temp=0;
    }

    /* Constructor that set temperature into x Celcius Degree*/
    public Converter(double x) {
        temp = x;
    }

    /* Procedure to change the temperature value in x Celcius */
    public void setTemperature(double x) {
        temp = x;
    }

    /*Get the Celcius value of temp*/
    public double getCelcius() {
        return temp;
    }

    /*Get the Farenheit value of temp*/
    public double getFarenheit() {
        return (temp*1.8)+32.0;
    }

    /*Get the Kelvin value of temp*/
    public double getKelvin() {
        return temp+273.15;
    }
}
