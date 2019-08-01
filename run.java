import java.util.*;

public class Run extends Logic {

	public static void main(String[] args) {

		inp();
		int i = 0;
		int z;
		boolean k =true;
		String s = "0";

		while(k) {

			if(i == 0) {
				System.out.println("0");
				z = move(0);
				s = s + " " + z;
				i = z;
			}
			else { 
				z = move(z);
				s = s + " " + z;
				i = z;
			}
			d = sc.nextInt();
			if(d > 3){
				System.out.println("Error");
			}
			else {
				z = z + d;
			}
			if(i >= 21) {
				k = False;
			}
			s = s + " " + z;
			i = z;
			System.out.println(s);
		}
	}
}