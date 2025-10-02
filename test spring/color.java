import java.util.*;
import java.util.InputMismatchException.*;
import java.io.*;
public class color{
	public static void main(String args[])
	{
		String c="Red,Green,Blue";
        String[] colors=c.split(",");
		for(int i=0;i<colors.length;i++)
		{
			colors[i]=colors[i].trim();
		}
		char[] firstcolor=colors[0].toCharArray();
		for(char d:firstcolor){
		System.out.println(d);
		}
       	
    }
}

	