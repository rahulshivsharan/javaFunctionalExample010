package com.func.vo;

public class AccountVO {
	private final String accountId;
	private final int creditRating;
	private double balance;
	
	public AccountVO() {
		this.accountId = "default";
		this.creditRating = 700;
		this.balance = 0;
	}
	
	public AccountVO(String accountId) {
		this.accountId = accountId;
		this.creditRating = 700;
		this.balance = 0;
	}
	
	public AccountVO(String accountId, int creditRating, double balance) {
		this.accountId = accountId;
		this.creditRating = creditRating;
		this.balance = balance;
	}

	public String getAccountId() {
		return accountId;
	}

	public int getCreditRating() {
		return creditRating;
	}

	public double getBalance() {
		return balance;
	}
	
	
	
}
