package sample.questions.ibs;

class X{
	void methodA(int a){
		System.out.println("Method A:"+a);
	}
	void methodA(int a,int b){
		System.out.println("Method A:"+a+","+b);
	}
	double methodA(double num){
		System.out.println("Method A:"+num);
		return num;
	}
	
}
public class Y {
	public static void main(String[] args) {
		X Obj = new X();
		double result;
		Obj.methodA(20);
		Obj.methodA(20, 30);
		result=Obj.methodA(5.5);
		System.out.println("Answer is:"+result);
		
	}
}
