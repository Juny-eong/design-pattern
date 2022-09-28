package org.example.observer;

import lombok.RequiredArgsConstructor;


@RequiredArgsConstructor
public class CurrentConditionsDisplay implements Observer, DisplayElement {
    private float temperature;
    private float humidity;
    private final WeatherData weatherData;

    @Override
    public void display() {
        System.out.println("--------- current display ----------");
        System.out.println("temperature: " + temperature + "F, humidity: " + humidity + "%");
    }

//    @Override
//    public void update(float temp, float humidity, float pressure) {
//        this.temperature = temp;
//        this.humidity = humidity;
//        display();
//    }
    @Override
    public void update() {
        this.temperature = weatherData.getTemperature();
        this.humidity = weatherData.getHumidity();
        display();
    }
}
