package lab08;

public class Program {

	public static void main(String[] args) {
		Account alexsAccount = new Account(1234, 100, "Alex");
		System.out.println(alexsAccount.getDetails());
		alexsAccount.deposit(-19999);
		System.out.println(alexsAccount.getBalance());
		alexsAccount.addInterest();
		System.out.println(alexsAccount.getDetails());
		Account partnerAccount = alexsAccount;
		partnerAccount.addInterest();
		System.out.println(alexsAccount.getDetails());
		processAccount(alexsAccount);
		System.out.println(alexsAccount.getDetails());
		int k = 100;
		incInt(k);
		System.out.println(k);
	}
	static void processAccount(Account acc) { 
		acc.addInterest();
	}
	private static void incInt(int x) {

		x++;

		}
}
