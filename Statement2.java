package text;
import java.util.*;
import java.io.*;
import java.sql.*;
public class Statement2 {
   public static void main(String[] args) throws Exception {
	   Scanner sc=new Scanner(System.in);
	   System.out.println("�������û���");
	   String suser=sc.nextLine();
	   System.out.println("����������");
	   String spwd=sc.nextLine();
	   Class.forName("com.mysql.cj.jdbc.Driver");
	   String url="jdbc:mysql://localhost:3306/world?serverTimezone=UTC";
	   String user="root";String pwd="zgl200203156358";
	   Connection conn=DriverManager.getConnection(url, user, pwd);
	   PreparedStatement pstmt=conn.prepareStatement(
			   "select * from users where �û���= ? and ����=?");
	   pstmt.setString(1, suser);
	   pstmt.setString(2, spwd);
	   ResultSet rs=pstmt.executeQuery();
	   if(rs.next()) {
		   System.out.println("��½�ɹ�");
		   String sql="insert into student values('zhao','male','xinan','80.00')";
		   boolean rs1=pstmt.execute(sql);
		   if(!rs1) {
			   System.out.println("����ɹ�");
		   }
		   else {
			   System.out.println("����ʧ��");
		   }
		   
	   }
	   else {
		   System.out.println("��½ʧ��");
	   }
   }
}
