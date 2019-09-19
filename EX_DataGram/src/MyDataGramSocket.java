
import java.net.DatagramSocket;
import java.io.IOException;
import java.net.InetAddress;
import java.net.DatagramPacket;

public class MyDataGramSocket
{
	public static void main(String[] args) throws IOException
	  {
		String s = "ibrahim khalil alderwish";
		DatagramSocket ds = new DatagramSocket();
		InetAddress ip = InetAddress.getByName("127.0.0.1");
		DatagramPacket dp = new DatagramPacket(s.getBytes(), s.length(), ip, 7878);
		ds.send(dp);
		ds.close();
		
	  }
}
