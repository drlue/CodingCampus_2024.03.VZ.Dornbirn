package ardijanla.PrimiBank.services;

import ardijanla.PrimiBank.DAOs.CustomerDAO;
import ardijanla.PrimiBank.models.Customer;

import java.util.Collection;
import java.util.List;
import java.util.Objects;
import java.util.stream.Collectors;

public class CustomerService {

    CustomerDAO customerDAO = new CustomerDAO();


    public List<Customer> getAllCustomers() {
        return customerDAO.getAllCustomers();
    }


    //get customer with jave List
    public Customer getCustomerbyId(int id) {

        Collection<Customer> customers = new CustomerDAO().getAllCustomers();

        List<Customer> result = customers.stream()
                .filter(a -> Objects.equals(a.getId(), id))
                .toList();
        return result.get(0);
    }


    //get customer with SQL
    public Customer getCustomerById(int id) {
        Customer customer = new CustomerDAO().getCustomerbyId(id);
        return customer;
    }


    public int getCustomerCount(){
        List<Customer> customers = new CustomerDAO().getAllCustomers();

        return customers.size();
    }

    public void addCustomer(Customer customer){
        CustomerDAO customer1 = new CustomerDAO();
        customer1.addCustomer(customer);

    }

}
