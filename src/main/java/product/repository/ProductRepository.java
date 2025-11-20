package product.repository;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import product.model.Product;


import java.util.List;

@Repository
public interface ProductRepository extends JpaRepository<Product, Integer> {

    /*findAll()
    findById(id)
    save(entity)
    deleteById(id)*/

    // find all products by category
    List<Product> findByProductCategory(String productCategory);

    // Find a product by SKU
    Product findBySku(String sku);

}
