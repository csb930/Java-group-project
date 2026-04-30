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
      public double getMonthlyPayment() {
       double monthlyInterestRate = annualInterestRate / (12 * 100);
       double monthlyPayment = loanAmount * monthlyInterestRate / (1 - (1 / Math.pow(1 + monthlyInterestRate, years * 12)));
       return monthlyPayment;

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
      public void getSavingsSummary() {
       double balance = this.loanAmount;
       double monthlyRate = this.annualInterestRate / (12*100);
       int months = 0;
       double totalInterestPaid = 0;
       while (balance > 0) {
        months++;
        double interest = balance * monthlyRate;
        double principalPaid = (getMonthlyPayment() + extraPayment) - interest;
        if (principalPaid > balance) principalPaid = balance;
        
        balance -= principalPaid;
        totalInterestPaid += interest;
    }
    
    System.out.println("With extra payments, you finish in " + months + " months.");
    System.out.println("Total interest paid: $" + totalInterestPaid);
      }
}



 
