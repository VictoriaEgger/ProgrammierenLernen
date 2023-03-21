package Aufgaben;

import java.util.Scanner;

public class Aufgabe3 {
    public static void main(String[] args) {

        System.out.println("Enter your account balance: ");
        Scanner balanceScanner = new Scanner(System.in);
        double accountBalance = balanceScanner.nextInt();


        System.out.println("Menu:");
        System.out.println("1. Desposit");
        System.out.println("2. Withdraw");
        System.out.println("3. Check balance");
        System.out.println("4. Exit");
        System.out.println("Please enter your choice: ");
        Scanner choiceScanner = new Scanner(System.in);

        int choice = 0;
        while (choice != 4) {
            choice = choiceScanner.nextInt();


            switch (choice) {
                case 1:
                    System.out.println("Who much do you want to DEPOSIT?: ");
                    Scanner depositScanner = new Scanner(System.in);
                    double depositNumber = depositScanner.nextDouble();
                    accountBalance = accountBalance + depositNumber;
                    System.out.println("Your new account balance is: " + accountBalance);
                    break;
                case 2:
                    System.out.println("How much do you want to WITHDRAW?: ");
                    Scanner withdrawScanner = new Scanner(System.in);
                    double withdrawNumber = withdrawScanner.nextDouble();
                    accountBalance = accountBalance - withdrawNumber;
                    System.out.println("Your new account balance is: " + accountBalance);
                    break;
                case 3:
                    System.out.println("Current balance: " + accountBalance);
                    break;
                case 4:
                    System.out.println("Goodbye");
                    break;
                default:
                    System.out.println("Please enter a valid number!");
            }


        }
    }
    }


