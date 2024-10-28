/**
* enum FlowerColor
*/
package com.example.demo; // no violation
/*
* yea
*/

public enum FlowerColor {
    /**
     * Flower colors.
     */
    RED("#FF0000"), BLUE("#0000FF");
    private final String stringRepresentation;

    FlowerColor(String stringRepresentation) {
        this.stringRepresentation = stringRepresentation;
    }

    @Override
    public String toString() {
          /**
   * Some description here.
   */
        return stringRepresentation;
    }
}
