package com.company;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Map;

public class Main extends OptionMenu implements ActionListener {

    private static JLabel loginLabel;
    public static JTextField userText;
    private static JLabel passwordLabel;
    private static JPasswordField userPassword;
    private static JButton loginButton;
    private static JLabel success;

    public static void main(String[] args) {
        OptionMenu optionMenu = new OptionMenu();
        optionMenu.getLogin();

        //Login Window
        JFrame loginFrame = new JFrame();
        loginFrame.setTitle("ATM");
        loginFrame.setSize(300, 150);
        loginFrame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        //Login Inside Window
        JPanel loginPanel = new JPanel();
        loginPanel.setLayout(null);
        loginFrame.add(loginPanel);

        //Login User Label
        loginLabel = new JLabel();
        loginLabel.setText("User");
        loginLabel.setBounds(10, 20, 80, 25);
        loginPanel.add(loginLabel);

        //Login User Input
        userText = new JTextField(20);
        userText.setBounds(100, 20, 165, 25);
        loginPanel.add(userText);

        //Login Password Label
        passwordLabel = new JLabel();
        passwordLabel.setText("Password");
        passwordLabel.setBounds(10, 50, 80, 25);
        loginPanel.add(passwordLabel);

        //Login Password Input
        userPassword = new JPasswordField();
        userPassword.setBounds(100, 50, 165, 25);
        loginPanel.add(userPassword);

        //Login Button
        loginButton = new JButton("Login");
        loginButton.setBounds(10, 80, 80, 25);
        loginButton.addActionListener(new Main());
        loginPanel.add(loginButton);

        //Login Success
        success = new JLabel("");
        success.setBounds(110, 80, 100, 25);
        loginPanel.add(success);

        loginFrame.setVisible(true);
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        String user = userText.getText();
        String password = userPassword.getText();
        System.out.println(user + " | " + password);

        if (OptionMenu.username.equals(user) && OptionMenu.userpassword.equals(password)) {
            success.setText("Login successful!");
            System.out.println("Login successful!");
            getAccountType();
        } else {
            System.out.println("Login unsuccessful.");
        }
    }
}
