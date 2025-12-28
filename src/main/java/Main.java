import model.*;
import model.constants.*;
import Service.ShoppingCart;

public class Main {
    public static void main(String[] args) {
        // Создаем продукты
        Meat meat = new Meat(5, 100);
        Apple redApples = new Apple(10, 50, Colour.red);
        Apple greenApples = new Apple(8, 60, Colour.green);

        // Создаем массив продуктов
        Food[] foods = {meat, redApples, greenApples};

        // Создаем корзину
        ShoppingCart cart = new ShoppingCart(foods);

        // Выводим результаты
        System.out.println("Общая сумма товаров без скидки: " +
                cart.getTotalPriceWithoutDiscount() + " рублей");

        System.out.println("Общая сумма товаров со скидкой: " +
                cart.getTotalPriceWithDiscount() + " рублей");

        System.out.println("Сумма всех вегетарианских продуктов без скидки: " +
                cart.getVegetarianTotalPriceWithoutDiscount() + " рублей");
    }
}