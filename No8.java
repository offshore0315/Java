package txst;
import java.util.*;
public class No8 {
   public static void main(String[] args) {
	   Scanner sc=new Scanner(System.in);
	   System.out.print("请输入学生个数和考试科目数：");
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
		System.out.println("\n"+"第"+(i+1)+"个同学的平均成绩为：");
		System.out.printf("%.2f",a[i][n]);  
	   }
	   }
   }
	   catch(InputMismatchException e) {
			System.out.print("输入类型有误！");
		}
	   catch(ZeroException e) {
			System.out.print("无法计算平均成绩！");
		}
	   catch(ScoreException e) {
		   System.out.println("成绩不在正常范围内");
	   }
   }
  
}

class ZeroException extends Exception{
	ZeroException(){
		super("0除");
	}	
}
class ScoreException extends Exception{
	ScoreException(){
		super("超出范围");
	}
}