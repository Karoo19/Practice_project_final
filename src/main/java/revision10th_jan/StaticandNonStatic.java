package revision10th_jan;

public class StaticandNonStatic {

	String name= "john";
	int i=5;
	
	public static void display(int i, int b) {
		int j=5;
	}
	
	public static void hello() {
		System.out.println("hello world");
		
	}
	
	public void test() {
		System.out.println("hello hello");
	}
	
	public static void main(String [] args) {
		
		display(1, 2);
		StaticandNonStatic cool=new StaticandNonStatic();
		
		cool.hello();
		cool.test();
		
		StaticandNonStatic cooll= new StaticandNonStatic();
	}
	
	
	
	
}



