package text;

public class ExtendsThread {
   public static void main(String []args) {
	   Thread threada=new MyThreadA();
	   Thread threadb=new MyThreadB();
	   threada.start();
	   threadb.start();
   }
}
class MyThreadA extends Thread{
	public void run() {
    for( int i=1 ; i<101 ; i++ ){
	    if(i%2 != 0)
	    System.out.println("������"+i);
	 }
	}
}
class MyThreadB extends Thread{
	public void run(){
		//�ҳ�1-100֮�����е�������������
		//1-100֮��
		for(int i=1; i<=100; i++){
			//����Ĵ��������100��
			//ÿһ��i��ֵ�ǲ�ͬ�ģ�i=1,2,3,4,5...100
			//ÿһ�鶼Ҫ�ж�i�Ƿ�������������ǣ��ʹ�ӡi
			//��1������i������
			boolean flag = true;//true��������
			//��2����i����������֤��
			for(int j=2; j<i; j++){
				if(i%j==0){
					flag = false;//�ҵ�һ���Ϳ�����
					break;
				}
			}
			//��3���ж����flag
			if(flag){
				System.out.println("����"+i);
			}
		}
	}
}