package sample.questions.ibs;

import java.util.Scanner;

public class PrimeOrNot {

	public static void main(String[] args) {
		
		System.out.print("Enter a Number:");
		Scanner sc = new Scanner(System.in);
		int num = sc.nextInt();
		int flag=0;
		for(int i=2;i<num;i++){
			
			if(num%i==0){
				flag=1;
			}
		}
			if(flag==1){
				System.out.println("Not Prime");
				}
			else{
				System.out.println("Prime");
			}
		
		sc.close();
	}

}
