import java.io.IOException;
public class Main
{
	public static void main(String[] args)
	{
	      try
		  {
			  CalCreate.Create() ;
			  CalWriteAndRead.WriteRead();
		  }		  
		  catch(IOException e)
		  {
			  System.out.println(e);
		  }
	}
	
}