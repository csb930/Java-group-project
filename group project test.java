import java.util.Scanner

public class TestLoan {
public static void main(String[] args) {
    //Makes a scanner
    Scanner input = new Scanner(System.in);
System.out.print(  "Enter annual interest rate, for example, 8.25: ");
    double annualInterestRate = input.nextDouble();
  // Enter number of years
    System.out.print("Enter number of years as an integer: ");
    int numberOfYears = input.nextInt();

    // Enter loan amount
    System.out.print("Enter loan amount, for example, 120000.95: ");
    double loanAmount =  input.nextDouble();
    if (loanAmount <= 0) {
        System.out.println("Error: Loan amount must be greater than zero!");
    }
    //11/9
    // Enter extra payment amount
    System.out.print("Enter extra payment amount, for example, 1000.00: ");
    double extraPaymentAmount =  input.nextDouble();

    // Create Loan object
    Loan loan =
      new Loan(annualInterestRate, numberOfYears, loanAmount);

    // Display loan date, monthly payment, and total payment, and total interest
    System.out.printf("The loan was created on %s%n" +
      "The monthly payment is %.2f%nThe total payment is %.2f%nThe total interest is %.2f%n%n",
      loan.getLoanDate().toString(),
      loan.getMonthlyPayment(), 
      loan.getTotalPayment(),
      loan.getTotalInterest());
    
    extraPayFirstMonth(loan, extraPaymentAmount);
    System.out.println();
    extraPayEveryMonth(loan, extraPaymentAmount);
  }
  
  /** Extra payment first month only */
  public static void extraPayFirstMonth(Loan l, double extraPayment) {
	  System.out.printf("Extra payment only first month $%.2f%n", extraPay);
	  double myLoanAmount =l.getLoanAmount();
	  double myMonthlyInterestRate = l.getAnnualInterestRate()/1200;
	  double myMonthlyPayment = l.getMonthlyPayment();
	  int month= 0;
	  double interest = 0.0;
	  double principal = 0.0;
	  double totalInterest = 0.0;

	  double balanceA1 = myLoanAmount;
	  int monthsA1 = 0;
	  double monthlyInterestRate = myAnnualInterestRate / 1200;
	  while (balanceA1 >= myMonthlyPayment) {
		  // to do A1 same as A2
		  double interestRate = balanceA1 * monthlyInterestRate;
          double principal = myMonthlyPayment - interestRate;
          myLoanAmount -= principal;
          monthaA1++;
	  }
	  if (balanceA1 < myMonthlyPayment) {
		  // to do B1 same as B2
          //Last month
          monthsA1++;
		  balanceA1 = 0;
      }
	  double balanceA2 = myLoanAmount; 
	  int monthsA2 = 0;
	  double monthlyInterestRate = annualInterestRate / 1200;

	  while (balanceA2 >= (myMonthlyPayment + myExtraPayment)) {
		  double interestRate = balanceA2 * monthlyInterestRate;
		  double principal = (myMonthlyPayment + myExtraPayment) - interestRate;
		  balanceA2 -= principal;
		  monthsA2++;

		  if (balanceA2 > 0) {
			  monthsA2++;
			  balanceA2 = 0;
		  }
          
      else {
          //normal month
          double interestRate = myLoanAmount * monthlyInterestRate;
          double principalPaid = myMonthlyPayment - interestRate;
          myLoanAmount -= principalPaid;   
	  }
      
	  double interestSaved = l.getTotalInterest() - totalInterest;
	  /*
	  System.out.println("total interest " + totalInterest);
	  System.out.println("interest saved " + interestSaved);
	  System.out.println("total month " + month);
	  */
	  System.out.printf("Total interest $%.2f%nTotal interest saved $%.2f%nTotal months %d %n",
			  totalInterest, interestSaved, month);	  

  /** Extra payment every month */
  public static void extraPayEveryMonth(Loan l, double extraPay) {
	  System.out.printf("Extra payment every month $%.2f%n", extraPay);
	  double myLoanAmount =l.getLoanAmount();
	  double myMonthlyInterestRate = l.getAnnualInterestRate()/1200;
	  double myMonthlyPayment = l.getMonthlyPayment();
	  int month= 0;
	  double interest = 0.0;
	  double principal = 0.0;
	  double totalInterest = 0.0;
	  
	  while (myLoanAmount >= (myMonthlyPayment + extraPay)) {
		  // to do A2 same as A1
		  // caculate the new month's interest based on myLoanAmount and myMonthlyInterestRate
		  // caculate the principal paid this month from myMonthlyPayment minus the new month's interest
		  // caculate the new myLoanAmount after minus this month's principal, then minus extra payment
		  // add the interest paid this month to totalInterest
		  month++;

	  }
	  while (myLoanAmount >= myMonthlyPayment) {
		  // to do B2 same as B1
		  // caculate the new month's interest based on myLoanAmount and myMonthlyInterestRate
		  // caculate the principal paid this month from myMonthlyPayment minus the new month's interest
		  // caculate the new myLoanAmount after minus this month's principal
		  // add the interest paid this month to totalInterest 
           //variables for scenario B1 (Normal)
          double balanceB1 = loanAmount;
          int monthsB1 = 0;
          // variables for Scenario B2 (With extra payment)
          double balanceB2 = loanAmount;
          int monthsB2 = 0;
          double monthlyInterestRate = annualInterestRate / 1200;
          //Scenario B1
          while (balanceB1 > 0) {
              double interestRate = balanceB1 * monthlyInterstRate;
              double principalPaid = monthlyPayment - interstRate;
              balanceB1 -= principalPaid;
              monthsB1++;
          }
          //Scenario B2
          while (balanceB2 > 0) {
              double interest = balanceB2 * monthlyInterestRate;
              double principalPaid = (monthlyPayment + extraPayment) interestRate; 
              balanceB2 -= principalPaid;
              monthsB2++;
          }
          System.out.println("Normal loan payoff time: " + monthsB1 + "months.");
          System.out.println("Accelerated loan payoff time: " + monthsB2 + "months.");
          System.out.println("Months saved: " (monthsB1 - monthsB2) + "months!");
	  }
	  if (myLoanAmount < myMonthlyPayment) {
		  // to do
		  // caculate the new month's interest based on myLoanAmount and myMonthlyInterestRate
		  // add the interest paid this month to totalInterest
		  month++;
	  }
	  double interestSaved = l.getTotalInterest() - totalInterest;
	  System.out.printf("Total interest $%.2f%nTotal interest saved $%.2f%nTotal months %d %n",
			  totalInterest, interestSaved, month);	  
  }
}
/*
Enter annual interest rate, for example, 8.25: 5.75
Enter number of years as an integer: 15
Enter loan amount, for example, 120000.95: 25000
The loan was created on Sat Oct 21 08:29:24 EDT 2023
The monthly payment is 207.60
The total payment is 37368.45
*/
/*
Enter annual interest rate, for example, 8.25: 5
Enter number of years as an integer: 4
Enter loan amount, for example, 120000.95: 20000
The loan was created on Sun Nov 09 13:57:33 EST 2025
The monthly payment is 460.59
The total payment is 22108.12
*/
