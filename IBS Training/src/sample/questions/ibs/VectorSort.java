package sample.questions.ibs;

import java.util.Collections;
import java.util.Vector;

public class VectorSort {

	public static void main(String[] args) {
		
		Vector<String> vector = new Vector<String>();
		vector.add("Harry");
		vector.add("Bharath");
		vector.add("Rashad");
		vector.add("Roy");
		
		Collections.sort(vector);
		
		for(String str:vector)
			System.out.println(str);

	}

}
