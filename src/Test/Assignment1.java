package Test;

class A
{
	void testA()
	{
		System.out.println("A1");
	}
	void testB()
	{
		System.out.println("B1");
	}
}

class B extends A
{
	void testB()
	{
		System.out.println("B2");
	}
	void testC()
	{
		System.out.println("C2");
	}
}


public class Assignment1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		B b1 = new B();
		b1.testA();
		b1.testB();
		b1.testC();
		
		A a1 = b1;
		a1.testA();
		a1.testB();
	}
}
