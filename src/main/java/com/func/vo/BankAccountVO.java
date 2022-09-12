package com.func.vo;

import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;
import java.util.function.BiFunction;

public class BankAccountVO {
	private int accountNo;
	private double balance;
	private String accountName;
	
	BiFunction<Double, Double, Double> substractFunction = (a, b) -> a - b;
	BiFunction<Double, Double, Double> addFunction = (a, b) -> a + b;
	final Lock lock = new ReentrantLock();
	
	public BankAccountVO(int accountNo, double balance, String accountName) {
		this.accountName = accountName;
		this.accountNo = accountNo;
		this.balance = balance;
	}

	public int getAccountNo() {
		return accountNo;
	}

	public void setAccountNo(int accountNo) {
		this.accountNo = accountNo;
	}

	public double getBalance() {
		return balance;
	}

	public void setBalance(double balance) {
		this.balance = balance;
	}

	public String getAccountName() {
		return accountName;
	}

	public void setAccountName(String accountName) {
		this.accountName = accountName;
	}
	
	public boolean withdraw (double amount) throws InterruptedException{
		if(this.lock.tryLock()) {			
			Thread.sleep(1000);
			double balance = this.getBalance();
			this.balance = substractFunction.apply(balance, amount);
			this.lock.unlock();
			return true;
		}
		
		return false;
	}
	
	
	public boolean deposite(double amount) throws InterruptedException{
		if(this.lock.tryLock()) {
			Thread.sleep(1000);
			double balance = this.getBalance();
			balance = addFunction.apply(balance, amount);
			this.setBalance(balance);
			this.lock.unlock();
			return true;
		}
		return false;
	}
	
	
	public boolean transfere(BankAccountVO toAccount, double amount) throws InterruptedException{
		boolean flag = false;
		
		if(this.withdraw(amount)) {
			System.out.println("Withdrawing amount: " + amount + " from: " + this.getAccountName());
			if(toAccount.deposite(amount)) {
				System.out.println("Depositing amount:" + amount + " to: " + toAccount.getAccountName());
				flag = true;
			}else{
				System.out.println("Failed to acquire both locks: refunding " + amount + " to: " + this.accountName);
				while(!toAccount.deposite(amount)) {
					continue;
				}
			}
		}
			
		return flag;
	}
	
	
	public String toString() {
		StringBuffer strb = new StringBuffer();
		strb.append("\"BankAccount\" : {")
			.append("\"accountNo\" : ").append(this.accountNo).append(",")
			.append("\"accountName\" : ").append(this.accountName).append(",")
			.append("}");
		return null;
	}
}
