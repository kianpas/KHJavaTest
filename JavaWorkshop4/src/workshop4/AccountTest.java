package workshop4;

public class AccountTest {

	public static void main(String[] args) {
		Account account;
		
		account = new Account("계좌정보 : 441-0290-1203 현재잔액 : ", 500000, 0.073);
				
		System.out.println(account.getAccount() + account.getBalance());
		
		account.deposit(20000);
		
		System.out.println(account.getAccount() + account.getBalance());
						
		System.out.println("이자 :" + account.calculateInterest());
		
	}
	

}
