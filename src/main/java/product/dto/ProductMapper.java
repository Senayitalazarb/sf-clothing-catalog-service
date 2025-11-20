package product.dto;

import product.model.Product;

public class ProductMapper {

    public static ProductResponseDto toDto(Product product) {
        return new ProductResponseDto(
                product.getProductId(),
                product.getProductName(),
                product.getProductDescription(),
                product.getProductImageUrl(),
                product.getProductPrice()
        );
    }
}
