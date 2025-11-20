package product.dto;


import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class ProductResponseDto {
    private int productId;
    private String productName;
    private String productDescription;
    private String productImageUrl;
    private double productPrice;
    private int productStock;
    private int productCategory;   // categoryId
    private String sku;



    public ProductResponseDto(int productId, String productName, String productDescription, String productImageUrl, double productPrice) {
        this.productId = productId;
        this.productName = productName;
        this.productDescription = productDescription;
        this.productImageUrl = productImageUrl;
        this.productPrice = productPrice;
        this.productStock = 0;
        this.productCategory = 0;
        this.sku = "";

    }
}

