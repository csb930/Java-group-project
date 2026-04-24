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

       this.loanCreationDate = new Date(); 
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
      


 
