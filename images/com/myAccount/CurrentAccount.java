<<<<<<< HEAD
package com.myAccount;

public class CurrentAccount extends Account {

	public CurrentAccount() {

	}

	public CurrentAccount(String accountHolderName, int accbalance) {
		super(accountHolderName, accbalance);
	}

	@Override
	public void deposit(int amount) {
		if (amount > 0) {
			int accbalance = getAccbalance();
			accbalance = accbalance + amount;
			setAccbalance(accbalance);
			System.out.println("Rupees:" + amount + " Deposited Successfully...");
		} else {
			throw new InvalidAmountException();
		}

	}

	@Override
	public void withdraw(int amount) {
		if (amount <= getAccbalance() && amount>0) {
			int accbalance = getAccbalance();
			accbalance = accbalance - amount;
			setAccbalance(accbalance);
			System.out.println("Rupees :" + amount + " WithDrawn Successfully");
		} else {
			throw new InSufficentBalanceException();
		}

	}

	@Override
	public int showBalance() {
		return getAccbalance();
	}

	@Override
	public int calculateInterest() {
		return getAccbalance() * 4;
	}

	public void displayCurrentAccount() {
		System.out.println("AccountNo:" + getAccountNo());
		System.out.println("AccountHolderName:" + getAccountHolderName());
		System.out.println("AccountBalance:" + getAccbalance());
		System.out.println("Interest:" + calculateInterest());
		System.out.println("--------------------------------------");
	}

	public CurrentAccount getAccountDetails() {
		return new CurrentAccount();
	}

}
=======
package com.myAccount;

public class CurrentAccount extends Account {

	public CurrentAccount() {

	}

	public CurrentAccount(String accountHolderName, int accbalance) {
		super(accountHolderName, accbalance);
	}

	@Override
	public void deposit(int amount) {
		if (amount > 0) {
			int accbalance = getAccbalance();
			accbalance = accbalance + amount;
			setAccbalance(accbalance);
			System.out.println("Rupees:" + amount + " Deposited Successfully...");
		} else {
			throw new InvalidAmountException();
		}

	}

	@Override
	public void withdraw(int amount) {
		if (amount <= getAccbalance() && amount>0) {
			int accbalance = getAccbalance();
			accbalance = accbalance - amount;
			setAccbalance(accbalance);
			System.out.println("Rupees :" + amount + " WithDrawn Successfully");
		} else {
			throw new InSufficentBalanceException();
		}

	}

	@Override
	public int showBalance() {
		return getAccbalance();
	}

	@Override
	public int calculateInterest() {
		return getAccbalance() * 4;
	}

	public void displayCurrentAccount() {
		System.out.println("AccountNo:" + getAccountNo());
		System.out.println("AccountHolderName:" + getAccountHolderName());
		System.out.println("AccountBalance:" + getAccbalance());
		System.out.println("Interest:" + calculateInterest());
		System.out.println("--------------------------------------");
	}

	public CurrentAccount getAccountDetails() {
		return new CurrentAccount();
	}

}
>>>>>>> ff9f301574262c0ac3e618abc7dd3b0003b2a65c
