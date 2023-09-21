package controller;

import Data.repositories.MenstrualApp;

import java.time.LocalDate;
import java.util.Calendar;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        MenstrualApp menstrualApp = new MenstrualApp();
        menstrualApp.welcome();
    }
}
