package text;
import java.sql.*;
import java.io.*;
import javax.swing.*;
import javax.swing.filechooser.FileNameExtensionFilter;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class UI extends JFrame implements ActionListener{
	   File file=null;
	   JTextArea jta;
	   JMenuItem mi1;
	   JMenuItem mi2;
	   public static void main(String[]args) {
	   UI ui=new UI();
   }
	   UI(){
		   super("���±�");
		   
		   setMenu();
		   jta=new JTextArea();
		   add(jta);
		   this.setBounds(500, 200, 800, 600);
		   this.setDefaultCloseOperation(EXIT_ON_CLOSE);
		   this.setResizable(false);
		   this.setVisible(true);
	   }
	void setMenu() {
		mi1=new JMenuItem("���ļ�");
		mi2=new JMenuItem("�����ļ�");
		JMenuBar mb=new JMenuBar();
		JMenu jMenu=new JMenu("�ļ�");
		this.setJMenuBar(mb);
		mb.add(jMenu);
		jMenu.add(mi1);
		jMenu.add(mi2);
		mi1.addActionListener(this);
		mi2.addActionListener(this);
	}
	void fileChooser() {
		JFileChooser jfc=new JFileChooser();
		jfc.setFileSelectionMode(JFileChooser.FILES_ONLY);
		jfc.addChoosableFileFilter(new FileNameExtensionFilter("�ı��ĵ�",".txt"));
		jfc.showOpenDialog(UI.this);
		file=jfc.getSelectedFile();
	}
	public void actionPerformed(ActionEvent e) {
		JMenuItem x=(JMenuItem) e.getSource();
		if(x==mi1) {
			fileChooser();
			if(file==null)return;
			BufferedReader reader=null;
			try {
				String temp,ans="";
				reader =new BufferedReader(new FileReader(file));
				while((temp=reader.readLine())!=null) {
					ans=ans+temp+"\n";
				}
				jta.setText(ans);
			}catch(FileNotFoundException ex) {
				JOptionPane.showMessageDialog(null, "δ�ҵ����ļ�");
			}catch(IOException ex) {
				JOptionPane.showMessageDialog(null, "��ȡʧ��");
			}finally {
				try {
					reader.close();
				}catch(IOException ex) {
					JOptionPane.showMessageDialog(null, "����֮��Ĵ���");
				}
			}
		}
		else {
			BufferedWriter writer=null;
			if(file==null) 
				fileChooser();
			if(file==null)return;
			try {
				writer=new BufferedWriter(new FileWriter(file));
				writer.write(this.jta.getText());
			}catch(IOException ex) {
				JOptionPane.showMessageDialog(null, "����֮��Ĵ���");
			}
		}
	}
}
