package TestNG_Group;

import org.testng.annotations.Test;

public class Sample2 {
	@Test(groups="smoke")
	public void demo3()
	{
		System.out.println("Hi demo3");
	}
	
	@Test(groups="smoke")
	public void demo4()
	{
		System.out.println("Hi demo4");
	}
}
