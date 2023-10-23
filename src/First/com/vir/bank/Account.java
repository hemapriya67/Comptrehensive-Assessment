package com.vir.sdet.bank;

public class Account {

    private double interest;
    private double pricipalAmount;

    public Account(double amountReceived){
        if(amountReceived !=0 || amountReceived <0){
           this.pricipalAmount=amountReceived;
        }
     }

     public double calculateInterest(){
          
        int time = 4;
        double rate = 0.08;
        interest = pricipalAmount * time * rate;
        double totalAmount = pricipalAmount + interest;
        System.out.println("Interest :"+interest);
        System.out.println("Total Amount after interest :" + totalAmount);
        return interest;

     }
}