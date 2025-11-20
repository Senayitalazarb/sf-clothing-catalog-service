package product.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import product.dto.ProductMapper;
import product.dto.ProductResponseDto;
import product.model.Product;
import product.repository.ProductRepository;

import java.util.List;

@Service
public class ProductService {

    @Autowired
    private ProductRepository productRepository;

    public List<ProductResponseDto> getAllProducts() {

        return productRepository.findAll().stream()
                .map(ProductMapper::toDto)
                .toList();
    };

    public List<ProductResponseDto> getProducts(String category) {
        if (category == null) {
            return productRepository.findAll().stream().map(ProductMapper::toDto).toList();
        } else {
            return productRepository.findByProductCategory(category).stream().map(ProductMapper::toDto).toList();
        }
    }

    public ProductResponseDto getProductById( int id){
        return productRepository.findById(id).map(ProductMapper::toDto).orElse(null);
    }
}
