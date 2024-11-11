package txst;
import java.util.*;
public class No7 {
  public static void main(String[] args){
	  Scanner sc=new Scanner(System.in);
	  try{
		  int a=sc.nextInt();
		  if(a==1){
			  System.out.println("Monday");
		  }
		  if(a==2){
			  System.out.println("Tuesday");
		  }
		  if(a==3){
			  System.out.println("Wednesday");
		  }
		  if(a==4){
			  System.out.println("Thursday");
		  }
		  if(a==5){
			  System.out.println("Friday");
		  }
		  if(a==6){
			  System.out.println("Saturday");
		  }
		  if(a==7)
		  {
			  System.out.println("Sunday");
		  }
	  }
	  catch(InputMismatchException e){
		  System.out.println("输入错误");
	  }
	  finally{
		  System.out.println("程序结束");
	  }
  }
}
