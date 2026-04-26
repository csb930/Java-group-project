import java.util.Scanner; 
import java.util.Date; 

 

public class Loan { 
      private double loanAmount;  
      private double annualInterestRate; 
      private int numberOfYears;       
      private Date loanCreationDate; 

 
//constructor
public Loan(double annualInterestRate, int numberOfYears, double loanAmount) {
        this.annualInterestRate = annualInterestRate;
        this.numberOfYears = numberOfYears;
        this.loanAmount = loanAmount;
        this.loanCreationDate = new Date(); 
      } 

      public double getAnnualInterestRate() { 
            return annualInterestRate; 
      } 

      public void setAnnualInterestRate(double annualInterestRate) { 
            this.annualInterestRate = annualInterestRate; 
      } 

      public int getNumberOfYears () { 
            return numberOfYears; 
      } 
      public void setNumberOfYears (int numberOfYears) { 
            this.numberOfYears = numberOfYears; 
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
      public double getTotalPayment() {
            double totalPayment = getMonthlyPayment() * numberOfYears * 12;
            return totalPayment;
      }

      public double getTotalInterest() {
            double totalInterest = getTotalPayment() - loanAmount;
            return totalInterest;
      }

      public Date getLoanDate() {
            return loanCreationDate;
      }
 
}