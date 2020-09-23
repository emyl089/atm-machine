package com.company;

import java.text.DecimalFormat;
import java.util.Scanner;

public class Account {
    Scanner input = new Scanner(System.in);
    DecimalFormat moneyFormat = new DecimalFormat("'$'###,##0.00");

    private String customerName;
    private int pinNumber;
    private double checkingBalance = 0;
    private double savingBalance = 0;

    //Set customer number
    public String setCustomerName(String customerName) {
        this.customerName = customerName;
        return customerName;
    }

    //Get customer number
    public String getCustomerName() {
        return customerName;
    }

    //Set pin number
    public int setPinNumber(int pinNumber) {
        this.pinNumber = pinNumber;
        return pinNumber;
    }

    //Get pin number
    public int getPinNumber() {
        return pinNumber;
    }

    //Get Checking Account Balance
    public double getCheckingBalance() {
        return checkingBalance;
    }

    //Get Saving Account Balance
    public double getSavingBalance() {
        return savingBalance;
    }

    //Calculate Checking Account withdrawal
    public double calcCheckingWithdraw(double amount) {
        checkingBalance = (checkingBalance - amount);
        return checkingBalance;
    }

    //Calculate Saving Account withdrawal
    public double calcSavingWithdraw(double amount) {
        savingBalance = (savingBalance - amount);
        return savingBalance;
    }

    //Calculate Checking Account deposit
    public double calcCheckingDeposit(double amount) {
        checkingBalance = (checkingBalance + amount);
        return checkingBalance;
    }

    //Calculate Saving Account deposit
    public double calcSavingDeposit(double amount) {
        savingBalance = (savingBalance + amount);
        return savingBalance;
    }

    //Customer Checking Account Withdraw input
    public void getCheckingWithdrawInput() {
        System.out.println("Checking Account Balance: " + moneyFormat.format(checkingBalance));
        System.out.println("Amount you want to withdraw from Checking Account: ");
        double amount = input.nextDouble();

        if((checkingBalance - amount) >= 0) {
            calcCheckingWithdraw(amount);
            System.out.println("New Checking Account balance: " + moneyFormat.format(checkingBalance));
        }
        else {
            System.out.println("Balance cannot be negative. \n");
        }
    }

    //Customer Saving Account Withdraw input
    public void getSavingWithdrawInput() {
        System.out.println("Saving Account Balance: " + moneyFormat.format(savingBalance));
        System.out.println("Amount you want to withdraw from Saving Account: ");
        double amount = input.nextDouble();

        if((savingBalance - amount) >= 0) {
            calcSavingWithdraw(amount);
            System.out.println("New Saving Account balance: " + savingBalance + "\n");
        }
        else {
            System.out.println("Balance cannot be negative. \n");
        }
    }

    //Customer Checking Account Deposit input
    public void getCheckingDepositInput() {
        System.out.println("Checking Account Balance: " + moneyFormat.format(checkingBalance));
        System.out.println("Amount you want to deposit from Checking Account: ");
        double amount = input.nextDouble();

        if((checkingBalance + amount) >= 0) {
            calcCheckingDeposit(amount);
            System.out.println("New Checking Account balance: " + moneyFormat.format(checkingBalance));
        }
        else {
            System.out.println("Balance cannot be negative. \n");
        }
    }

    //Customer Saving Account Deposit input
    public void getSavingDepositInput() {
        System.out.println("Saving Account Balance: " + moneyFormat.format(savingBalance));
        System.out.println("Amount you want to deposit from Saving Account: ");
        double amount = input.nextDouble();

        if((savingBalance - amount) >= 0) {
            calcSavingDeposit(amount);
            System.out.println("New Saving Account balance: " + moneyFormat.format(savingBalance));
        }
        else {
            System.out.println("Balance cannot be negative. \n");
        }
    }
}
