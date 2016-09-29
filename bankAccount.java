public class bankAccount {

private String account;
private double balance;

public bankAccount(String acc, double bal) {
	account = acc;
	balance = bal;
}
public void deposit(double amount) {
	balance = balance + amount;
}

public double getBalance() {
	return balance;
}

public String getAccount() {
	return account;
}


public static void main(String[] args) {
	bankAccount js = new bankAccount("Jane Doe", 100.00);
	bankAccount jd = new bankAccount("John Smith", 100.00);

	for(int years = 0; years < 10; years++) {
		jd.deposit(jd.getBalance() * 0.05);
	}

	for (int years = 0; years < 20; years++) {
		js.deposit(js.getBalance() * 0.025);
	}
	System.out.println("Jane invested $100 at 5% per year for 10 years");
	System.out.println("After 10 years, " + js.getAccount() + " has $" + js.getBalance());
	System.out.println("John invested $100 at 2.5% per year for 20 years;");
	System.out.println("After 20 years, " + jd.getAccount() + " has $" + jd.getBalance());
}
}