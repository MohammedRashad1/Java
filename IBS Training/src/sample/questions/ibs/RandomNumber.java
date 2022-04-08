package sample.questions.ibs;

import java.util.Random;

public class RandomNumber {

	public static void main(String[] args) {
		int min=1;
		int max=100;
		Random randomNum = new Random();
		int num = min+randomNum.nextInt(max);
		System.out.println(num);

	}

}
