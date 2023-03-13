package model;

import static model.constants.Discount.*;
import static model.constants.Colour.*;

public class Apple extends Food {

    private String colour;

    public Apple(int amount, double price, String colour) {
        this.amount = amount;
        this.price = price;
        this.colour = colour;
        this.isVegetarian = true;
    }

    @Override
    public double getDiscount() {
        if (colour.equals(RED_APPLE)) {
            return DISCOUNT_RED_APPLE;
        }
        return DISCOUNT_ZERO;
    }

}
