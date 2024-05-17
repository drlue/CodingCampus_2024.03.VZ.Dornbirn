package christian.week11SQLOOPBank;

import christian.week11SQLOOPBank.model.Account;
import christian.week11SQLOOPBank.model.Bank;

import java.util.ArrayList;
import java.util.List;

public class Banksystem {

    private static List<Bank> listOfBanks;


    public static void main(String[] args) {

    }

    public Banksystem() {
        listOfBanks = new ArrayList<>();
    }

    public static void addBankToList(Bank bank) {
        if (!listOfBanks.contains(bank)) {
            listOfBanks.add(bank);
        }
    }

    public static Bank getBankByID(int id) {
        for (Bank bank : listOfBanks) {
            if (bank.getId() == id) {
                return bank;
            }
        }
        return null;
    }
}
