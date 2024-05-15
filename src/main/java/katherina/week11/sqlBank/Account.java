package katherina.week11.sqlBank;

import java.util.List;

public class Account {
    private int iD;
    private float balance;
    private List<Account> accountList;

public Account(){

}

    public void addAccount(Account account){
        if (!accountList.contains(account)){
            accountList.add(account);
        }
    }
}
