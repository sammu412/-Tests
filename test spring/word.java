import java.util.*;
import java.util.InputMismatchException.*;
import java.io.*;
public class word{
	public static void main(String args[])
	{
		String sent="i love java programming";
		String arr[]=sent.split(" ");
		for(String i:arr){
			System.out.println(i);
		}
	}
}