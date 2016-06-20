package main;

import static org.junit.Assert.*;

import org.junit.Test;

public class BankTest {

	@Test
	public void testAccount() {
		Bank test = new Bank();
		Account result = test.selectAccount(10);
		assertEquals(10, result);
		fail("Not yet implemented");
	}

}
