package com.vir.sdet.bank;

public class CurrentAccount extends Account{

    private double compoundInterest;
    private double currentPrincipalAmount;
    private int timeCurrentAccount;

    public CurrentAccount(double amountReceived, int timeReceived){
        super(amountReceived);
        this.currentPrincipalAmount=amountReceived;
        this.timeCurrentAccount=timeReceived;
    }

    @Override
    public double calculateInterest(){
        System.out.println("Current Account");
        double rate =0.15;
        compoundInterest = currentPrincipalAmount * rate * timeCurrentAccount;
        double totalAmount = currentPrincipalAmount + compoundInterest;
        System.out.println("Current Account Interest:" + compoundInterest);
        System.out.println("total amount after Interest :"+ totalAmount);

        return compoundInterest;
    }
}