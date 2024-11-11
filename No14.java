package text;

import java.awt.*;

import javax.swing.*;

public class No14{

	 public static void main(String[]args) {
			
	
				JFrame j=new JFrame("多线程实例");
	
				 JTextArea t1=new JTextArea(10,10);
	
				 JTextArea t2=new JTextArea(10,10);
				 JScrollPane s1 = new JScrollPane(t1);
				 JScrollPane s2 = new JScrollPane(t2);
				 j.add(BorderLayout.NORTH,s1);
	
				 j.add(BorderLayout.SOUTH,s2);
	
				 j.setSize(400,400);
	
				 j.setVisible(true);
	
				 j.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);	 	
	
	        Thread a=new ThreadA(t1);
	
	        Thread b=new Thread(new ThreadB(t2));
	
	        String a1=a.getName();
	
	        String b1=b.getName();
	
	        t1.setText(a1);
	
	        t2.setText(b1);
	        
	        a.start();
	        b.start();
	
	 }

}
class ThreadA extends Thread{
	JTextArea t1;
	ThreadA(JTextArea x){
		t1 = x;
	}

	public void run() {

		for(int i=0;i<200;i++) {

			if(i%2!=0) {

				t1.append("\n"+i);

			}

		}

	}

}

class ThreadB implements Runnable{
	
	JTextArea t2;
	ThreadB(JTextArea x){
		t2 = x;
	}

	public void run() {

		for(int i=1;i<200;i++) {

			if(i%2==0) {

				t2.append("\n"+i);

			}

		}

	}

}