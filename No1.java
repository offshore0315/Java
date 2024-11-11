package txst;
import java.util.*;
public class No1 {
	public static void main(String[] args) {
    Scanner sc=new Scanner(System.in);
    System.out.println("请输入整数m:");
    int m=sc.nextInt();
    System.out.println("请输入整数n:");
    int n=sc.nextInt();
    int temp=1;
    if(m<n) {
    	temp=m;
    	m=n;
    	n=temp;
    }
    int p=m*n;
    int r=m%n;
    while(r!=0) {
    	n=r;
    	m=n;
    	r=m%n;
    }
    System.out.println("m和n的最大公约数是"+n);
    System.out.println("m和n的最小公倍数是"+p/n);
	}
}
