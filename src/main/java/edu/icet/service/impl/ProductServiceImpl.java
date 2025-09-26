package edu.icet.service.impl;

import edu.icet.dto.Product;
import edu.icet.entity.ProductEntity;
import edu.icet.repository.ProductRepository;
import edu.icet.service.ProductService;
import lombok.RequiredArgsConstructor;
import org.modelmapper.ModelMapper;

import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;

@RequiredArgsConstructor
public class ProductServiceImpl implements ProductService {
    private final ProductRepository productRepository;
    private final ModelMapper mapper;

    public Product createProduct(Product product) {
        ProductEntity product1 = mapper.map(product, ProductEntity.class);
        ProductEntity saved = productRepository.save(product1);
        return mapper.map(saved, Product.class);
    }

    public Optional<Product> getProductById(Integer productId) {
        return productRepository.findById(productId)
                .map(product -> mapper.map(product, Product.class));
    }

    public List<Product> getAllProducts() {
        return productRepository.findAll()
                .stream()
                .map(product -> mapper.map(product, Product.class))
                .collect(Collectors.toList());
    }

    public Product updateProduct(Product dto) {
            return mapper.map(productRepository.save(mapper.map(dto, ProductEntity.class)), Product.class);
    }
}
