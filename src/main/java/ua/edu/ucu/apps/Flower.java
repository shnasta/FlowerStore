package ua.edu.ucu.apps;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class Flower {
    private FlowerType flowerType;
    private double price;
    private FlowerColor color;
    private double sepalLength;

    public String getColor() {
        return color.getColor();
    }

    public Flower() {
    }

    public Flower(final FlowerType flowerType, final double price, final FlowerColor color, final double sepalLength) {
        this.flowerType = flowerType;
        this.price = price;
        this.color = color;
        this.sepalLength = sepalLength;
    }
}
