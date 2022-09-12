package com.fn.exem.ex01;

import com.func.vo.AccountVO;

public class BankerUtil {
	public boolean isBalanceSufficient(AccountVO account, double amount, Exemptable ex) {
		this.logAccess(account);
		boolean isBalanceSufficient = false;
		
		isBalanceSufficient = ((account.getBalance() - amount) > 0) ? true : false;
		
		if(!isBalanceSufficient) {
			
			if(ex.isExemptable(account)) {
				isBalanceSufficient = true;
				this.alertOverdraw(account);
			}
		}
		
		return isBalanceSufficient;	
	}
	
	private void logAccess(AccountVO account) {
		System.out.println("Account has been accesed "+account.getAccountId());
	}
	
	private void alertOverdraw(AccountVO account) {
		System.out.println("Account has been overdrawn "+account.getAccountId());	
	}
}
