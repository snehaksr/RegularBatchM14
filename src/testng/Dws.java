package testng;

import org.testng.Reporter;
import org.testng.annotations.Test;

public class Dws {
@Test
public void dws()
{
	Reporter.log("dws",true);
}
@Test
public void test()
{
	System.out.println("Hi test");
}
@Test
public void cat()
{
	System.out.println("Hi Cat.............");
}
}
