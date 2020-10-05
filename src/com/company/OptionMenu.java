package com.company;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.WindowEvent;
import java.awt.event.WindowListener;
import java.text.DecimalFormat;

import static com.company.Main.loginFrame;

public class OptionMenu implements ActionListener, WindowListener {

    DecimalFormat moneyFormat = new DecimalFormat("'$'###,##0.00");

    public static double checkingBalance = 0;
    public static double savingBalance = 0;
    public static String username;
    public static String userpassword;

    private static JFrame menuFrame;
    private static JPanel menuPanel;
    private static JPanel checkingPanel;
    private static JPanel savingPanel;
    //Buttons
    private static JButton checkingButton;
    private static JButton savingButton;
    private static JButton balanceButtonC;
    private static JButton depositButtonC;
    private static JButton withdrawButtonC;
    private static JButton balanceButtonS;
    private static JButton depositButtonS;
    private static JButton withdrawButtonS;
    private static JButton backButton;
    //Labels
    public static JLabel menuTitleLabel;
    public static JLabel menuChoiceLabel;

    //Validate Login information customer number and pin number
    public void getLogin() {

        try {
            username = "emil123";
            userpassword = "123456";

            System.out.println("Welcome to the E-ATM");
        }
        catch (Exception e) {
            System.out.println("\n Invalid characters(s). Only numbers. \n");
        }
    }

    //Interface Menu
    public static void menuInterface() {
        //Menu Loading
        loginFrame.setVisible(false);
        if(checkingPanel != null)
            checkingPanel.setVisible(false);

        //Menu Window
        menuFrame = new JFrame();
        menuFrame.setTitle("ATM - Menu");
        menuFrame.setSize(400, 200);
        menuFrame.setLocationRelativeTo(null);
        menuFrame.setResizable(false);
        menuFrame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        //Menu Inside Window
        menuPanel = new JPanel();
        menuPanel.setLayout(null);
        menuFrame.add(menuPanel);

        //Menu Title label
        menuTitleLabel = new JLabel();
        menuTitleLabel.setText("<html><h3 style='text-align:center;'>Welcome to the E-ATM</h3> <br></html>");
        menuTitleLabel.setBounds(10, 10, 400, 50);
        menuPanel.add(menuTitleLabel);

        //Menu Choice label
        menuChoiceLabel = new JLabel();
        menuChoiceLabel.setText("Select the Account you want to access: ");
        menuChoiceLabel.setBounds(10, 30, 400, 50);
        menuPanel.add(menuChoiceLabel);

        //Menu Buttons Checking account
        checkingButton = new JButton("Checking");
        checkingButton.setBounds(10, 100, 100, 40);
        checkingButton.addActionListener(new OptionMenu());
        menuPanel.add(checkingButton);

        //Menu Button Saving account
        savingButton = new JButton("Saving");
        savingButton.setBounds(270, 100, 100, 40);
        savingButton.addActionListener(new OptionMenu());
        menuPanel.add(savingButton);

        //loginFrame.dispose();
        menuFrame.setVisible(true);
    }

