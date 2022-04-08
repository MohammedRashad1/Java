package com.ibs.training.SpringDependencyInjectionObject;

public class Student2 {
	
	private int id;
	private MathCheat cheat;
	public void setId(int id) {
		this.id = id;
	}
	public void setCheat(MathCheat cheat) {
		this.cheat = cheat;
	}
	
	public void startCheating(){
		cheat.mathCheat();
		System.out.println("Student 2 id " + id);
	}

}
