package sample.questions.ibs;

public class ReverseNumber {

	public static void main(String[] args) {
		
//		int a = 123456789;
//		String s = String.valueOf(a);
//		for(int i=s.length();i>0;i--){
//			System.out.print(i);
			
//		}
		
		int number = 987654, reverse = 0;  
		while(number != 0){  
		int remainder = number % 10;  
		reverse = reverse * 10 + remainder;  
		number = number/10;  
		}  
		System.out.println("The reverse of the given number is: " + reverse);  
	}

}
