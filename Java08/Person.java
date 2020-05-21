
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
		System.out.println("���O�F"+ name);
		System.out.println("�N���"+ age +"��");
		System.out.println("�g����"+ height +"m");
		System.out.println("�̏d��"+ weight +"kg");
		System.out.println("BMI��"+ Math.round(bmi()) +"�ł��B");
	}

}
