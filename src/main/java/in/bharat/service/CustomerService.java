package in.bharat.service;


import in.bharat.entity.Customer;
import in.bharat.repository.ICustomerRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;

import java.util.List;

@Service
public class CustomerService
{
    @Autowired
    private ICustomerRepository iCustomerRepository;


    public CustomerService(ICustomerRepository iCustomerRepository)
    {
        this.iCustomerRepository = iCustomerRepository;
    }

    // Read, Save, Delete:

    // Read all the customers:
    public List<Customer> getAllCustomers()
    {
        return iCustomerRepository.findAll();
    }

    // Save Customer:
    public Customer saveCustomer(Customer customer)
    {
        return iCustomerRepository.save(customer);
    }

    // Read Customer By id:
    public Customer getCustomerById(Integer id)
    {
        return iCustomerRepository.findById(id).orElse(null);
    }

    // Delete Customer By id:
    public void deleteCustomerById(Integer id)
    {
        iCustomerRepository.deleteById(id);
    }

}
