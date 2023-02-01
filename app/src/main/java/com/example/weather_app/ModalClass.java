package com.example.weather_app;

public class ModalClass {

    public static String name;
    public String country;
    public String temp;
    public String feel;
    public String humidity;
    public String description;
    public String wind;
    public String cloud;
    public String pressure;

    public ModalClass(String name, String country, String temp, String feel, String humidity, String description, String wind, String cloud, String pressure) {
        this.name = name;
        this.country = country;
        this.temp = temp;
        this.feel = feel;
        this.humidity = humidity;
        this.description = description;
        this.wind = wind;
        this.cloud = cloud;
        this.pressure = pressure;
    }

    public ModalClass() {

    }

    public static String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getCountry() {
        return country;
    }

    public void setCountry(String country) {
        this.country = country;
    }

    public String getTemp() {
        return temp;
    }

    public void setTemp(String temp) {
        this.temp = temp;
    }

    public String getFeel() {
        return feel;
    }

    public void setFeel(String feel) {
        this.feel = feel;
    }

    public String getHumidity() {
        return humidity;
    }

    public void setHumidity(String humidity) {
        this.humidity = humidity;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public String getWind() {
        return wind;
    }

    public void setWind(String wind) {
        this.wind = wind;
    }

    public String getCloud() {
        return cloud;
    }

    public void setCloud(String cloud) {
        this.cloud = cloud;
    }

    public String getPressure() {
        return pressure;
    }

    public void setPressure(String pressure) {
        this.pressure = pressure;
    }
}
