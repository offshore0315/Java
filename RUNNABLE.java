package text;

public class RUNNABLE {
	public static void main(String[]args) {
  Thread threada=new Thread(new MyThreadA());
  Thread threadb=new Thread(new MyThreadB());
  threada.start();
  threadb.start();
  try {
		threadb.join();
	} catch (InterruptedException e) {
		e.printStackTrace();
	}
	   try {
		threada.sleep(1000);
	} catch (InterruptedException e) {
		e.printStackTrace();
	}
	}
  
}
class MyThreadA implements Runnable{
	public void run() {
		for( int i=1 ; i<101 ; i++ ){
		    if(i%2 != 0)
		    System.out.println("奇数："+i);
		 }
		}
}
class MyThreadB implements Runnable{
	public void run(){
		//找出1-100之间所有的素数（质数）
		//1-100之间
		for(int i=1; i<=100; i++){
			//里面的代码会运行100遍
			//每一遍i的值是不同的，i=1,2,3,4,5...100
			//每一遍都要判断i是否是素数，如果是，就打印i
			//（1）假设i是素数
			boolean flag = true;//true代表素数
			//（2）找i不是素数的证据
			for(int j=2; j<i; j++){
				if(i%j==0){
					flag = false;//找到一个就可以了
					break;
				}
			}
			//（3）判断这个flag
			if(flag){
				System.out.println("素数"+i);
			}
		}
	}
}