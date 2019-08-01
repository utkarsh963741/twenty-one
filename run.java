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
				int d = hn.nextInt();
			z = z + d;
			
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
				    System.out.println("You Lose");
				}
				int d = hn.nextInt();
			z = z + d;
			
			i = z;
			if(i >= 21) {
				k = false;
				z=21;
				System.out.println("You Win");
			}
			}
			
			System.out.println(z);
		}
		hn.close();
	}
}