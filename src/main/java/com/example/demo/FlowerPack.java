/**
* class FlowerPack
*/
package com.example.demo; // no violation
/*
* yea
*/

import lombok.AllArgsConstructor;
import lombok.NoArgsConstructor;

@AllArgsConstructor
@NoArgsConstructor
public class FlowerPack {
    /**
   * Some description here
   */
    private Flower flower;
    private int quantity;

    
    public double getPrice() {
          /**
   * Some description here.
   */
        return flower.getPrice() * quantity;
    }
}
