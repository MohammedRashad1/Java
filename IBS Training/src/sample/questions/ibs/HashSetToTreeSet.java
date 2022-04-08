package sample.questions.ibs;

import java.util.HashSet;
import java.util.TreeSet;

public class HashSetToTreeSet {

	public static void main(String[] args) {
		
		HashSet<String> hs = new HashSet<String>();
		hs.add("Harry");
		hs.add("Bharath");
		hs.add("Rashad");
		hs.add("Roy");
		
		TreeSet<String> ts = new TreeSet<String>(hs);
		for(String str:ts){
			System.out.println(str);
		}
		//ts.forEach(a->System.out.println(a));

	}

}
