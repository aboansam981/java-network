
import java.net.ServerSocket;
import java.io.IOException;
import java.net.Socket;
import java.io.DataInputStream;

public class Server
{
  public static void reciveData() {
	  try
		{
		  ServerSocket ss = new ServerSocket(5555);
		  Socket soket = ss.accept();
		  DataInputStream in = new DataInputStream(soket.getInputStream());
		  System.out.println("noreply msg : " + (String)in.readUTF());
		  System.out.println("server");
		  ss.close();
		}catch (IOException e)
		{
		  System.out.println(e.getMessage());
		}
	}
}
