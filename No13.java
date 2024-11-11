package text;
import java.awt.*;
import javax.swing.*;
import java.awt.event.*;
class EventDemo{
	JFrame frame;
	JButton button1,button2;
	EventDemo(String title){
		frame=new JFrame("title");
		frame.setSize(300,300);
		frame.setLayout(new FlowLayout());
		button1=new JButton("静音");
		button2=new JButton("关闭");
		frame.add(button1);
		frame.add(button2);
		frame.setVisible(true);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		button1.addActionListener(new ButtonEvent1(this));
		button2.addActionListener(new ButtonEvent2(this));
	}
}
class ButtonEvent1 implements ActionListener {
	EventDemo evd;
	public ButtonEvent1(EventDemo eventDemo) {
		this.evd=eventDemo;
	}
	public void actionPerformed (ActionEvent e) {
		evd.frame.setTitle("你单击了静音按钮");
		JButton clickedButton=(JButton)e.getSource();
		clickedButton.setText("取消静音");
	}
}
class ButtonEvent2 implements ActionListener {
	EventDemo evd;
	public ButtonEvent2(EventDemo eventDemo) {
		this.evd=eventDemo;
	}
	public void actionPerformed (ActionEvent e) {
		evd.frame.setTitle("你单击了关闭按钮");
		JButton clickedButton=(JButton)e.getSource();
		clickedButton.setText("打开");
	}
}

public class No13 {
  public static void main(String[] args ) {
	  EventDemo evd=new EventDemo ("动作事件");
  }
}
