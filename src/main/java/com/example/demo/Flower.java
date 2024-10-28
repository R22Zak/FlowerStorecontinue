/**
* class Flower
*/
package com.example.demo; // no violation
/*
* yea
*/
import lombok.Getter;
import lombok.Setter;

@Setter

public class Flower {
    @Getter
    /**
   * Some description here
   */
    private double sepalLength;
    private FlowerColor color;
    @Getter
    private double price;
    @Getter
    private FlowerType flowerType;

    public String getColor() {
          /**
   * Some description here.
   */
        return color.toString();
    }
}
