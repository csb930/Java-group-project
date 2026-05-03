package GroupProject2026;
// by. Carl Bolen, Tina Haidari, Arly Jahuey-Paz and Jessica Danielle Pittman 
import java.util.Date; 

 

public class Loan { 
      private double loanAmount;  
      private double annualInterestRate; 
      private int numberOfYears;  
      private Date loanCreationDate; 
      private double extraPayment;


 //no arg constructor
public Loan() {
 this(2.5, 1, 1000, 0.0);
}
//constructor
public Loan(double annualInterestRate, int numberOfYears, double loanAmount) {
    this(annualInterestRate, numberOfYears, loanAmount, 0.0);
}

public Loan(double annualInterestRate, int numberOfYears, double loanAmount, double extraPayment) {
    this.annualInterestRate = annualInterestRate;
    this.numberOfYears = numberOfYears;
    this.loanAmount = loanAmount;
    this.extraPayment = extraPayment;
    this.loanCreationDate = new Date();
      }

public double getMonthlyPayment() {
      double monthlyInterestRate = annualInterestRate / (12 * 100);
      double monthlyPayment = loanAmount * monthlyInterestRate / (1 - (1 / Math.pow(1 + monthlyInterestRate, numberOfYears * 12)));
      return monthlyPayment;
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

public Date getLoanCreationDate() {
      return loanCreationDate;
      }

public double getTotalPayment () {
      return getMonthlyPayment() * numberOfYears * 12;
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

public double getTotalInterest() {
      double totalInterest = getTotalPayment() - loanAmount;
      return totalInterest;
      }

public Date getLoanDate() {
      return loanCreationDate;
      }

}
