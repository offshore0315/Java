package txst;
import java.util.*;
public class No2 {
	public static void main(String[] args) {
    Scanner sc=new Scanner(System.in);
    int[] a=new int[10];
    int x;
    System.out.println("��������������");
    for(int i=0;i<a.length;i++)
    {
    	a[i] = sc.nextInt();
    }
    int max=a[1],min=a[1];
    float avg=0;
    for(int i=0;i<a.length;i++)
    {
    	if(a[i]>max) {
    		max=a[i];
    	}
    }
    for(int i=0;i<a.length;i++){
    	if(a[i]<min) {
    		min=a[i];
    	}
    }
    for(int i=0;i<a.length;i++) {
    	avg+=a[i];
    }
    avg=avg/10;
    System.out.println("��Щ���������ֵΪ"+max);
    System.out.println("��Щ��������СֵΪ"+min);
    System.out.println("��Щ������ƽ��ֵΪ"+avg);
	}
}