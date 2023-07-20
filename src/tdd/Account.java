package tdd;

import java.util.Scanner;

public class Account {
    private String accountpin = "0000";
    private int balance;

    public Account(String userpin) {
        if (userpin.length() == 4) {
            accountpin = userpin;
        } else {
            System.out.print("pin but be 4 characters");
            accountpin = accountpin;
        }
    }
    public int getBalance(String pin) {
        if (pin == accountpin) {
            return balance;
        } else {
            return 0;
        }
    }

    public void deposit(int amount) {
        if (amount > 0) {
            balance += amount;
        }
    }

    public void withdraw(int withdraw, String pin) {
        if (withdraw <= balance && pin == accountpin) {
            balance -= withdraw;
        }
        else {
                System.out.print("invalid transaction");
            }
        }
        }
