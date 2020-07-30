package application;

import java.util.Scanner;
import entities.Bank;

public class Program{
    public static void main(String[] args) {
        double initialDeposit = 0, value;
        Bank account;
        int menu = 0, login, pass;
        Scanner sc = new Scanner(System.in);

        System.out.printf("Good morning!%nCreate your account:%nEnter account holder:%n");
        String name = sc.nextLine();
        System.out.println("Enter 6 digits account number: ");
        int accountNumber = sc.nextInt();
        System.out.println("Enter 4 digits account password: ");
        int password = sc.nextInt();
        account = new Bank(name, accountNumber, password);
        System.out.println("Do you want to make an initial deposit (y/n): ");
        char answer = sc.next().charAt(0);
        if(answer == 'y'){
            System.out.println("Enter initial deposit value: ");
            initialDeposit = sc.nextDouble();
        }
        account.initialDeposit(initialDeposit);
        System.out.println("Account data: " + account.getName() + ", " + account.getAccountNumber() + ", " + account.getBalance());

        do{
            System.out.printf("%n Enter the number of what you want to do:%n. Deposit(1)%n. Whithdraw(2)%n. Close(3)%n");
            menu = sc.nextInt();
            switch (menu){
                case 1:
                    System.out.println("Enter account number, password, deposit value:");
                    login = sc.nextInt();
                    pass = sc.nextInt();
                    value = sc.nextDouble();
                    if(login == account.getAccountNumber() && pass == account.getPassword()){
                        account.deposit(value, accountNumber, password);
                        System.out.println("Updated data:" + account.getName()+ ", " + account.getAccountNumber() + ", " + account.getBalance());
                    }
                    else{
                        System.out.println("Invalid credentials, try again!");
                    }
                    break;
                case 2:
                    System.out.println("Enter account number, password, deposit value:");
                    login = sc.nextInt();
                    pass = sc.nextInt();
                    value = sc.nextDouble();
                    if(login == account.getAccountNumber() && pass == account.getPassword()){
                        account.whithdraw(value, accountNumber, password);
                        System.out.println("Updated data:" + account.getName()+ ", " + account.getAccountNumber() + ", " + account.getBalance());
                    }
                    else{
                        System.out.println("Invalid credentials, try again!");
                    }
                    break;
                case 3:
                        System.out.println("Thanks for using!");
                    break;
                default:
                    System.out.println("Invalid number, Try again!");
                    break;                 
            }
        }
        while(menu != 3);

        sc.close();
    }
}