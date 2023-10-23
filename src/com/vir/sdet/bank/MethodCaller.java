package com.vir.sdet.bank;

public class MethodCaller {

    public static void main(String[] args){
      
        Account account1 = new Account(6742.50);
        double interest = account1.calculateInterest();
        System.out.println("interest"+ interest);

        //Savings Account
        SavingsAccount savingAccount1 = new SavingsAccount(6000.5, 10);
        double savingInterest = savingAccount1.calculateInterest();
        System.out.println("Saving Interest:"+savingInterest);

        //Current Account
        CurrentAccount currentAccount1 = new CurrentAccount(7500.0, 15);
        double currentInterest = currentAccount1.calculateInterest();
        System.out.println("Current Interest:"+ currentInterest);
    }
}

