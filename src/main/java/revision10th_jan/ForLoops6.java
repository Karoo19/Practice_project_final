package revision10th_jan;

public class ForLoops6 {

	public static void main(String[] args) {
		//WAP to print 20 multiples of 5 in decreasing 250 order to starting from 250 and add
		//250,245,240...20=sum

		int value=250;
		int sum=0;
		int limit=20;
		
		while(limit>=0) {
			sum=sum+value;
			System.out.println(value);
			value=value-5;
			limit--;
		}
		System.out.println("the sum is "+ sum );
	}

}
