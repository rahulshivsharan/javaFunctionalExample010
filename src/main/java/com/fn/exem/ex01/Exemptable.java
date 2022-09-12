package com.fn.exem.ex01;

import com.func.vo.AccountVO;

@FunctionalInterface
public interface Exemptable {
	boolean isExemptable(AccountVO account);
}
