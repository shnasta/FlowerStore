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

    public Flower() {
    }

    public Flower(final double price, final FlowerColor color, final double sepalLength) {
        this.price = price;
        this.color = color;
        this.sepalLength = sepalLength;
    }
}
