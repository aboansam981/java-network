
import java.io.IOException;
import java.net.DatagramSocket;
import java.net.DatagramPacket;

public class MyDataGramPacket
{
	public static void main(String[] args) throws IOException
	  {
		byte[] buffer = new byte[1024];
		DatagramSocket ds = new DatagramSocket(7878);
		DatagramPacket dp = new DatagramPacket(buffer,1024);
		ds.receive(dp);
		String s = new String(dp.getData(), 0, dp.getLength());
		System.out.println(s);
		ds.close();
		
	  }
}
