package text;
import java.sql.*;
import java.io.*;
import java.util.*;
public class Statement1{

  public static void main(String[]args) throws Exception {

	  Scanner sc=new Scanner(System.in);

	  System.out.println("�������û���");

	  String suser=sc.nextLine();

	  System.out.println("����������");

	  String spwd=sc.nextLine();

	  Class.forName("com.mysql.cj.jdbc.Driver");

	  String url="jdbc:mysql://localhost:3306/world?serverTimezone=UTC";

	  String user="root"; String pwd="zgl200203156358";

	  Connection conn=DriverManager.getConnection(url, user, pwd);
	  
	  Statement stmt=conn.createStatement();

	  String sql="select * from users where �û���='"+suser+"'and ����='"+spwd+"'";

	  ResultSet rs=stmt.executeQuery(sql);

	  if(rs.next()) {
		  System.out.println(rs.getString(1));
		  
		  System.out.println(rs.getString(2));

		  System.out.println("��¼�ɹ�");

		  String ssql="insert into student values('zhao','male','xinan','80.00')";

		  boolean rs1=stmt.execute(ssql);

		  if(!rs1) {

			  System.out.println("����ɹ�");

		  }

		  else {

			  System.out.println("����ʧ��");

		  }

	  }

	  else {

		  System.out.println("��¼ʧ��");

	  }

  }

}
