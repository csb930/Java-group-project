package GroupProject2026;

// by. Carl Bolen, Tina Haidari, Arly Jahuey-Paz and Jessica Danielle Pittman
 
import java.util.Date; 

public class Loan { 
    private double loanAmount;  
    private double annualInterestRate; 
    private int years;
    private Date loanCreationDate; 
	private double extraPayment;

//constructor
public Loan(double loanAmount, double annualInterestRate, int years, double extraPayment) { 
    this.annualInterestRate = annualInterestRate;
    this.years = years;
    this.loanAmount = loanAmount;
	this.extraPayment = extraPayment; 
    this.loanCreationDate = new Date(); 
      } 
	
      public double getMonthlyPayment() {
       double monthlyInterestRate = annualInterestRate / (1200);
       return loanAmount * monthlyInterestRate /
		   (1 - Math.pow(1 + monthlyInterestRate, -years * 12));
	  }
     
      public double getAnnualInterestRate() { 
            return annualInterestRate; 
      } 

      public void setAnnualInterestRate(double annualInterestRate) { 
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
	
	public double getTotalInterest() {
		return getTotalPayment() - loanAmount;
	}
			
}
