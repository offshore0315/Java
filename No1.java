package txst;
import java.util.*;
public class No1 {
	public static void main(String[] args) {
    Scanner sc=new Scanner(System.in);
    System.out.println("����������m:");
    int m=sc.nextInt();
    System.out.println("����������n:");
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
    System.out.println("m��n�����Լ����"+n);
    System.out.println("m��n����С��������"+p/n);
	}
}
