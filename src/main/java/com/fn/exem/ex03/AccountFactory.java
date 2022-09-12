package com.fn.exem.ex03;

import com.func.vo.BankAccountVO;

@FunctionalInterface
public interface AccountFactory {
	BankAccountVO getBankAccount(int id, double balance, String accountName);
}
