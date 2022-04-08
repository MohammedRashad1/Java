package sample.questions.ibs;

import java.util.Hashtable;

public class HashTableDemo {

	public static void main(String[] args) {
		Hashtable<Integer, String> ht = new Hashtable<Integer, String>();
		ht.put(10, "Hi");
        ht.put(15, "All");
        ht.put(20, "Welcome");
        ht.put(25, "to");
        ht.put(30, "the");
        ht.put(22, "Party");
        
        System.out.println("Initial Table is: " + ht);
        System.out.println(ht.containsKey(10));
        System.out.println(ht.containsValue("welcomes"));

	}

}
