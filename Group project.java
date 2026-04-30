Package GroupProject2026
import java.util.Scanner; 

import java.util.Date; 

public class Loan { 
private double loanAmount;  

private double annualInterestRate; 

private int years;      

private double monthlyPayment; 

private Date loanCreationDate; 

 //no arg constructor
public Loan() {
 this.(2.5, 1, 100);
}
//constructor
public Loan(double loanAmount, double annualInterestRate, int years, double extraPayment) { 

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

      public getintYears () { 
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
      public Date getLoanCreationDate() {
    		return loanCreationDate;
      }
      public void setLoanCreationDate (Date loanCreationDate) {
            this.loanCreationDate = loanCreationDate;
      }

	public double getMonthlyPayment() {
            double monthlyInterestRate = annualInterestRate / 1200;
            double monthlyPayment = loanAmount * monthlyInterestRate / (1 - (1 / Math.pow(1 + monthlyInterestRate, numberOfYears * 12)));
            return monthlyPayment;    
      }
	
      public double getTotalPayment() {
	          double totalPayment = getMonthlyPayment() * numberOfYears * 12;
	          return totalPayment;    
	  }

      public double getTotalInterest() {
	          double totalInterest = totalPayment - loanAmount;
	          return totalInterest;    
	  }

      public java.util.Date getLoanDate() {
	          return loanDate;
	  }
