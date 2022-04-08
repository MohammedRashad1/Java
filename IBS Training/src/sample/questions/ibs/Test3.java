package sample.questions.ibs;

public class Test3 {

	public static void main(String[] args) {
		int a=4;
		int b=0;
		Test3.divide(a,b);

	 }

	private static void divide(int i, int j) {
		try {
			
			int c = i / j;
			} catch (Exception e) {
			System.out.print("Exception ");
			} finally {
			System.out.println("Finally");
			}
		
	}
}
