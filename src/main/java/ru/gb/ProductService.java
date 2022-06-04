package ru.gb;

import java.util.List;
import ru.gb.Product;

public interface ProductService {


    List<Product> getProductList();

    Product getProductById(int id);

    void deleteById(int id);
}