    //Display Checking Account Menu with selections
    public void getChecking() {
        System.out.println("Checking Account: ");

        //Switch to Checking panel
        menuPanel.setVisible(false);
        menuFrame.setSize(400, 250);

        //Checking Menu Inside Window
        checkingPanel = new JPanel();
        checkingPanel.setLayout(null);
        menuFrame.add(checkingPanel);

        //Checking Menu Title label
        JLabel checkingTitleLabel = new JLabel();
        checkingTitleLabel.setText("<html><h3 style='text-align:center;'>Checking Account</h3> <br></html>");
        checkingTitleLabel.setBounds(10, 10, 400, 50);
        checkingPanel.add(checkingTitleLabel);

        //Checking Menu Choice label
        JLabel checkingChoiceLabel = new JLabel();
        checkingChoiceLabel.setText("Select an option: ");
        checkingChoiceLabel.setBounds(10, 30, 400, 50);
        checkingPanel.add(checkingChoiceLabel);

        //Menu Buttons View Balance
        balanceButtonC = new JButton("View Balance");
        balanceButtonC.setBounds(10, 100, 100, 40);
        balanceButtonC.addActionListener(new OptionMenu());
        checkingPanel.add(balanceButtonC);

        //Menu Button Withdraw Funds
        withdrawButtonC = new JButton("Withdraw Funds");
        withdrawButtonC.setBounds(270, 100, 100, 40);
        withdrawButtonC.addActionListener(new OptionMenu());
        checkingPanel.add(withdrawButtonC);

        //Menu Button Withdraw Funds
        depositButtonC = new JButton("Deposit Funds");
        depositButtonC.setBounds(10, 150, 100, 40);
        depositButtonC.addActionListener(new OptionMenu());
        checkingPanel.add(depositButtonC);

        //Menu Button Withdraw Funds
        backButton = new JButton("Back");
        backButton.setBounds(270, 150, 100, 40);
        backButton.addActionListener(new OptionMenu());
        checkingPanel.add(backButton);

        checkingPanel.setVisible(true);
    }

    //Display Saving Account Menu with selections
    public void getSaving() {
        System.out.println("Saving Account: ");

        //Switch to Saving panel
        menuPanel.setVisible(false);
        menuFrame.setSize(400, 250);

        //Saving Menu Inside Window
        savingPanel = new JPanel();
        savingPanel.setLayout(null);
        menuFrame.add(savingPanel);

        //Saving Menu Title label
        JLabel savingTitleLabel = new JLabel();
        savingTitleLabel.setText("<html><h3 style='text-align:center;'>Saving Account</h3> <br></html>");
        savingTitleLabel.setBounds(10, 10, 400, 50);
        savingPanel.add(savingTitleLabel);

        //Saving Menu Choice label
        JLabel savingChoiceLabel = new JLabel();
        savingChoiceLabel.setText("Select an option: ");
        savingChoiceLabel.setBounds(10, 30, 400, 50);
        savingPanel.add(savingChoiceLabel);

        //Menu Buttons View Balance
        balanceButtonS = new JButton("View Balance");
        balanceButtonS.setBounds(10, 100, 100, 40);
        balanceButtonS.addActionListener(new OptionMenu());
        savingPanel.add(balanceButtonS);

        //Menu Button Withdraw Funds
        withdrawButtonS = new JButton("Withdraw Funds");
        withdrawButtonS.setBounds(270, 100, 100, 40);
        withdrawButtonS.addActionListener(new OptionMenu());
        savingPanel.add(withdrawButtonS);

        //Menu Button Deposit Funds
        depositButtonS = new JButton("Deposit Funds");
        depositButtonS.setBounds(10, 150, 100, 40);
        depositButtonS.addActionListener(new OptionMenu());
        savingPanel.add(depositButtonS);

        //Menu Button Back
        backButton = new JButton("Back");
        backButton.setBounds(270, 150, 100, 40);
        backButton.addActionListener(new OptionMenu());
        savingPanel.add(backButton);

        savingPanel.setVisible(true);
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        if (e.getSource() == checkingButton) {
            getChecking();
        }
        else if (e.getSource() == savingButton) {
            getSaving();
        }
        else if (e.getSource() == balanceButtonC) {
            showBalanceC();
        }
        else if (e.getSource() == depositButtonC) {
            depositBalanceC();
        }
        else if (e.getSource() == withdrawButtonC) {
            withdrawBalanceC();
        }
        else if (e.getSource() == balanceButtonS) {
            showBalanceS();
        }
        else if (e.getSource() == depositButtonS) {
            depositBalanceS();
        }
        else if (e.getSource() == withdrawButtonS) {
            withdrawBalanceS();
        }
        else if (e.getSource() == backButton) {
            menuFrame.dispose();
            menuInterface();
        }
    }

