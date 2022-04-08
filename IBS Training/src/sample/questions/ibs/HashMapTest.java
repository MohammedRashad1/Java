package sample.questions.ibs;

import java.util.HashMap;
import java.util.Set;

public class HashMapTest {

	public static void main(String[] args) {
		
		HashMap<String,String> hm = new HashMap<String,String>();
		hm.put("A","HP");
		hm.put("B", "Dell");
		hm.put("D", "Lenova");
		hm.put("C", "Asus");
		
		Set key = hm.keySet();
		key.forEach(a->System.out.println(a+":"+hm.get(a)));

	}

}
