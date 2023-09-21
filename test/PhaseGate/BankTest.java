package PhaseGate;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class BankTest {
    Bank bank = new Bank("Alpha Bank");
    @BeforeEach
    @Test
    void checkCanRegisterCustomer() {
        bank.register("Alpha","Black","pin");
        assertNotNull(bank.getListOFCustomer());
    }
    @Test
    void canDepositForCustomers(){

        bank.register("Alpha","Black","pin");
        bank.deposit("#1",5000);
        assertEquals(5000,bank.findAccount("#1").getBalance("pin"));
    }
    @Test
    void canDepositForMoreThanTwoCustomers(){
        bank.register("Alpha","Black","pin");
        bank.deposit("#1",5000);
        assertEquals(5000,bank.findAccount("#1").getBalance("pin"));
        bank.register("Nero","White","pin");
        bank.deposit("#2",3000);
        assertEquals(3000,bank.findAccount("#2").getBalance("pin"));
        bank.register("Lucia","Victor","pin");
        bank.deposit("#3",2000);
        assertEquals(2000,bank.findAccount("#3").getBalance("pin"));
    }
    @Test
    void canWithdrawFromBank(){
        bank.register("Alpha","Black","pin");
        bank.deposit("#1",5000);
        bank.withDraw("#1",2000,"pin");
        assertEquals(3000,bank.findAccount("#1").getBalance("pin"));
    }
    @Test
    void canChangePinForCustomer(){
        bank.register("Alpha","Black","pin");
        bank.changeCustomerPin("#1","NewPin");
        assertSame("NewPin",bank.findAccount("#1").getPin());
    }
    @Test
    void canSetNameForCustomer(){
        bank.register("Alpha","Black","pin");
        bank.ChangeCustomerName("#1","Alpha","White","pin");
        assertEquals("Alpha White",bank.findAccount("#1").getAccountName());
    }

    @Test
    void testToString() {
    }
}