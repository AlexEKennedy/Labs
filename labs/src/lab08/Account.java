package lab08;

import java.util.Scanner;

public class Account {
	private int id;
	private double balance;
	private String owner;
	
	public Account(int id, double balance, String owner) {
		this.id = id;
		this.balance = balance;
		this.owner = owner;
	}
	
	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public double getBalance() {
		return balance;
	}
	
	public void setBalance(double balance) {
		this.balance = balance;
	}

	public String getOwner() {
		return owner;
	}

	public void setOwner(String owner) {
		this.owner = owner;
	}
	public String getDetails() {
		return ("Owner: " + getOwner() + " id: " + getId() + " balance: " + getBalance());
	}

	void withdraw(double amount) {
		if (amount > balance) {
			System.out.println("Can't withdraw more than balance");
		} else {
			balance -= amount;
		}
	}
	void deposit(double amount) {
			if (amount < 0) {
				System.out.println("Invalid deposit amount");
			}
			else {
				balance += amount;
			}
		}
	public void addInterest() {
		balance *= 1.025;
	}
}