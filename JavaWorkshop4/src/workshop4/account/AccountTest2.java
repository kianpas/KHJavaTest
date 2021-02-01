package workshop4.account;

import workshop4.Account;

public class AccountTest2 {

	public static void main(String[] args) {
		
		
		Account[] account = new Account[5];

		for (int i = 0; i < account.length; i++) {
			account[i] = new Account("221-0101-211" + (i + 1), 100000, 0.045);
		}

		for (int i = 0; i < account.length; i++) {
			System.out.println(account[i].accountInfo());
		}
		System.out.println();
//		for (Account a : account) {
//			System.out.println(a.accountInfo());
//		}
		
		for (int i = 0; i < account.length; i++) {
			account[i].setInterestRate(0.037);
			System.out.println(account[i].accountInfo() + " 이자 : " + (int)(account[i].getBalance()*account[i].getInterestRate()) + "원");
		}
		
	}

}
