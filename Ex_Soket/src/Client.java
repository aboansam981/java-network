
import java.net.Socket;
import java.io.IOException;
import java.io.DataOutputStream;public class Client
{
  public static void sendData() {
	  try
		{
		  Socket soket = new Socket("localhost", 5555);
		  DataOutputStream out = new DataOutputStream(soket.getOutputStream());
		  out.writeUTF("Message successfully received");
		  soket.close();
		  out.flush();
		  out.close();
		}catch (IOException e)
		{
		  System.out.println(e.getMessage());
		}
	}
}
