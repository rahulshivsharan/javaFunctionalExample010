package com.fn.exem.ex01;

import com.func.vo.AccountVO;

public class BankerMainTest01 {

	public static void main(String[] args) {
		BankerUtil bankerUtil = null;
		AccountVO accountVO = null;
		double anAmount = 10;
		try {
			accountVO = new AccountVO("1032");
			bankerUtil = new BankerUtil();
			
			// Lamda Expresseion 1
			bankerUtil.isBalanceSufficient(accountVO, anAmount, new Exemptable() {
				
				@Override
				public boolean isExemptable(AccountVO account) {					
					return (account.getCreditRating() > 700) ? true : false;
				}
			});
			
			// Lamda Expresseion 2
			Exemptable ex = (AccountVO vo) -> {
				return (vo.getCreditRating() > 700) ? true : false; 
			};			
			bankerUtil.isBalanceSufficient(accountVO, anAmount, ex);
			
			// Lamda Expresseion 3
			ex = (accVO) -> (accVO.getCreditRating() > 700) ? true : false;
			bankerUtil.isBalanceSufficient(accountVO, anAmount, ex);
			
			// Lamda Expresseion 4
			ex = acc -> (acc.getCreditRating() > 700) ? true : false;
			bankerUtil.isBalanceSufficient(accountVO, anAmount, ex);
			
			// Lamda Expresseion 5
			bankerUtil.isBalanceSufficient(accountVO, anAmount, account -> (account.getCreditRating() > 700) ? true : false);
		}catch(Exception e) {
			e.printStackTrace();
		}
	}

}
