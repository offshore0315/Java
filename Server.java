package zhang7;
import java.net.*;
import java.io.*;
public class Server {
  private static final int SERVER_PORT=9008; 
  public Server() {
	  try {
		  ServerSocket ss=new ServerSocket(SERVER_PORT);
		  System.out.println("服务器端已启动，正在等待客户端");
		  Socket s=ss.accept();
		  InputStream in=s.getInputStream();
		  OutputStream out=s.getOutputStream();
		  byte[] buf=new byte[1024];
		  int len=in.read(buf);
		  String strFromClient =new String(buf,0,len);
		  System.out.print("来自客户端的消息>>");
		  System.out.println(strFromClient);
		  String strToClient="你好！";
		  out.write(strToClient.getBytes());
		  in.close();out.close();
		  s.close();ss.close();
		  System.out.println("服务器端已关闭");
		  
	  }catch(IOException e) {
		  System.err.println(e);
	  }
  }
  public static void main(final String args[]) {
	  new Server();
  }
}
