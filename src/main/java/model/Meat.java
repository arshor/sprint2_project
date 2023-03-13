package model;

import static model.constants.Discount.DISCOUNT_ZERO;

public class Meat extends Food {

    public Meat(int amount, double price) {
        this.amount = amount;
        this.price = price;
        this.isVegetarian = false;
    }

}
