package text;
import java.util.*;
import java.io.*;
import java.sql.*;
public class Statement2 {
   public static void main(String[] args) throws Exception {
	   Scanner sc=new Scanner(System.in);
	   System.out.println("请输入用户名");
	   String suser=sc.nextLine();
	   System.out.println("请输入密码");
	   String spwd=sc.nextLine();
	   Class.forName("com.mysql.cj.jdbc.Driver");
	   String url="jdbc:mysql://localhost:3306/world?serverTimezone=UTC";
	   String user="root";String pwd="zgl200203156358";
	   Connection conn=DriverManager.getConnection(url, user, pwd);
	   PreparedStatement pstmt=conn.prepareStatement(
			   "select * from users where 用户名= ? and 密码=?");
	   pstmt.setString(1, suser);
	   pstmt.setString(2, spwd);
	   ResultSet rs=pstmt.executeQuery();
	   if(rs.next()) {
		   System.out.println("登陆成功");
		   String sql="insert into student values('zhao','male','xinan','80.00')";
		   boolean rs1=pstmt.execute(sql);
		   if(!rs1) {
			   System.out.println("插入成功");
		   }
		   else {
			   System.out.println("插入失败");
		   }
		   
	   }
	   else {
		   System.out.println("登陆失败");
	   }
   }
}
