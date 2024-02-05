package basic;

public class Calculator implements Calsi
{
	 int a = 10;
	 int b=20;
	 public void add()
	 {
		 System.out.println(a+b);
	 }
	 public void sub()
	 {
		 System.out.println(a-b);
	 }
	 public static void main(String[] args) 
	 {
		Calsi c = new Calculator();
		c.add();
		c.sub();
	}
}
