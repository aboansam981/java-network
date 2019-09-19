
import java.net.URL;
import java.net.MalformedURLException;
import java.io.IOException;
import java.io.InputStream;
import java.net.URLConnection;
import java.io.FileOutputStream;
import java.net.HttpURLConnection;
import java.net.InetAddress;
import java.net.UnknownHostException;
public class Main
  {


	public static void main(String[] args)
	  {
		Main m = new Main();
		//m.prinUrlInformation();
		//m.readUrl();
		//m.readHttpInformation();
		m.inetAdress();
	  }

	public void prinUrlInformation()
	  {
		try
		  {
			URL url = new URL("https://google.com/");
			System.out.println("Url : " + url);
			System.out.println("Protocol :" + url.getProtocol());
			System.out.println("Host : " + url.getHost());
			System.out.println("Port : " + url.getPort());
			System.out.println("File : " + url.getFile());
			System.out.println("User Info :" + url.getUserInfo());
			System.out.println("Reference : " + url.getRef());
			System.out.println("Query : " + url.getQuery());
			System.out.println("Path : " + url.getPath());
			
		  }catch (MalformedURLException e)
		  {
			System.out.println(e.getMessage());
		  } 
	  }
	  
	  public void readUrl() {
		  try
			{
			  URL url = new URL("https://devfield.com/all-linux-commands/");
			  URLConnection connection = url.openConnection();
			  InputStream in = connection.getInputStream();
			  int i = 0;
			  StringBuilder s = new StringBuilder();
			  
			  FileOutputStream out = new FileOutputStream("/storage/emulated/0/AppProjects/MyJavaConsoleApp/linux.html");
			  while((i = in.read()) > 0) {
				out.write((char) i);
			  }
			  System.out.println(s);
			  
			}catch (MalformedURLException e)
			{
			  System.out.println(e.getMessage());
			} catch (IOException e)
			{
			  System.out.println(e.getMessage());
			}
		}
		
	public void readHttpInformation() {
		try
		  {
			URL url = new URL("https://harmash.com/");
			HttpURLConnection htp = (HttpURLConnection) url.openConnection();
			
			for(int i = 0; i < 20 ; i++) {
			  System.out.println(htp.getHeaderFieldKey(i) +" : " + htp.getHeaderField(i));
			}
			
		  }catch (MalformedURLException e)
		  {
			
		  } catch (IOException e)
		  {
			System.out.println(e.getMessage());
		  }
	  }
	  
	  public void inetAdress() {
		  try
			{
			  InetAddress inet = InetAddress.getByName("www.harmash.com");
			  System.out.println("Host : " +inet.getHostName());
			  System.out.println("IP : " +inet.getHostAddress());
			  System.out.println("Canonical Host Name : " +inet.getCanonicalHostName());
			  System.out.println("Local Host" +inet.getLocalHost());
			  
			}catch (UnknownHostException e)
			{
			  System.out.println(e.getMessage());
			}

	  }
  }
