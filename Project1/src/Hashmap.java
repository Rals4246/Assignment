import java.util.*;
import java.io.*;
public class Hashmap {

	public static void main(String[] args) {
		
HashMap hs=new HashMap();
hs.put(1,"one");
hs.put(2, "two");
hs.put(3,"three");
Set<Map.Entry<Integer, String>> setValue=hs.entrySet();
for(Map.Entry<Integer, String> entryValue: setValue)
{
	System.out.print(entryValue.getKey());
	System.out.println(" ");
	System.out.print(entryValue.getValue());
	System.out.println("\n");
	
}
	}

}
