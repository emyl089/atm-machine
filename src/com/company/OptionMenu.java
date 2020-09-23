package com.company;

import java.text.DecimalFormat;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

import static com.company.Main.userText;

public class OptionMenu extends Account{
    Scanner menuInput = new Scanner(System.in);
    DecimalFormat moneyFormat = new DecimalFormat("'$'###,##0.00");

    public static String username;
    public static String userpassword;

    int selection;
    public static int x = 1;

    //Validate Login information customer number and pin number
    public void getLogin() {

        try {
            username = "emil123";
            userpassword = "123456";

            System.out.println("Welcome to the E-ATM");
        }
        catch (Exception e) {
            System.out.println("\n Invalid characters(s). Only numbers. \n");
            x = 2;
        }
    }

    //Display Account Type Menu with selection
    public void getAccountType() {
        System.out.println("Select the Account you want to access: ");
        System.out.println("1 - Checking Account");
        System.out.println("2 - Saving Account");
        System.out.println("3 - Exit");
        System.out.println("Choice: ");
        selection = menuInput.nextInt();

        switch (selection) {
            case 1:
                getChecking();
                break;

            case 2:
                getSaving();
                break;

            case 3:
                System.out.println("Thank You for using this ATM, bye.");
                x = 2;
                break;

            default:
                System.out.println("\n Invalid Choice. \n");
                getAccountType();
        }
    }

    //Display Checking Account Menu with selections
    public void getChecking() {
        System.out.println("Checking Account: ");
        System.out.println("1 - View Balance");
        System.out.println("2 - Withdraw Funds");
        System.out.println("3 - Deposit Funds");
        System.out.println("4 - Exit");
        System.out.println("Choice: ");
        selection = menuInput.nextInt();

        switch (selection) {
            case 1:
                System.out.println("Checking Account Balance: " + moneyFormat.format(getCheckingBalance()));
                getAccountType();
                break;

            case 2:
                getCheckingWithdrawInput();
                getAccountType();
                break;

            case 3:
                getCheckingDepositInput();
                getAccountType();
                break;

            case 4:
                System.out.println("Thank You for using this ATM, bye.");
                x = 2;
                break;

            default:
                System.out.println("\n Invalid Choice. \n");
                getChecking();
        }
    }

    //Display Saving Account Menu with selections
    public void getSaving() {
        System.out.println("Saving Account: ");
        System.out.println("1 - View Balance");
        System.out.println("2 - Withdraw Funds");
        System.out.println("3 - Deposit Funds");
        System.out.println("4 - Exit");
        System.out.println("Choice: ");
        selection = menuInput.nextInt();

        switch (selection) {
            case 1:
                System.out.println("Saving Account Balance: " + moneyFormat.format(getSavingBalance()));
                getAccountType();
                break;

            case 2:
                getSavingWithdrawInput();
                getAccountType();
                break;

            case 3:
                getSavingDepositInput();
                getAccountType();
                break;

            case 4:
                System.out.println("Thank You for using this ATM, bye.");
                x = 2;
                break;

            default:
                System.out.println("\n Invalid Choice. \n");
                getSaving();
        }
    }
}
