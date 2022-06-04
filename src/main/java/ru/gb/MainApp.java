package ru.gb;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class MainApp {

    public static void main(String[] args) {
        AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(AppConfig.class);

        ProductRepository pr = context.getBean(ProductRepository.class);
        Cart cart = context.getBean(Cart.class);
        Product product = new Product(10, "22", 11);
        CartServiceInUse cartServiceInUse = context.getBean(CartServiceInUse.class);
        System.out.println(cart);
        cartServiceInUse.addProduct(cart, product, 2);

        System.out.println(pr);
        System.out.println(cart);

        context.close();
    }
}
