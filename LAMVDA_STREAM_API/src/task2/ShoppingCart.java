// Переработать метод балансировки корзины товаров cardBalancing() с использованием Stream API


import java.util.List;

public class ShoppingCart {
    private List<Product> products;

    public double cardBalancing() {
        double totalBalance = products.stream()          	// Преобразуем список товаров в поток
                .mapToDouble(Product::getPrice)        		// Преобразуем каждый товар в его цену
                .sum();                                 			// Суммируем все цены товаров

        return totalBalance;
    }

}