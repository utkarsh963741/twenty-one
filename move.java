import java.util.*;
import java.io.*;

public class Logic extends input {
	 public static Scanner sc = new Scanner(System.in);
                
     public static int move(int z){
     	double d = Math.random();
       if(d<= 0.3333)
       	z += 1;
       else if(d<=0.6666 && d>=0.33333)
       	z += 2;
       else 
       	z += 3;

       	return z;

     }
    


}