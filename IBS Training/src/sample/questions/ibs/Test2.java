package sample.questions.ibs;

public class Test2 {
	static int total=10;
	public static void main(String[] args) {
		new Test2();

	}
	public Test2() {
		System.out.println("In test");
		System.out.println(this);
		int temp = this.total;
		if (temp > 5) {
		System.out.println(temp);
		}
		}
}