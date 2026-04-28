package GroupProject2026;

import java.util.Scanner; 

import java.util.Date; 

public class Loan { 
private double extraPayment;
 
private double loanAmount;  

private double annualInterestRate; 

private int years;

private double monthlyPayment; 

private Date loanCreationDate; 

private double totalPayment;

 //no arg constructor
public Loan() {
 this(2.5, 1, 1000, 0.0);
}
//constructor
public Loan(double annualInterestRate, int years, double loanAmount, double extraPayment) { 
       this.loanAmount = loanAmount;  

       this.annualInterestRate = annualInterestRate; 

       this.years = years; 

       this.extraPayment = extraPayment; 

       loanCreationDate = new java.util.Date(); 
      } 

      public double getAnnualInterestRate() { 
            return annualInterestRate; 
      } 

      public void setAnnualInterestRate (double annualInterestRate) { 
            this.annualInterestRate = annualInterestRate; 
      } 

      public int getYears () { 
            return years; 
      } 
      public void setYears (int years) { 
            this.years = years;
      } 

      public double getLoanAmount () { 
            return loanAmount; 
      } 

      public void setLoanAmount (double loanAmount) { 
            this.loanAmount = loanAmount; 
      }
      public Date getLoanCreationDate() {
        return loanCreationDate;
      }
      public double getTotalPayment () {
        return getMonthlyPayment() * years * 12;
      }
      public void setTotalPayment (double totalPayment) {
       this.totalPayment = totalPayment;
      }
      public double getMonthlyPayment() {
       double monthlyInterestRate = annualInterestRate / 1200;
       double monthlyPayment = loanAmount * monthlyInterestRate / (1 - (1 / Math.pow(1 + monthlyInterestRate, years * 12)));
       return monthlyPayment;


 
