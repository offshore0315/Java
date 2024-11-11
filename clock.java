package text;
import javax.swing.*;
import java.util.Calendar;
public class clock {
  public static void main(String[] args) {
	  JFrame f=new JFrame("Watch");
	  JLabel j=new JLabel("",JLabel.CENTER);
	  f.add(j);
	  f.setVisible(true);
	  f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	  f.setSize(200,100);
	  while(true) {
		  Calendar c=Calendar.getInstance();
		  j.setText(c.get(Calendar.HOUR_OF_DAY)+":"+c.get(Calendar.MINUTE)+":"+c.get(Calendar.SECOND));
		  try {
			Thread.sleep(1000);
		} catch (InterruptedException e) {
			e.printStackTrace();
		} 
	  }
  }
}
