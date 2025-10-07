import java.util.*;
import java.util.InputMismatchException.*;
import java.io.*;
public class check
{
 public static void main(String args[])
  {
	  String str="12345";
	  boolean digit=true;
	  for(int i=0;i<str.length();i++)
	  {
		  if(digit(str.charAt(i)))
		  {
			  digit=false;
			  break;
		  }
	  }
	  
	  System.out.println(digit);
  }
}