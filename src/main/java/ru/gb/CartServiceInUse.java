package ru.gb;

import org.springframework.stereotype.Service;

@Service
public class CartServiceInUse implements CartService{

    private final ProductRepository productRepository;

    public CartServiceInUse(ProductRepository pr) {
        this.productRepository = pr;
    }
    @Override
    public Cart getNewCart() {
        return null;
    }

    @Override
    public void addProduct(Cart cart, Product product, Integer quantity) {
        cart.addProduct(product, quantity);
    }

    @Override
    public void addProductID(Cart cart, Integer id, Integer quantity) {
        Product product = productRepository.findById(id);
        this.addProduct(cart, product, quantity);
    }

    @Override
    public void delProduct(Cart cart, Product product, Integer quantity) {
        cart.deleteProduct(product, quantity);
    }

    @Override
    public float getSum(Cart cart) {
        return 0;
    }
}
