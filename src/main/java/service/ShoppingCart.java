package service;

import model.Food;

public class ShoppingCart {
    private Food[] foods;

    public ShoppingCart(Food[] foods) {
        this.foods = foods;
    }

    public double getTotalPriceWithoutDiscount() {
        double totalPrice = 0;
        for (Food food : foods) {
            totalPrice += food.getAmount() * food.getPrice();
        }
        return totalPrice;
    }

    public double getTotalPriceWithDiscount() {
        double totalPrice = 0;
        for (Food food : foods) {
            totalPrice += (food.getAmount() * food.getPrice()) * ((100 - food.getDiscount()) / 100);
        }
        return totalPrice;
    }

    public double getTotalPriceVegetarian() {
        double totalPrice = 0;
        for (Food food : foods) {
            if (food.isVegetarian()) {
                totalPrice += food.getAmount() * food.getPrice();
            }
        }
        return totalPrice;
    }
}
