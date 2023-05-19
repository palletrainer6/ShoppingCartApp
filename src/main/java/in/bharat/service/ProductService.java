package in.bharat.service;

import in.bharat.entity.Product;
import in.bharat.repository.IProductRepository;
import lombok.Data;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@Data
public class ProductService
{
    @Autowired
    private IProductRepository iProductRepository;

    // Read, Save, Delete:

    // Read all the products:
    public List<Product> getAllProducts()
    {
        return iProductRepository.findAll();
    }

    // Save product:
    public Product saveProduct(Product customer)
    {
        return iProductRepository.save(customer);
    }

    // Read product By id:
    public Product getProductById(Integer id)
    {
        return iProductRepository.findById(id).orElse(null);
    }

    // Delete product By id:
    public void deleteProductById(Integer id)
    {
        iProductRepository.deleteById(id);
    }

}
