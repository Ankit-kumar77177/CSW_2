package Assignment_1;

import java.util.*;

class bankaccount {
	private double balance;

	public bankaccount(double initialbalance) {
		this.balance = initialbalance;
	}

	public double getbalance() {
		return balance;
	}

	public void deposite(double amt) {
		balance += amt;
	}

	public void withdraw(double amt) {
		if (balance >= amt) {
			balance = balance - amt;
		} else {
			System.out.println("your balance is insufficient");
		}

	}
}

class savingAccount extends bankaccount {
	private double withdrawLimt;

	public savingAccount(double initialbalance, double withdrawLimt) {
		super(initialbalance);
		this.withdrawLimt = withdrawLimt;
	}

	public void withdraw(double amt) {
		if (amt <= withdrawLimt) {
			super.withdraw(amt);

		} else {
			System.out.println("withdraw limit exceed");
		}
	}
}

public class Q_7 {

	public static void main(String[] args) {
		bankaccount savingAccount = new savingAccount(2000, 650);
		widthfromAccount(savingAccount, 300);
		System.out.println("Saving account balance " + savingAccount.getbalance());

	}

	public static void widthfromAccount(bankaccount Account, double amt) {
		Account.withdraw(amt);

	}

}
