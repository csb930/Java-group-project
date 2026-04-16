import java.util.Scanner; 

import java.util.Date; 

 

Class Loan { 

private double loanAmount;  

private double annualInterestRate; 

private int years;      

private double monthlyPayment; 

private Date loanCreationDate; 

 
//constructor
public Loan(double loanAmount, double annualRate, int years, double extraPayment) { 

       this.loanAmount = loanAmount;  

       this.annualInterestRate = annualInterestRate; 

       this.years = years; 

       this.extraPayment = extraPayment; 

       this.loanCreationDate = new java.util.Date(); 
      } 

      public double getAnnualInterestRate() { 
            return annualInterestRate; 
      } 

      public void setAnnualInterestRate (double annualInterestRate) { 
            this.annualInterestRate = annualInterestRate; 
      } 

      public intYears () { 
            return years; 
      } 
      public void setyears (int years) { 
            this.years = years 
      } 

      public double getLoanAmount () { 
            return loanAmount; 
      } 

      public void setLoanAmount (double loanAmount) { 
            this.loanAmount = loanAmount; 
      } 
      public double getMonthlyPayment() {
            double monthlyInterestRate = annualInterestRate / 1200;
            double monthlyPayment = loanAmount * monthlyInterestRate / (1 - (1 / Math.pow(1 + monthlyInterestRate, numberOfYears * 12)));
            return monthlyPayment;    
      }
 
