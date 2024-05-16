package lukas.week11.Bank.Model;

import java.util.Date;

public class Transaction {
    private int id;
    private Date datetime;
    private int amount;
    private Account sender;
    private Account recipient;
    private String description;

}
