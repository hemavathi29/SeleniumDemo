package Test;

import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class PracMouseOverOperation {

	public class testseq 
	{
		@Test (invocationCount = 2, priority = 2)
		public void testcase1()
		{
			System.out.println("Testcase1");
		}
		
		@Test (priority = 1)
		public void testcase2()
		{
			System.out.println("Testcase2");
		}
		
		@BeforeSuite 
		public void beforesuite1()
		{
			System.out.println("Beforesuite1");
		}
		
		@AfterSuite
		public void aftersuite1()
		{
			System.out.println("Afersuite1");
		}
		
		@BeforeTest 
		public void beforetest1()
		{
			System.out.println("beforeTest1");
		}
		
		@AfterTest
		public void aftertest1()
		{
			System.out.println("aftertest1");
		}
		
		@BeforeClass 
		public void beforeclass1()
		{
			System.out.println("beforeclass1");
		}
		
		@AfterClass
		public void afterclass1()
		{
			System.out.println("afterclass1");
		}
		
		@BeforeMethod
		public void beforemethod1()
		{
			System.out.println("beforemethod1");
		}
		
		@AfterMethod 
		public void aftermethod1()
		{
			System.out.println("aftermethod1");
		}
	}	
}
