package ua.edu.ucu.apps;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class Flower {
    private double price;
    private FlowerColor color;
    private double sepalLength;

    public String getColor() {
        return color.getColor();
    }
}
