package txst;
import java.util.*;
public class No3 {
 public static void main(String[] args) {
	 Scanner sc=new Scanner(System.in);
	
	 for(int m = 100;m<199;m++) {
		 boolean flag = true;
		for(int n = 2;n<m;n++) {
			if(m%n==0) {
				flag = false;
				break;
			}
			
		}
		if (flag == true) {
			System.out.println(m);
		}
	 }
 }
}