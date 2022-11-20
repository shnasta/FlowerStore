package ua.edu.ucu.apps;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class FlowerPack {
    private Flower flower;
    private int amount;

    public FlowerPack(Flower flower, int amount) {
        setFlower(flower);
        setAmount(amount);
    }

    public double getPrice() {
        return amount * flower.getPrice();
    }
}
