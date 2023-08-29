package PhaseGate;

import java.util.ArrayList;
import java.util.List;

public class Bank {
    private final String bankName;
    private final List<Account> bankList;
    public Bank (String name){
        this.bankList = new ArrayList<Account>();
        this.bankName = name;
    }
    public String getBankName() {
        return bankName;
    }
    public void register(String firstName, String lastName, String pin){
        Account account = new Account(firstName,lastName,generateAccountNumber(),pin);
        bankList.add(account);
    }
    public void register(Account account){
        bankList.add(account);

    }

    public String generateAccountNumber() {
        int a = bankList.size() + 1;
        return "#" + a;
    }

    public Account findAccount(String number) {
        Account b = null;
        for (Account account: bankList) {
            if (account.getAccountNumber().equals(number)){
                b = account;}}
        return b;}

    public List<Account> getListOFCustomer() {
        return bankList;
    }

    public void deposit(String hashtag, int i) {
        findAccount(hashtag).deposit(i);
    }

    public void withDraw(String hashtag, int i, String pin) {
        findAccount(hashtag).withDraw(i,pin);
    }

    public void changeCustomerPin(String accountNumber, String newPin) {
        findAccount(accountNumber).setPin(findAccount(accountNumber).getPin(),newPin);
    }

    public void ChangeCustomerName(String hashtag, String firstName, String lastName, String pin) {
        findAccount(hashtag).setAccountName(firstName, lastName,pin);
    }
}
