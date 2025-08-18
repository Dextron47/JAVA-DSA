package class_and_objects;

import java.util.Scanner;

class ATM{
	
	float balance;
	int PIN = 1234;
	
	public void checkPin(){
		System.out.println("Enter your pin : ");
		Scanner sc = new Scanner(System.in);
		int enteredPIN = sc.nextInt();
		
		if(enteredPIN == PIN) {
			menu();
		}else {
			System.out.println("Enter a valid PIN");
			menu();
		}
	}
	
	
	public void menu() {
		System.out.println("Enter your choice : ");
		System.out.println("1. Check A/C balance : ");
		System.out.println("2. Withdraw money : ");
		System.out.println("3. Deposit money : ");
		System.out.println("4. EXIT");
		Scanner sc = new Scanner(System.in);
		
		int choice = sc.nextInt();
		
		if(choice == 1) {
			checkBalance();
		}
		else if (choice == 2) {
			withdrawMoney();
		}
		else if (choice == 3) {
			depositMoney();
		}else if (choice == 4) {
			return;
		}else {
			System.out.println("Enter valid choice!!!");
		}
	}
	
	public void checkBalance() {
		System.out.println("Balance : " + balance);
		menu();
	}
	
	public void withdrawMoney() {
		System.out.println("Enter amount to withdraw : ");
		Scanner sc = new Scanner(System.in);
		
		int wAmount = sc.nextInt();
		
		if(wAmount > balance) {
			System.out.println("Insufficient balance");
		}else {
			balance = balance - wAmount;
			System.out.println("Money withdrawal successfully!!!");
		}
		
		menu();
	}
	
	public void depositMoney() {
		System.out.println("Enter the amount to deposit : ");
		Scanner sc = new Scanner(System.in);
		
		int dAmount = sc.nextInt();
		
		balance = balance + dAmount;
		System.out.println("Monney deposited successfully!!!");
		
		menu();
	}

	
}


public class ATMMachine {
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		ATM atm = new ATM();
		atm.checkPin();
		
	}

}
