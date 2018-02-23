package com.experiment_classes;

import com.spring_parody.MyAnnotations.MyService;

@MyService("car-car")
public class Car {
    private String color;
    private String mark;
    private int number;

    public Car(String color, String mark, int number) {
        this.color = color;
        this.mark = mark;
        this.number = number;
    }

    public Car() {
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public String getMark() {
        return mark;
    }

    public void setMark(String mark) {
        this.mark = mark;
    }

    public int getNumber() {
        return number;
    }

    public void setNumber(int number) {
        this.number = number;
    }

    @Override
    public String toString() {
        return "Car{" +
                "color='" + color + '\'' +
                ", mark='" + mark + '\'' +
                ", number=" + number +
                '}';
    }
}
