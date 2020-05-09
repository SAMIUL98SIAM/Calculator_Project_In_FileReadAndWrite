


import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.*;

public class CalCreate
{
       public static void  Create() throws IOException 
      {
		 // File file = new File("D:/AIUB/JAVA ALL/JAVA/CalculatorProject/src/calculatorproject/Calculator") ;
		  File file1 = new File("D:/AIUB/JAVA ALL/JAVA NODEPAD++/CalCulatorProject/calculator.txt") ;
		 
		  System.out.println(file1.getAbsolutePath());
		  try
		  {
			  if(file1.createNewFile()) 
		         {System.out.println((file1.getName())+" :CALCULATOR FILE EXITS!!") ; }
		      else System.out.println("CALCULATOR FILE DOESNT EXITS") ;
		  }
		  catch(IOException ex)
		  {
			  System.out.println(ex);
		  }
	  
	  }
	  
}