import java.util.*;
import java.util.InputMismatchException.*;
import java.io.*;
public class nonrep
{
 public static void main(String args[])
  {
	  String str="swiss";
	  char s=' ';
	  //char[] chars=str.toCharArray();
	  for(int i=0;i<str.length();i++)
	  {
		  char chars=str.charAt(i);
		  if(str.indexOF(chars)==str.lastIndexOf(chars))
		  {
			  s=chars;
			  break;
		  }
	  }
	  System.out.println("first non repeating "+s);
	  
  }
}