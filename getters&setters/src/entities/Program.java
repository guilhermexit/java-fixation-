package entities;

import java.util.Locale;
import java.util.Scanner;
import entities.Bank;

public class Program {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		Bank bank;
		
		System.out.print("Enter account number: ");
		int accNumber = sc.nextInt();
		System.out.println("Enter the account name: ");
		sc.nextLine();
		String accName = sc.nextLine();
		System.out.println("Is there an initial deposit: ");
		char response = sc.next().charAt(0);
		if(response == 'y') {
			System.out.println("Enter the initial deposit value: ");
			double initialDeposit = sc.nextDouble();
			bank = new Bank(accNumber, accName, initialDeposit);
		}else {
			bank = new Bank(accNumber, accName);
		}
		System.out.println();
		System.out.println("Account data: ");
		System.out.println(bank);
		System.out.println();
		System.out.print("Enter a deposit value: ");
		double depositValue = sc.nextDouble();
		bank.deposit(depositValue);
		System.out.println(bank);
		System.out.println();
		System.out.print("Enter a withdrawa value: ");
		double withdrawValue = sc.nextDouble();
		bank.withdrawal(withdrawValue);
		System.out.println(bank);

		sc.close();
	}

}
