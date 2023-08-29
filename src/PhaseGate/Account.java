package PhaseGate;

public class Account {
    private  String pin;
    private  String accountName;
    private final String accountNumber;
    private int balance;

    public Account(String firstName, String lastName, String accountNumber, String pin) {
        String name = firstName + " " + lastName;
        this.pin = pin;
        this.accountNumber = accountNumber;
        this.accountName = name;
    }
    public void setPin(String oldPin, String pin) {
        if (validate(oldPin)){
        this.pin = pin;}
    }
    public void setAccountName(String firstName, String lastName, String pin) {
        String newName = firstName + " " + lastName;
        if (validate(pin)){
        this.accountName = newName;}
    }
    public boolean validate( String newPin){
        return pin.equals(newPin);
    }

    public void deposit(int amount) {
        if (validate(pin)){
            balance += amount;}
    }
    public String getAccountNumber() {
        return this.accountNumber;
    }

    public int getBalance(String pin) {
        if (validate(pin)){
        return balance;
    }
        return 0;}

    public void withDraw(int i, String pin) {
        if (validate(pin) && i < balance){
            balance-= i;}
    }
    public String getAccountName() {
        return this.accountName;
    }

    public String getPin() {
        return pin;
    }
}
