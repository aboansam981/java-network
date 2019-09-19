
public class Main
  {
	public static void main(String[] args)
	  {
		System.out.println("ok java");
		//Server.reciveData();
		Server.reciveData();
		try
		  {
			Thread.sleep(1000);
		  }catch (InterruptedException e)
		  {
			System.out.println("Error : " +e.getMessage());
		  }
		Client.sendData();
		
	  }
  }
