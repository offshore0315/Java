package zhang7;
import java.net.*;
import java.io.*;
public class Server {
  private static final int SERVER_PORT=9008; 
  public Server() {
	  try {
		  ServerSocket ss=new ServerSocket(SERVER_PORT);
		  System.out.println("�������������������ڵȴ��ͻ���");
		  Socket s=ss.accept();
		  InputStream in=s.getInputStream();
		  OutputStream out=s.getOutputStream();
		  byte[] buf=new byte[1024];
		  int len=in.read(buf);
		  String strFromClient =new String(buf,0,len);
		  System.out.print("���Կͻ��˵���Ϣ>>");
		  System.out.println(strFromClient);
		  String strToClient="��ã�";
		  out.write(strToClient.getBytes());
		  in.close();out.close();
		  s.close();ss.close();
		  System.out.println("���������ѹر�");
		  
	  }catch(IOException e) {
		  System.err.println(e);
	  }
  }
  public static void main(final String args[]) {
	  new Server();
  }
}
