
public class Person {
	private String name;
	private int age;
	private double height;
	private double weight;
	
	Person(String name, int age, double height, double weight) {
		this.name = name;	this.age = age;   this.height = height;   this.weight = weight;
	}
	
	double bmi() {
		double bmi = weight / height / height;
		return bmi;
	}
	
	void printData() {
		System.out.println("名前："+ name);
		System.out.println("年齢は"+ age +"歳");
		System.out.println("身長は"+ height +"m");
		System.out.println("体重は"+ weight +"kg");
		System.out.println("BMIは"+ Math.round(bmi()) +"です。");
	}

}
