import junit.framework.Assert;
import org.junit.Before;
import org.junit.Test;

public class BankAccountTest {
	
	private BankAccount account;

	@Before
	public void setUp() {
		account = new BankAccount();
		account.deposit(100);
	}
	
	@Test
	public void depositTest() {
		account.deposit(200);
		Assert.assertEquals(300.0, account.getBalance());
		account.deposit(200);
		Assert.assertEquals(500.0, account.getBalance());
	}

	@Test
	public void interestTest() {
		account.addInterest();
		Assert.assertEquals(101.5, account.getBalance());
	}
}