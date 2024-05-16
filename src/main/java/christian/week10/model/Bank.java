package christian.week10.model;

import java.util.ArrayList;

public class Bank {
    private int id;
    private String name;
    private int established;
    private float assets;
    private ArrayList<Customer>listOfCustomers;
    private ArrayList<Account>listOfAccounts;

    public Bank (int id, String name, int established, float assets){
        this.id = id;
        this.name = name;
        this.established = established;
        this.assets = assets;
    }

    //================================================================================================get=========
    //================================================================================================set=========
    //================================================================================================add=========
    public void addCustomerToList(){

    }
    public void addAccountToList(){

    }
    //================================================================================================create=========
    //================================================================================================alter=========
    //================================================================================================remove=========
    //================================================================================================SQL=========

}
