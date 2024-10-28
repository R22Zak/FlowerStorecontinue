/**
 * Represents a Chamomile flower.
 */
package com.example.demo;

/**
 * Class representing Chamomile flower.
 */
public final class Chamomile extends Flower {
    
    /**
     * Type of flower, set to CHAMOMILE.
     */
    private final FlowerType flowerType = FlowerType.CHAMOMILE;

    /**
     * Gets the type of flower.
     *
     * @return the type of flower
     */
    public FlowerType getFlowerType() {
        return flowerType;
    }
}