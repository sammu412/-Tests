import java.util.*;
import java.util.InputMismatchException.*;
import java.io.*;
public class vowels{
	public static void main(String args[])
	{
	String word="india";
	char[] chars=word.toCharArray();
	int vowel=0;
	for(char c:chars)
	{
		if(c=='a' || c=='e' || c=='i' || c=='o' || c=='u')
		{
			vowel++;
		}
	}
	System.out.println("Number of vowels in the word:"+vowel);
	}
}