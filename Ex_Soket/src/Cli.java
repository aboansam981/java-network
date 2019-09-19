
import java.net.Socket;
import java.io.DataOutputStream;
import java.io.IOException;
import java.io.DataInputStream;
import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Cli
 {
  public static void main(String[] args) {
	  try
		{
		  Socket soket = new Socket("localhost", 5555);
		  DataOutputStream out = new DataOutputStream(soket.getOutputStream());
		  DataInputStream in = new DataInputStream(soket.getInputStream());
		  BufferedReader buffer = new BufferedReader(new InputStreamReader(System.in));
		  
		  String rmsg, smsg;
		  while(true) {
			System.out.println("write to Server :");
			smsg = buffer.readLine();
			out.writeUTF(smsg);
			
			rmsg = in.readUTF();
			if(rmsg.equals("stop")){
			  break;
			}
			System.out.println("Server : " + rmsg);
		  }
		  in.close();
		  buffer.close();
		  soket.close();
		  out.flush();
		  out.close();
		}catch (IOException e)
		{
		  System.out.println(e.getMessage());
		}
  }
}
