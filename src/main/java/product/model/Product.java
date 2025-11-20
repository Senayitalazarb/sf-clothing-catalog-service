package product.model;

import lombok.*;
@NoArgsConstructor
@Getter
@Setter


public class Product {
    private int productId;
    private String productName;
    private String productDescription;
    private String productImageUrl;
    private double productPrice;
    private int productStock;
    private int productCategory;
    private String sku;



    public Product(int productId, String productName, String productDescription, String productImageUrl, double productPrice, int productStock, int productCategory, String sku) {
        this.productId = productId;
        this.productName = productName;
        this.productDescription = productDescription;
        this.productImageUrl = productImageUrl;
        this.productPrice = productPrice;
        this.productStock = productStock;
        this.productCategory = productCategory;
        this.sku = sku;

    }

}

