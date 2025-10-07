import java.util.*;
import java.util.InputMismatchException.*;
import java.io.*;
public class reverse
{
 public static void main(String args[])
  {
	 String str="Hello world";
	 String[] words=str.split(" ");
	 StringBuilder result=new StringBuilder();
	 for(String c:words)
	 {
		 StringBuilder rev=new StringBuilder(c);
		 result.append(rev.reverse()).append(" ");
	 }
	 System.out.println(result.toString().trim());
  }
}