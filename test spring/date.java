import java.util.*;
import java.lang.*;
import java.util.InputMismatchException.*;
import java.io.*;
public class date{
	public static void main(String args[])
	{
		String date="27-09-2025";
		String[] d=date.split("-");
		String day=d[0];
		String month=d[1];
		String year=d[2];
		System.out.println("day "+day);
		System.out.println("month "+month);
		System.out.println("year "+year);
	}
}