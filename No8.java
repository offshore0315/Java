package txst;
import java.util.*;
public class No8 {
   public static void main(String[] args) {
	   Scanner sc=new Scanner(System.in);
	   System.out.print("������ѧ�������Ϳ��Կ�Ŀ����");
	   int m,n;
	   double[][] a;
	   try {
	   m=sc.nextInt();
	   n=sc.nextInt();
	   if(n == 0)
			throw new ZeroException();
	   else {
		    a=new double[m][n+1];
		   for(int i=0;i<m;i++) {
			   for(int j=0;j<n;j++) {
				   a[i][j]=sc.nextDouble();
				   a[i][n] = a[i][n] + a[i][j];
				   if(a[i][j]>100||a[i][j]<0) {
					   throw new ScoreException();
				   }
			   }
		   }
		   
	   for(int i=0;i<m;i++) {
		a[i][n]=a[i][n]/n;
		System.out.println("\n"+"��"+(i+1)+"��ͬѧ��ƽ���ɼ�Ϊ��");
		System.out.printf("%.2f",a[i][n]);  
	   }
	   }
   }
	   catch(InputMismatchException e) {
			System.out.print("������������");
		}
	   catch(ZeroException e) {
			System.out.print("�޷�����ƽ���ɼ���");
		}
	   catch(ScoreException e) {
		   System.out.println("�ɼ�����������Χ��");
	   }
   }
  
}

class ZeroException extends Exception{
	ZeroException(){
		super("0��");
	}	
}
class ScoreException extends Exception{
	ScoreException(){
		super("������Χ");
	}
}