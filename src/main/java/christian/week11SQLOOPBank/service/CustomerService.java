package christian.week11SQLOOPBank.service;

import christian.week11SQLOOPBank.dao.CustomerDAO;

public class CustomerService {

    private CustomerDAO customerDAO;

    public CustomerService(){
        this.customerDAO = new CustomerDAO();
    }
}
