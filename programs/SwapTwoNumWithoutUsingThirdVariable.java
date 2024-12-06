public class Main{
	public static void SwapTwoNumWithoutUsingThirdVariable{
		int a = 10;
		int b = 20;
		System.out.println("The Value of variable a is " +a+ " and value of variable b now is "+b);
		a = a + b;
		b = a-b;
		a = a-b;
		System.out.println("The Value of variable a is " +a+ " and value of variable b now is "+b);
	}
}