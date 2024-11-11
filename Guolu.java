package zhang7;

//���糧��¯�����ݰ����¶Ⱥ�ѹ�������������ݿ��У�һ��5����¯����д�����̡߳�
//1��д�����̣߳�ÿ��20���Ӳ���10�����������ʾ5����¯��ѹ�����¶����ݣ��������ݿ⡣
//2���������̣߳�ÿ��30���Ӵ����ݿ��ж�ȡÿ����¯���¶Ⱥ�ѹ������ʾ�ڱ���С�
//���ݿ�����Ϊboiler������boilerinfo, �ֶ����ֱ�ΪID, pressure, temperature��������Ϊʵ��
import java.util.*;
import java.sql.*;
import java.awt.*;
import javax.swing.*;
import javax.swing.table.*;

public class Guolu {
	JFrame frame;
	JTable table;
	DefaultTableModel tableModel;
	Vector data = new Vector();
	Vector column = new Vector();

	Guolu() throws Exception {

		column.add("id");
		column.add("pressure");
		column.add("temperature");
		tableModel = new DefaultTableModel(data, column);
		table = new JTable(tableModel);
		table.setSelectionMode(ListSelectionModel.MULTIPLE_INTERVAL_SELECTION);
		JScrollPane scrollpane = new JScrollPane(table);
		frame = new JFrame("��¯����");
		frame.add(scrollpane);
		frame.setSize(700, 350);
		frame.setLocationRelativeTo(null);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.setVisible(true);
	}

	class MyThread1 extends Thread {
		public void run() {
			try {
				// ����Mysql
				Class.forName("com.mysql.cj.jdbc.Driver");
				String url = "jdbc:mysql://localhost:3306/boiler";
				String username = "root";
				String password = "123456";
				Connection conn = DriverManager.getConnection(url, username, password);
				PreparedStatement pstmt = conn.prepareStatement("insert into boilerinfo values(?,?,?)");
				double[] num = new double[10];
				for (int i = 0; i < num.length; i++)
					num[i] = Math.random();
				for (int i = 0; i < 5; i++) {
					int j = 2 * i;
					pstmt.setString(1, i + 1 + "");
					pstmt.setString(2, num[j] + "");
					pstmt.setString(3, num[j + 1] + "");
					pstmt.execute();
				}
				PreparedStatement pstmt1 = conn.prepareStatement("update boilerinfo set pressure=?,temperature=? where id=?");
				while (true) {
					try {
						Thread.sleep(20000);
					} catch (InterruptedException e) {
						e.printStackTrace();
					}
					for (int i = 0; i < num.length; i++) {
						num[i] = Math.random();//���������
					}
					for (int i = 0; i < 5; i++) {
						int j = 2 * i;
						pstmt1.setDouble(1, num[j]);
						pstmt1.setDouble(2, num[j + 1]);
						pstmt1.setString(3, i + 1 + "");
						pstmt1.execute();
					}
				}
			} catch (ClassNotFoundException exp) {
				exp.printStackTrace();
			} catch (SQLException exp) {
				exp.printStackTrace();
			}
		}
	}

	class MyThread2 extends Thread {
		public void run() {
			try {
				// ����Mysql
				Class.forName("com.mysql.cj.jdbc.Driver");
				String url = "jdbc:mysql://localhost:3306/boiler";
				String username = "root";
				String password = "123456";
				Connection conn = DriverManager.getConnection(url, username, password);
				Statement stmt = conn.createStatement();
				while (true) {
					ResultSet resultset = stmt.executeQuery("select * from boilerinfo");
					while (resultset.next()) {
						String[] s = { resultset.getString(1),resultset.getString(2), resultset.getString(3) };
						tableModel.addRow(s);
					}
					try {
						Thread.sleep(30000);
					} catch (InterruptedException e) {
						e.printStackTrace();
					}
				}
			} catch (ClassNotFoundException exp) {
				exp.printStackTrace();
			} catch (SQLException exp) {
				exp.printStackTrace();
			}
		}
	}

	void show() {
		MyThread1 t1 = new MyThread1();
		MyThread2 t2 = new MyThread2();
		t1.start();
		t2.start();
	}

	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub
		Guolu test = new Guolu();
		test.show();
	}

}