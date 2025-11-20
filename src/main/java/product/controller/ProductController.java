package product.controller;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import product.service.ProductService;
import product.dto.ProductResponseDto;




@RestController
@RequestMapping("/api/products")            // base
public class ProductController {

    @Autowired
    private final ProductService productService;

    // constructor injection (Spring will inject ProductService)
    public ProductController(ProductService productService) {
        this.productService = productService;
    }

    // GET /api/products
    // GET /api/products?category=men
    @GetMapping
    public List<ProductResponseDto> getProducts(
            @RequestParam(required = false) String category
    ) {
        return productService.getProducts(category);
    }

    // GET /api/products/{id}
    package product.controller;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import product.service.ProductService;
import product.dto.ProductResponseDto;




    @RestController
    @RequestMapping("/api/products")            // base
    public class ProductController {

        @Autowired
        private final ProductService productService;

        // constructor injection (Spring will inject ProductService)
        public ProductController(ProductService productService) {
            this.productService = productService;
        }

        // GET /api/products
        // GET /api/products?category=men
        @GetMapping
        public List<ProductResponseDto> getProducts(
                @RequestParam(required = false) String category
        ) {
            return productService.getProducts(category);
        }

        // GET /api/products/{id}
        @GetMapping("/{id}")
        public ResponseEntity<ProductResponseDto> getProductById(@PathVariable int id) {
            return productService.getProductById(id)
                    .map(ResponseEntity::ok)                  // 200 + product
                    .orElse(ResponseEntity.notFound().build()); // 404 if not found
        }
    }

}
