package sample.questions.ibs;

public class DuplicateElement {

	public static void main(String[] args) {
		
		String s ="India is my Country";
		char[] arr=s.toCharArray();
		System.out.println("The string is:" + s);
	    System.out.print("Duplicate Characters in above string are: ");
	    for(int i=0;i<arr.length;i++){
	    	for(int j=i+1;j<arr.length;j++){
	    		if (arr[i] == arr[j]) {
	                System.out.print(arr[j]);
	                break;
	    	}
	     }
	   }

	}

}
