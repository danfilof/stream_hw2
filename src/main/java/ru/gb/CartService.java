package ru.gb;

public interface CartService {

    Cart getNewCart();

    void addProduct(Cart cart, Product product, Integer quantity);
    void addProductID(Cart cart, Integer id, Integer quantity);

    void delProduct(Cart cart, Product product, Integer quantity);

    float getSum(Cart cart);
}
