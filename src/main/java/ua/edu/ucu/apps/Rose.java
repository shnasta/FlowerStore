package ua.edu.ucu.apps;

public class Rose extends Flower {
    public Rose() {
        super();
    }

    public Rose(final double price, final FlowerColor color, final double sepalLength) {
        super(FlowerType.ROSE, price, color, sepalLength);
    }
}
