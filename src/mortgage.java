import java.util.Scanner;
public class mortgage {

	public static void main(String[] args) {
		
		Scanner tim = new Scanner(System.in);
		
		double loan = 0;
		double interestRate = 0;
		double monthlyPayment = 0;
		double balance = 0;
		int compoundPeriod = 0;
		int term;
		
		System.out.println("Enter the loan ammount: ");
		loan = tim.nextDouble();
		
		System.out.println("Enter the interest rate on the loan: ");
		interestRate = tim.nextDouble();
		
		System.out.println("Enter the term(years) for the loan payment: ");
		term = tim.nextInt();
		
		System.out.println("\n============================================\n");
		
		monthlyPayment = getmonthlyPayment(loan, interestRate,term);
		balance = -(monthlyPayment * (term *12));
		System.out.format("%-30s$%-+10.2f%n", "Amount owed to bank:", balance);
		System.out.format("%-30s$%-10.2f%n", "Minimum monthly payment:", monthlyPayment);
		
	}
	
	public static double getmonthlyPayment(double loan, double interestRate, double term){
		double rate = (interestRate / 100 /12);
		double base = (rate + 1);
		double months = term * 12;
		double results = 0;
		results = loan * (rate *(Math.pow(base, months)) / ((Math.pow(base, months)) -1));
		
		return results;
	}
		
	}
	
	


