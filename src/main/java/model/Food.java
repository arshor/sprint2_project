package model;

import static model.constants.Discount.DISCOUNT_ZERO;

public abstract class Food implements Discountable {
    protected int amount;
    protected double price;
    protected boolean isVegetarian;

    @Override
    public double getDiscount() {
        return DISCOUNT_ZERO;
    }

    public boolean isVegetarian() {
        return isVegetarian;
    }

    public int getAmount() {
        return amount;
    }

    public double getPrice() {
        return price;
    }
}
