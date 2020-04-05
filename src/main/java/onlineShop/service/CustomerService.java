package onlineShop.service;

import onlineShop.dao.CustomerDAO;
import onlineShop.model.Customer;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class CustomerService {

    @Autowired
    private CustomerDAO customerDAO;

    public void addCustomer(Customer customer) {
        customerDAO.addCustomer(customer);
    }

    public Customer getCustomerByUsername(String username) {
        return customerDAO.getCustomerByUsername(username);
    }

}
