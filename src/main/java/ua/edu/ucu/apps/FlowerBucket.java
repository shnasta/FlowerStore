package ua.edu.ucu.apps;

import java.util.ArrayList;

public class FlowerBucket {
    private ArrayList<FlowerPack> flowerPacks = new ArrayList<>();

    public FlowerBucket() {
    }

    public FlowerBucket(final ArrayList<FlowerPack> newFlowerPacks) {
        this.flowerPacks = newFlowerPacks;
    }

    public final void addFlowerPack(final FlowerPack flowerPack) {
        flowerPacks.add(flowerPack);
    }

    public final double getPrice() {
        double price = 0;
        for (FlowerPack flowerPack : flowerPacks) {
            price += flowerPack.getPrice();
        }
        return price;
    }
}
