package ru.gb;

import org.springframework.stereotype.Component;

import javax.annotation.PostConstruct;
import java.util.List;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;

@Component
public class ProductRepository {

    private final Map<Long, Product> productMap = new ConcurrentHashMap<>();

    @PostConstruct
    private void init() {
        productMap.put(1L, new Product(14,"Coconut", 10));
        productMap.put(2L, new Product(22,"Pineapple", 12));
        productMap.put(3L, new Product(14,"Coconut", 10));
        productMap.put(4L, new Product(37,"Milk", 2));
        productMap.put(5L, new Product(98,"Butter", 3.5f));
    }
}
