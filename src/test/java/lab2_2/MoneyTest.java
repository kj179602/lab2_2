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
}
