package zhang7;
import java.net.*;
import java.io.*;
public class Client {
   public static final int SERVER_PORT=9008;
   public Client(){
	   try {
		   InetAddress address=InetAddress.getByName("localhost");
		   Socket s=new Socket(address,SERVER_PORT);
		   System.out.println("�ͻ���������");
		   InputStream in=s.getInputStream();
		   OutputStream out=s.getOutputStream();
		   String strToServer="Hello!";
		   out.write(strToServer.getBytes());
		   byte[] buf=new byte[1024];
		   int len=in.read(buf);
		   String strFromSrever=new String(buf,0,len);
		   System.out.print("���Է������Ļش�>>");
		   System.out.println(strFromSrever);
		   in.close();out.close();
		   s.close();
	   }catch(IOException e) {
		   System.err.println(e);
	   }
   }
   public static void main(String[]args) {
	   new Client();
   }
}
