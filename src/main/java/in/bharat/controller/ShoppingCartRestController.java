package in.bharat.controller;

import in.bharat.entity.Customer;
import in.bharat.entity.Order;
import in.bharat.entity.Product;
import in.bharat.service.CustomerService;
import in.bharat.service.OrderService;
import in.bharat.service.ProductService;
import lombok.Data;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@Data
@RequestMapping("/api/shoppingCart")
public class ShoppingCartRestController
{
    /* Note:
    *       Below Operations are for Customer:
    *       ----------------------------------
    */
    @Autowired
    private CustomerService customerService;

    @GetMapping("/customerDetails")
    public List<Customer> getAllCustomers()
    {
        return customerService.getAllCustomers();
    }

    @PostMapping("/customerSave")
    public Customer saveCustomer(@RequestBody Customer customer)
    {
        return customerService.saveCustomer(customer);
    }

    @PutMapping("/customerUpdate/{customerId}")
    public Customer updateCustomerById(@PathVariable("customerId") Integer id, @RequestBody Customer customer)
    {
        Customer existingCustomer = customerService.getCustomerById(id);
        if(existingCustomer == null)
        {
            return null;
        }
        else
        {
            existingCustomer.setName(customer.getName());
            existingCustomer.setEmail(customer.getEmail());
            existingCustomer.setMobile(customer.getMobile());
            existingCustomer.setAddress(customer.getAddress());

            return customerService.saveCustomer(existingCustomer);
        }

    }

    @DeleteMapping("/customerDelete/{customerId}")
    public void deleteCustomerById(@PathVariable("customerId") Integer id)
    {
        customerService.deleteCustomerById(id);
    }

    /* Note:
     *       Below Operations are for Product:
     *       ----------------------------------
     */
    @Autowired
    private ProductService productService;

    @GetMapping("/productDetails")
    public List<Product> getAllProducts()
    {
        return productService.getAllProducts();
    }

    @PostMapping("/productSave")
    public Product saveProduct(@RequestBody Product product)
    {
        return productService.saveProduct(product);
    }

    @PutMapping("/productUpdate/{productId}")
    public Product updateProductById(@PathVariable("productId") Integer id, @RequestBody Product product)
    {
        Product existingProduct = productService.getProductById(id);
        if(existingProduct == null)
        {
            return null;
        }
        else
        {
            existingProduct.setName(product.getName());
            existingProduct.setPrice(product.getPrice());
            existingProduct.setBrand(product.getBrand());
            existingProduct.setDescription(product.getDescription());

            return productService.saveProduct(existingProduct);
        }

    }

    @DeleteMapping("/productDelete/{productId}")
    public void deleteProductById(@PathVariable("productId") Integer id)
    {
        productService.deleteProductById(id);
    }

    /* Note:
     *       Below Operations are for Order:
     *       ----------------------------------
     */
    @Autowired
    private OrderService orderService;

    @GetMapping("/orderDetails")
    public List<Order> getAllOrders()
    {
        return orderService.getAllOrders();
    }

    @PostMapping("/orderSave")
    public Order saveOrder(@RequestBody Order order)
    {
        return orderService.saveOrder(order);
    }

    @PutMapping("/orderUpdate/{orderId}")
    public Order updateOrderById(@PathVariable("orderId") Integer id, @RequestBody Order order)
    {
        Order existingOrder = orderService.getOrderById(id);
        if(existingOrder == null)
        {
            return null;
        }
        else
        {
            existingOrder.setCustomerName(order.getCustomerName());
            existingOrder.setProductName(order.getProductName());
            existingOrder.setPaymentMode(order.getPaymentMode());
            existingOrder.setPaymentStatus(order.getPaymentStatus());
            existingOrder.setPrice(order.getPrice());

            return orderService.saveOrder(existingOrder);
        }
    }

    @DeleteMapping("/orderDelete/{orderId}")
    public void deleteOrderById(@PathVariable("orderId") Integer id)
    {
        orderService.deleteOrderById(id);
    }

    /* Note:
     *       Below Operations are for ShoppingCart:
     *       ----------------------------------
     */
}
