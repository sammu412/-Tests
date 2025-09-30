import java.util.*;
import java.util.InputMismatchException.*;
import java.io.*;
public class charint{
	public static void main(String args[])
	{
		int num=12345;
		String s=Integer.toString(num);
		char first=s.charAt(0);
		char last=s.charAt(s.length()-1);
		System.out.println("first dig "+first);
		System.out.println("last dig "+last);
	}
}