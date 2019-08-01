import java.util.*;

public class Run extends Logic {

	public static void main(String[] args) {

	    Scanner hn = new Scanner(System.in);
		imp();
		int i = 0;
		int z=0;
		boolean k =true;
		String s = "0";

		while(k) {

			if(i == 0) {
				System.out.println("0");
				z = move(0);
				i = z;
				System.out.println("increase value by:");
				int d = hn.nextInt();
				if(d>3){
				    System.out.println("vaule entered is out of bounds(must be less than 3)... sorry!rerun to replay");
				    System.exit(0);
				}
				
			z = z + d;
			    
			System.out.println("computer's move ");
			System.out.println("value now at:"+z);
			
			i = z;
			if(i >= 21) {
				k = false;
				z=21;
			}
			}
			else { 
				z = move(z);
				i = z;
				if(i >= 21) {
				    System.out.println("Computer Wins");
				}
				System.out.println("increase value by:");
				int d = hn.nextInt();
				if(d>3){
				    System.out.println("vaule entered is out of bounds(must be less than 3)... sorry!rerun to replay");
				    System.exit(0);
				}
				
			z = z + d;
			System.out.println("computer's move");
			System.out.println("value now at:"+z);
            
			
			i = z;
			if(i >= 21) {
				k = false;
				z=21;
				System.out.println("You Win");
			}
			}
			
		}
		hn.close();
	}
}