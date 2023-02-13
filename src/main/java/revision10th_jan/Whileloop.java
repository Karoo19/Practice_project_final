package revision10th_jan;

public class Whileloop {

	public static void main(String[] args) {
		//30 multiples of 9
		//starting point is 999
		//add only the even multiples
		
		//999, 990, 981,
		//999 is the 1st value
		//990 is 2nd value    (added)
		//981 is 3rd value
		//972 is 4th value   (added)
		
		int value=999;
		int sum=0;
		int limit=30;
		
		while(limit%2==0) {
			sum=sum+value;
			
			System.out.println("number even is "+ sum);
			value=value-9;
			limit--;
		}

	}

}
