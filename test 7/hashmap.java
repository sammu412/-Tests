import java.util.*;
import java.lang.*;
class hashmap
{
	public static void main(String args[])
		{
			LinkedHashMap<Integer,String> map=new LinkedHashMap<>();
			map.put(1,"apple");
			map.put(2,"grapes");
			map.put(3,"banana");
			System.out.println("hashmap"+map);
		}
}

