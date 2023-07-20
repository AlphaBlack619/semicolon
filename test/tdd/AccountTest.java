package tdd;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class AccountTest {

    @Test
    public void canDepositIntoAccountTest() {
        Account nero = new Account("2222");
        int currentBalance = nero.getBalance("9898");
        //checkpoint
        assertEquals(0, currentBalance);
        nero.deposit(5000);
        // checkpoint
        currentBalance = nero.getBalance("2222");
        assertEquals(5000, currentBalance);
    }

    @Test
    public void canDepositTwiceTest() {
        Account nero = new Account("2222");
        nero.deposit(5000);
        int currentBalance = nero.getBalance("3333");
        assertEquals(0, currentBalance);
        // when
        nero.deposit(2000);
        // checkpoint
        int newBalance = nero.getBalance("2222");
        assertEquals(7000, newBalance);
    }

@Test
        public void canNotDepositNegativeValueTest() {
            Account nero = new Account("2222");
            nero.deposit(5000);
            int currentBalance = nero.getBalance("2222");
            assertEquals(5000, currentBalance);
            // when
            nero.deposit(-2000);
            // checkpoint
            int newBalance = nero.getBalance("2222");
            assertEquals(5000, newBalance);
        }

@Test
    public void canWithdrawTest() {
    Account nero = new Account("2222");
    nero.deposit(5000);
    int currentBalance = nero.getBalance("2222");
    assertEquals(5000, currentBalance);
    // when
    nero.withdraw(2000, "2222");
    // checkpoint
    int newBalance = nero.getBalance("2222");
    assertEquals(3000, newBalance);
}

        @Test
         public void canNotSetPinToBeMoreThan4ButUseDefaultPinForTransaction() {
            Account nero = new Account("22228");
            nero.deposit(5000);
            int currentBalance = nero.getBalance("0000");
            assertEquals(5000, currentBalance);
            // when
            nero.withdraw(2000, "0000");
            // checkpoint
            int newBalance = nero.getBalance("0000");
            assertEquals(3000, newBalance);
        }

    }
