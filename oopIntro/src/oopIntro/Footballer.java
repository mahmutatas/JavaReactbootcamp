package oopIntro;

public class Footballer {
	
	public Footballer(String name, double playerSalary, int uniformNumber) {
		 this();
		 this.name = name;
		 this.playerSalary = playerSalary;
		 this.uniformNumber = uniformNumber;
	}
	public Footballer() {
		System.out.println("Constrctor Çalıştı");
	}
	
	String name;
	double playerSalary;
	int uniformNumber;
}
