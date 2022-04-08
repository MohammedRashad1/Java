package sample.questions.ibs;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class CovertLinkedToArrayList {

	public static void main(String[] args) {
		
		LinkedList<String> li = new LinkedList<String>();
		li.add("Harry");
		li.add("Bharath");
		li.add("Rashad");
		li.add("Roy");
		
		List<String> al=new ArrayList<String>(li);
		for(String str:al){
			System.out.println(str);
		}
		

	}

}
