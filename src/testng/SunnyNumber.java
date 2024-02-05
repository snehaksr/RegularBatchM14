package testng;

import org.testng.annotations.Test;

public class SunnyNumber {
@Test

public void sunny()
{
	int n = 9;
	int n1 = n+1;
	int root=0;
	for(int i=1;i<=n1;i++)
	{
		if(i*i==n1)
		{
			root=1;
			break;
		}
	}
	if(root==1)
	{
		System.out.println("The given number is sunny number");
	}
	else
	{
		System.out.println("Not sunny number");
	}
}
}
