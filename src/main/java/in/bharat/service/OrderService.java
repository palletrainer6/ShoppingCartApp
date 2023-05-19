package in.bharat.service;

import in.bharat.entity.Order;
import in.bharat.repository.IOrderRepository;
import lombok.Data;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@Data
public class OrderService
{
    @Autowired
    private IOrderRepository iOrderRepository;

    // Read, Save, Delete:

    // Read all the products:
    public List<Order> getAllOrders()
    {
        return iOrderRepository.findAll();
    }

    // Save product:
    public Order saveOrder(Order order)
    {
        return iOrderRepository.save(order);
    }

    // Read product By id:
    public Order getOrderById(Integer id)
    {
        return iOrderRepository.findById(id).orElse(null);
    }

    // Delete product By id:
    public void deleteOrderById(Integer id)
    {
        iOrderRepository.deleteById(id);
    }
}
