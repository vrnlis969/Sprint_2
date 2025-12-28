package Service;

import model.Food;

public class ShoppingCart {
    private Food[] foods;

    public ShoppingCart(Food[] foods) {
        this.foods = foods;
    }

    // Общая сумма без скидки
    public double getTotalPriceWithoutDiscount() {
        double total = 0;
        for (Food food : foods) {
            total += food.getAmount() * food.getPrice();
        }
        return total;
    }

    // Общая сумма со скидкой
    public double getTotalPriceWithDiscount() {
        double total = 0;
        for (Food food : foods) {
            double discount = food.getDiscount();
            double discountedPrice = food.getPrice() * (100 - discount) / 100;
            total += food.getAmount() * discountedPrice;
        }
        return total;
    }

    // Сумма вегетарианских продуктов без скидки
    public double getVegetarianTotalPriceWithoutDiscount() {
        double total = 0;
        for (Food food : foods) {
            if (food.isVegetarian()) {
                total += food.getAmount() * food.getPrice();
            }
        }
        return total;
    }
}