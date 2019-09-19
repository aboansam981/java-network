
import java.net.ServerSocket;
import java.net.Socket;
import java.io.DataInputStream;
import java.io.IOException;
import java.io.DataOutputStream;
import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Ser
 {
  public static void main(String[] args) {
      try
		{
		  ServerSocket ss = new ServerSocket(5555);
		  Socket soket = ss.accept();
		  DataInputStream in = new DataInputStream(soket.getInputStream());
		  DataOutputStream out = new DataOutputStream(soket.getOutputStream());
		  BufferedReader buffer = new BufferedReader(new InputStreamReader(System.in));
		  String rmsg, smsg;
		  while(true){
			System.out.println("write to Client :");
			smsg = buffer.readLine();
			out.writeUTF(smsg);
			System.out.println("waiting Client...");
			rmsg = in.readUTF();
			if(rmsg.equals("stop")){
			  break;
			}
			System.out.println("Client : " + rmsg);
			//out.flush();
		  }
		  out.close();
		  ss.close();
		  in.close();
		  soket.close();
		  buffer.close();
		}catch (IOException e)
		{
		  System.out.println(e.getMessage());
		}
  }
}
