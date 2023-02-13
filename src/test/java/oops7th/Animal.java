package oops7th;

public class Animal {

	String name = "Marcus";
	String bread = "Lebrador";
	int age = 5;
	String color = "farm";

	public static void main(String[] args) {

		Animal dog = new Animal();
		System.out.println("dog.name");
		System.out.println("dog.bread");
		System.out.println("dog.age");
		System.out.println("dog.color");

		dog.barking();
		dog.eating();
		dog.sleeping();
		// sleeping();
		

		Bird test= new Bird();
		test.fly();
		test.speaking();
		test.nameBird = "pet";

	}

	public void barking() {
		System.out.println("Marcus barking");
	}

	public void eating() {
		System.out.println("Marcus eating");
	}

	public void sleeping() {
		System.out.println("Marcus sleeping");
	}

	class Bird {

		String nameBird;

		public void fly() {
			System.out.println("fly");
		}

		public void speaking() {
			System.out.println("speak");
		}
	}

}
