package ua.edu.ucu.apps;

import java.util.ArrayList;

public class FlowerStore {
    private final ArrayList<FlowerBucket> flowerBuckets = new ArrayList<>();

    public final void addFlowerBucket(FlowerBucket flowerBucket) {
        flowerBuckets.add(flowerBucket);
    }

    public final ArrayList<FlowerBucket> search(final FlowerType flowerType) {
        ArrayList<FlowerBucket> result = new ArrayList<>();
        for (FlowerBucket flowerBucket : flowerBuckets) {
            for (FlowerPack flowerPack : flowerBucket.getFlowerPacks()) {
                if (flowerPack.getFlowerType() == flowerType) {
                    result.add(flowerBucket);
                    break;
                }
            }
        }
        return result;
    }

}
