package text;
import java.awt.*;
import javax.swing.*;
import java.awt.event.*;
class EventDemo {
	JFrame frame;
	JButton button1,button2;
	EventDemo(String title){
		frame=new JFrame(title);
		frame.setSize(300,300);
		frame.setLayout(new FlowLayout());
		button1=new JButton("����");
		button2=new JButton("�ر�");
		frame.add(button1);
		frame.add(button2);
		frame.setVisible(true);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        button1.addActionListener(new ActionListener(){
        	public void actionPerformed(ActionEvent e) {
        		frame.setTitle("�㵥���˾�����ť");
        		JButton clickedButton=(JButton)e.getSource();
        		clickedButton.setText("ȡ������");
        	}
        });
        button2.addActionListener(new ActionListener(){
        	public void actionPerformed(ActionEvent e) {
        		frame.setTitle("�㵥���˹رհ�ť");
        		JButton clickedButton=(JButton)e.getSource();
        		clickedButton.setText("��");
        	}
        });
	}
}     		
public class No12 {
  public static void main(String[] args) {
	  EventDemo evd=new EventDemo("�����¼�");
  }
}