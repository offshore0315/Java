package text;
import java.util.*;
public class No9{
	public static void main(String[] args)  {
		Scanner sc=new Scanner(System.in);
		System.out.println("请输入要求的阶乘n!的值:");
		int n=sc.nextInt();
		No9 fac=new No9();
		try {
			fac.fact(n);
		} catch (OutOfRangeException e) {
			System.out.println(e.getMessage());
		}
		
	}

	 void fact(int n)  throws OutOfRangeException{
		int sum=1;
		for(int i=1;i<n+1;i++) {
			sum*=i;
			if(sum>Byte.MAX_VALUE) {
				throw new OutOfRangeException();
			}
		}
		byte result=(byte)sum;
		System.out.println("阶乘n！的值为："+result);
}
}
class OutOfRangeException extends Exception{
	 OutOfRangeException(){
		super("阶乘n！的值超出byte数据类型的范围");
	}
}