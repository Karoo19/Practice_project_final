package revision10th_jan;

public class StaticNoStatic {
	
	public static void main (String[] args) {
		
		System.out.println("this is main method");
		test1();
		test2();
		test3();
		
		StaticNoStatic StaticNoStatic= new StaticNoStatic();
		StaticNoStatic.test4();
		StaticNoStatic.test5();
		StaticNoStatic.test6();
		
	}
	
	private static void test1() {
		System.out.println("this is static");
	}
	
	private static void test2() {
		System.out.println("this is static");
	}
	
	private static void test3() {
		System.out.println("this is static");
	}
	
	private  void test4() {
		System.out.println("this is no static");
	}

	private  void test5() {
		System.out.println("this is no static");
	}
	private  void test6() {
		System.out.println("this is no static");
	}
}
