package sample.questions.ibs;

public class ThreadTest extends Thread {
	public void run() {
		System.out.println("In run");
		suspend();
		resume();
		System.out.println("Leaving run");
		}

	public static void main(String[] args) {
		
		(new ThreadTest()).start();

	}

}
