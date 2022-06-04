package ru.gb;

import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ProductServiceInUse implements ProductService{

    private ProductRepository productRepository;

    @Override
    public List<Product> getProductList() {
        return  productRepository.getAll();
    }

    @Override
    public Product getProductById(int id) {
        return productRepository.findById(id);
    }

    @Override
    public void deleteById(int id) {
        productRepository.deleteById(id);
    }
}
