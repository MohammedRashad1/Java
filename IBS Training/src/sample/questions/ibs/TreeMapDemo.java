package sample.questions.ibs;

import java.util.Collections;
import java.util.Comparator;
import java.util.Set;
import java.util.TreeMap;

public class TreeMapDemo {

	public static void main(String[] args) {
		
		TreeMap<Integer,String> tm = new TreeMap<Integer,String>();
		
		tm.put(4,"BMW");
		tm.put(1,"Audi");
		tm.put(3,"Benz");
		tm.put(2, "Jaguar");
		
		Set keys = tm.keySet();
		
		
	}

}
