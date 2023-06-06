package application;

import java.text.DecimalFormat;
import java.util.Locale;
import java.util.Scanner;

import model.entities.Account;
import model.exceptions.InsufficientBalanceException;
import model.exceptions.WithdrawLimitExceededException;

public class Program {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
        Scanner scanner = new Scanner(System.in);
		        
		        System.out.println("Enter account data");
		        System.out.print("Number: ");
		        Integer number = scanner.nextInt();
		        scanner.nextLine();
		        System.out.print("Holder: ");
		        String holder = scanner.nextLine();
		        System.out.print("Initial balance: ");
		        Double initialBalance = scanner.nextDouble();
		        System.out.print("Withdraw limit: ");
		        Double withdrawLimit = scanner.nextDouble();

		        Account account = new Account(number, holder, initialBalance, withdrawLimit);

		        System.out.print("Enter amount for withdraw: ");
		        Double amount = scanner.nextDouble();
		        
		        DecimalFormat decimalFormat = new DecimalFormat("0.00");
		        
		        try {
		            account.withdraw(amount);
		            System.out.println("New balance: " + decimalFormat.format(account.getBalance()));
		        }
		        
		        catch (InsufficientBalanceException e) {
		            System.out.println("Withdraw error: " + e.getMessage());
		        }
		        
		        catch (WithdrawLimitExceededException e) {
		            System.out.println("Withdraw error: " + e.getMessage());
		        }
		        
		        
scanner.close(); 
	}
}
