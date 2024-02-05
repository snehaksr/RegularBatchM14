package testng;

import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class ChronologicalOrder {
@BeforeSuite
public void beforeSuite()
{
	System.out.println("Before suite");
}
@BeforeClass
public void beforeclass()
{
	System.out.println("Before class");
}
@BeforeMethod
public void beforemethod()
{
	System.out.println("Before method");
}
@Test
public void test()
{
	System.out.println("Test........");
}
@Test
public void test123()
{
	System.out.println("Test 1234************");
}
@AfterMethod
public void afterMethod()
{
	System.out.println("after Method");
}

@AfterTest
public void afterTest()
{
	System.out.println("After Test");
}
@Test
public void test345()
{
	System.out.println("Test 345========");
}
@BeforeTest
public void beforetest()
{
	System.out.println("Before test");
}
@AfterSuite
public void afterSuite()
{
	System.out.println("After Suite");
}@AfterClass
public void afterClass()
{
	System.out.println("After Class");
}
}
