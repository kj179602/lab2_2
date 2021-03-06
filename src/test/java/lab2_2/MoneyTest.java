package lab2_2;

import static org.junit.Assert.*;

import org.junit.Test;
import static org.hamcrest.CoreMatchers.*;
import pl.com.bottega.ecommerce.sharedkernel.Money;

public class MoneyTest {

	@Test
	public void testMoneySubtract6PLN_4PLN(){
		Money money1 = new Money(6,"PLN");
		Money money2 = new Money(4,"PLN");
		Money expected = new Money(2,"PLN");
		
		assertThat(money1.subtract(money2), is(expected));
	}
	
	@Test
	public void testMoneyLessThan7ExpectedFalse(){
		Money money1 = new Money(7,"PLN");
		Money money2 = new Money(2,"PLN");
		
		assertThat(money1.lessThan(money2), is(false));
	}
	
	@Test
	public void testMoneyLessThan7ExpectedTrue(){
		Money money1 = new Money(7,"PLN");
		Money money2 = new Money(8,"PLN");
		
		assertThat(money1.lessThan(money2), is(true));
	}
	
	@Test
	public void testMoneyGreaterThan5ExpectedTrue(){
		Money money1 = new Money(6,"PLN");
		Money money2 = new Money(5,"PLN");
		
		assertThat(money1.greaterThan(money2), is(true));
	}
	
	@Test
	public void testMoneyGreaterThan5ExpectedFalse(){
		Money money1 = new Money(2,"PLN");
		Money money2 = new Money(5,"PLN");
		
		assertThat(money1.greaterThan(money2), is(false));
	}
	@Test
	public void testMoneyEquals4ExpectedTrue(){
		Money money1 = new Money(4,"PLN");
		Money money2 = new Money(4,"PLN");
		
		assertThat(money1.lessOrEquals(money2), is(true));
	}
	
	@Test
	public void testMoneyEquals4ExpectedFalse(){
		Money money1 = new Money(6,"PLN");
		Money money2 = new Money(4,"PLN");
		
		assertThat(money1.lessOrEquals(money2), is(false));
		
	}
	
	@Test
	public void testMoneyAddExpectedTrue(){
		Money money1 = new Money(12,"PLN");
		Money money2 = new Money(13,"PLN");
		Money expected = new Money(25,"PLN");
		
		assertThat(money1.add(money2), is(expected));
	}
	
}
