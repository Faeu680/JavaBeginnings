package entities;

public class Bank { 
    private String name;
    private int accountNumber, password;
    private double balance;


public Bank(String name, int accountNumber, int password){
        this.name = name;
        this.accountNumber = accountNumber;
        this.password = password;
    }

    public String getName(){
        return this.name;
    }
    public void setName(String name, int accountNumber, int password){
        if(this.accountNumber == accountNumber && this.password == password){
            this.name = name;
        }
        else
            System.out.println("The credentials dont match, try again");
    }
    public int getAccountNumber(){
        return this.accountNumber;
    }
    public double getBalance(){
        return this.balance;
    }
    public int getPassword(){
        return this.password;
    }

    public void initialDeposit(double initialDeposit){
        this.balance += initialDeposit;
    }
    public void deposit(double value, int accountNumber, int password){
        if(this.accountNumber == accountNumber && this.password == password){
            this.balance += value;
        }
        else
            System.out.println("The credentials dont match, try again");
    }
    public void whithdraw(double value, int accountNumber, int password){
        if(this.accountNumber == accountNumber && this.password == password){
            this.balance -= (5 + value);
        }
        else
            System.out.println("The credentials dont match, try again");
    }
}