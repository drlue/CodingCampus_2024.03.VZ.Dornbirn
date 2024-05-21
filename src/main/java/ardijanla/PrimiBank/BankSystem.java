package ardijanla.PrimiBank;

import ardijanla.ConsoleColors;
import ardijanla.PrimiBank.DAOs.CustomerDAO;
import ardijanla.PrimiBank.models.Bank;
import ardijanla.PrimiBank.models.Customer;
import ardijanla.PrimiBank.services.BankService;
import ardijanla.PrimiBank.services.CustomerService;

import java.io.Console;
import java.util.List;

public class BankSystem {
    public static void main(String[] args) {

        BankService bankService = new BankService();
        CustomerService customerService = new CustomerService();
        CustomerDAO cusster = new CustomerDAO();


        List<Bank> bankList = bankService.getAllBanks();

        for (Bank bankl : bankList) {
            System.out.println(bankl.getName());
        }

        List<Customer> customers = customerService.getAllCustomers();

        for (Customer x : customers) {
            System.out.println(x.getName());

        }
        System.out.println(ConsoleColors.BLUE);
        System.out.println(customerService.getCustomerbyId(3).getName());


        System.out.println(customerService.getCustomerById(4).getName());

        System.out.println(customerService.getCustomerCount());


    }
}
