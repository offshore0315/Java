package text;
import java.awt.*;
import javax.swing.*;
import javax.swing.border.EmptyBorder;

class Counter{
	Counter(){
	JFrame frame=new JFrame("¼ÆËãÆ÷");
	frame.setLocation(300,400);
	frame.setResizable(false);
	JPanel panel=new JPanel();
	JTextField areaShow=new JTextField(20);
	areaShow.setHorizontalAlignment(JTextField.RIGHT);
	JButton btnclera=new JButton("clear");
	panel.add(areaShow,new BorderLayout().WEST);
	panel.add(btnclera,new BorderLayout().EAST);
	JPanel panelCentor=new JPanel(new GridLayout(4,4,4,4));
	
	JButton btn7 = new JButton("7");
	JButton btn8 = new JButton("8");
	JButton btn9 = new JButton("9");
	JButton btnDiv = new JButton("/");
	JButton btn4 = new JButton("4");
	JButton btn5 = new JButton("5");
	JButton btn6 = new JButton("6");
	JButton btnMul = new JButton("*");
	JButton btn1 = new JButton("1");
	JButton btn2 = new JButton("2");
	JButton btn3 = new JButton("3");
	JButton btnSub = new JButton("+");
	JButton btnPoint = new JButton(".");
	JButton btn0 = new JButton("0");
	JButton btnEquals = new JButton("=");
	JButton btnAdd = new JButton("+");
	panelCentor.setBorder(new EmptyBorder(10,10,10,10));
	panelCentor.add(btn7);
	panelCentor.add(btn8);
	panelCentor.add(btn9);
	panelCentor.add(btnDiv);
	panelCentor.add(btn4);
	panelCentor.add(btn5);
	panelCentor.add(btn6);
	panelCentor.add(btnMul);
	panelCentor.add(btn1);
	panelCentor.add(btn2);
	panelCentor.add(btn3);
	panelCentor.add(btnSub);
	panelCentor.add(btnPoint);
	panelCentor.add(btn0);
	panelCentor.add(btnEquals);
	panelCentor.add(btnAdd);
	
	JPanel panelBelow=new JPanel(new GridLayout(1,2,5,5));
	panelBelow.setBorder(new EmptyBorder(0,10,10,10));
	JButton btnKuohao1=new JButton("(");
	JButton btnKuohao2=new JButton(")");
	panelBelow.add(btnKuohao1);
	panelBelow.add(btnKuohao2);
	frame.add(panel,new BorderLayout().NORTH);
	frame.add(panelCentor,new BorderLayout().CENTER);
	frame.add(panelBelow,new BorderLayout().SOUTH);
	frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	frame.pack();
	frame.setVisible(true);
	}
}

public class No11 {
   public static void main(String []args) {
	   new Counter();
   }
}
