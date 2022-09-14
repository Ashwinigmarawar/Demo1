package POM;

import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class TestNGpractice 
{

	@Test(priority=1)
	public void Test1()
	{
		System.out.println("Succesfully run Test1");
	}
	@Test(enabled=false)
	public void Test2()
	{
		System.out.println("Succesfully run Test2");
	}
	@Test(invocationCount=3)
	public void Test3()
	{
		System.out.println("Succesfully run Test3");
	}
	@Test(dependsOnMethods= {"Test1"},timeOut=2000)
	public void Test4()
	{
		System.out.println("Succesfully run Test4");
	}
	@BeforeClass
	public void Beforeclass()
	{
		System.out.println("Successfully run BeforeClass");
	}
	@AfterClass
	public void afterclass()
	{
		System.out.println("Successfully run AfterClass");
	}
	@BeforeMethod
	public void beforemethod()
	{
		System.out.println("Successfully run Beforemethod");
	}
	@AfterMethod
	public void aftermethod()
	{
		System.out.println("Successfully run aftermethod");
	}
    @BeforeTest
    public void beforetest()
    {
    	System.out.println("Successfully run BeforeTest");
    }


}