    //Show Checking Balance
    public void showBalanceC() {
        System.out.println("Your balance is:" + moneyFormat.format(checkingBalance));
        JOptionPane.showMessageDialog(menuFrame, "Your balance is: " + moneyFormat.format(checkingBalance), "Balance", JOptionPane.INFORMATION_MESSAGE);
    }
    //Deposit Checking Balance
    public void depositBalanceC() {
        System.out.println("Checking Account Balance: " + moneyFormat.format(checkingBalance));
        System.out.println("Amount you want to deposit from Checking Account: ");
        String depositAmount = JOptionPane.showInputDialog(menuFrame, "Insert the amount you want to deposit", "Deposit", JOptionPane.QUESTION_MESSAGE);
        double amount = Double.parseDouble(depositAmount);
        if((checkingBalance + amount) >= 0) {
            checkingBalance = checkingBalance + amount;
            System.out.println("New Checking Account balance: " + moneyFormat.format(checkingBalance));
        }
        else {
            System.out.println("Balance cannot be negative. \n");
        }
    }
    //Withdraw Checking Balance
    public void withdrawBalanceC() {
        System.out.println("Checking Account Balance: " + moneyFormat.format(checkingBalance));
        System.out.println("Amount you want to withdraw from Checking Account: ");
        double amount = Integer.parseInt(JOptionPane.showInputDialog(menuFrame, "Insert the amount you want to withdraw", "Withdraw", JOptionPane.QUESTION_MESSAGE));

        if((checkingBalance - amount) >= 0) {
            checkingBalance = (checkingBalance - amount);
            System.out.println("New Checking Account balance: " + moneyFormat.format(checkingBalance));
        }
        else {
            System.out.println("Balance cannot be negative. \n");
        }
    }
    //Show Saving Balance
    public void showBalanceS() {
        System.out.println("Your balance is:" + moneyFormat.format(savingBalance));
        JOptionPane.showMessageDialog(menuFrame, "Your balance is: " + moneyFormat.format(savingBalance), "Balance", JOptionPane.INFORMATION_MESSAGE);
    }
    //Deposit Saving Balance
    public void depositBalanceS() {
        System.out.println("Checking Account Balance: " + moneyFormat.format(savingBalance));
        System.out.println("Amount you want to deposit from Checking Account: ");
        String depositAmount = JOptionPane.showInputDialog(menuFrame, "Insert the amount you want to deposit", "Deposit", JOptionPane.QUESTION_MESSAGE);
        double amount = Double.parseDouble(depositAmount);
        if((savingBalance + amount) >= 0) {
            savingBalance = savingBalance + amount;
            System.out.println("New Checking Account balance: " + moneyFormat.format(savingBalance));
        }
        else {
            System.out.println("Balance cannot be negative. \n");
        }
    }
    //Withdraw Saving Balance
    public void withdrawBalanceS() {
        System.out.println("Checking Account Balance: " + moneyFormat.format(savingBalance));
        System.out.println("Amount you want to withdraw from Checking Account: ");
        double amount = Integer.parseInt(JOptionPane.showInputDialog(menuFrame, "Insert the amount you want to withdraw", "Withdraw", JOptionPane.QUESTION_MESSAGE));

        if((savingBalance - amount) >= 0) {
            savingBalance = (savingBalance - amount);
            System.out.println("New Checking Account balance: " + moneyFormat.format(savingBalance));
        }
        else {
            System.out.println("Balance cannot be negative. \n");
        }
    }


    @Override
    public void windowClosing(WindowEvent e) {
        menuFrame.dispose();
        System.exit(0);
    }

    @Override
    public void windowOpened(WindowEvent e) {}
    @Override
    public void windowClosed(WindowEvent e) {}
    @Override
    public void windowIconified(WindowEvent e) {}
    @Override
    public void windowDeiconified(WindowEvent e) {}
    @Override
    public void windowActivated(WindowEvent e) {}
    @Override
    public void windowDeactivated(WindowEvent e) {}
}
