import static org.junit.Assert.*;

import org.junit.Test;

public class EcafeTest {

	@Test
	public void test() {
		ECafe obj=new ECafe();
		Order obj1= new Order();
		int menuSelection=1;
		obj1.itemPrice=300;
		obj1.itemSelected="fries";
		obj1.itemTime=3;
		
		assertEquals(1,menuSelection);
		assertEquals(300,obj1.itemPrice);
		
		assertNotNull(obj1.itemPrice);
		assertNotNull(obj1.itemTime);
		assertNotNull(obj1.itemSelected);
		
		
	}

}
