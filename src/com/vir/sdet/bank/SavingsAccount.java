package com.vir.sdet.bank;

public class SavingsAccount extends Account{
    private double savingsInterest;
    private double savingPrincipalAmount;
    private int timeSavingAccount;

    public SavingsAccount(double amountReceived,int timeReceived){
        //Constructor
    super(amountReceived);
    this.savingPrincipalAmount=amountReceived;
    this.timeSavingAccount=timeReceived;
    }

    //method override
    
    @Override
    public double calculateInterest(){
        System.out.println("Savings Account");
        float rate =    0.42f;
        savingsInterest=savingPrincipalAmount * rate * timeSavingAccount;
        double totalAmount= savingPrincipalAmount + savingsInterest;
        System.out.println("Savings Interest:"+ savingsInterest);
        System.out.println("Total amount after interest:"+ totalAmount);
        return savingsInterest;
    }
}