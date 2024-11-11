package txst;
import java.util.*;
public class No2 {
	public static void main(String[] args) {
    Scanner sc=new Scanner(System.in);
    int[] a=new int[10];
    int x;
    System.out.println("请输入数组整数");
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
    System.out.println("这些整数的最大值为"+max);
    System.out.println("这些整数的最小值为"+min);
    System.out.println("这些整数的平均值为"+avg);
	}
}