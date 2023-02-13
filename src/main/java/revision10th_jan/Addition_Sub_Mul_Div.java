package revision10th_jan;

public class Addition_Sub_Mul_Div {
	
	public int addition(int a, int b) {
		int sum = a+b;
		return sum;
	}
	
	public int substraction(int a, int b) {
		int sub =a-b;
		return sub;
	}
	
	public int multiplication(int a, int b) {
		int mul=a * b;
		return mul;
	}
	
	public int division(int a, int b) {
		int div=a/b;
		return div;
	}
	
	public static void main(String[] args) {
		
		Addition_Sub_Mul_Div hello= new Addition_Sub_Mul_Div();
		
		int sumresult = hello.addition(20,30);
		System.out.println("hello is "+sumresult);
		
		int subresult=hello.substraction(20, 30);
		System.out.println("hello is "+subresult);
		
		int mulresult = hello.multiplication(20, 30);
		System.out.println("hello is "+mulresult);
		
		int divresult = hello.division(20, 30);
		System.out.println("hello is "+ divresult);
	}

}
