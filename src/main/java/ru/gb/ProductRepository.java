package ru.gb;

import org.springframework.stereotype.Component;

import javax.annotation.PostConstruct;
import java.util.List;

@Component
public class ProductRepository {

    private List<Product> products;

    @PostConstruct
    private void init() {

    }
}
