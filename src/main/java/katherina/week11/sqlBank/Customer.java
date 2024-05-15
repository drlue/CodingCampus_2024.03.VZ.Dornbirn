package katherina.week11.sqlBank;

import java.util.ArrayList;
import java.util.List;

public class Customer {
    private int iD;
    private String name;
    private String surname;
    private float balance;
    private List<Customer> customerList;

    public Customer(){
    }

    public Customer(String name, String surname,float balance){
        this.name=name;
        this.surname=surname;
        this.balance=balance;
        this.customerList=new ArrayList<>();
    }

    public void addCustomer(Customer customer){
        if (!customerList.contains(customer)){
            customerList.add(customer);
        }
    }

    public void setName(String name) {
        this.name=name;
    }

    public void setSurname(String surname) {
        this.surname = surname;
    }

    public void setBalance(float balance) {
        this.balance = balance;
    }
}
