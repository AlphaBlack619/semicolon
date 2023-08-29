package PhaseGate;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class AccountTest {
    Bank bank = new Bank("UBA");
    @BeforeEach
    @Test
    void canDeposit(){
        Account account;
        account = new Account("Alpha","Iniobong",bank.generateAccountNumber(),"Pin");
        account.deposit(5000);
        assertEquals(5000,account.getBalance("Pin"));
    }
    @Test
    void canWithDraw(){
        Account account = new Account("Alpha","Alpha",bank.generateAccountNumber(),"Pin");
        account.deposit(5000);
        account.withDraw(3000,"Pin");
        assertEquals(2000,account.getBalance("Pin"));
    }

    @Test
    void canValidatePin() {
        Account account1 = new Account("Alpha","Moyin",bank.generateAccountNumber(),"Pin1");
        assertTrue(account1.validate("Pin1"));
    }

    @Test
    void canGetAccountNumber() {
        Account account2 = new Account("Alpha","Akpan",bank.generateAccountNumber(),"pin");
        Bank bank = new Bank("Nero");
        bank.register(account2);
        assertSame(bank.findAccount(account2.getAccountNumber()).getAccountNumber(),account2.getAccountNumber());
    }

    @Test
    void canGetBalance() {
        Account account = new Account("Alpha","Akpan",bank.generateAccountNumber(),"pin");
        assertEquals(0,account.getBalance("pin"));
    }

    @Test
    void setPin() {
        Account account = new Account("Alpha","Akpan",bank.generateAccountNumber(),"pin");
        account.setPin("pin","newPin");
        assertSame("newPin",account.getPin());
    }

    @Test
    void setAccountName() {
        Account account = new Account("Alpha","Nero",bank.generateAccountNumber(),"pin");
        account.setAccountName("Alpha","Black","pin");
        String name = "Alpha Black";
        assertEquals(name,account.getAccountName());

    }

    @Test
    void getAccountName() {
        Account account = new Account("Alpha","Nero",bank.generateAccountNumber(),"pin");
        String name = "Alpha Nero";
        assertEquals(name,account.getAccountName());
    }
}