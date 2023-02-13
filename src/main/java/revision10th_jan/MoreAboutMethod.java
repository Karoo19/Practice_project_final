package revision10th_jan;

public class MoreAboutMethod {

	public static void display(int i, int j) {
		System.out.println("I am coding");
	}
	
	public static void display1() {
		System.out.println("i am coding too");
	}
	
	public void display3() {
		System.out.println("hello world");
	}
	
	
	public int add() {
		int a=2; int b=5;
		int sum = a+b;
		System.out.println(sum);
		return sum;
	}
		
	public static void main(String[] args) {
		display(2, 5);
		MoreAboutMethod moreAboutMethod = new MoreAboutMethod();
		moreAboutMethod.display(1, 2);
		MoreAboutMethod sam=new MoreAboutMethod();
		
		sam.display3();
		sam.display1();
		
		MoreAboutMethod sam1= new MoreAboutMethod();
	}


	

}
