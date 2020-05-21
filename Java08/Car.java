
public class Car {

	private String name;
	private int number;
	private int width;
	private int height;
	private int length;
	private double x;
	private double y;
	private double fuel;
	private double fuelEco;
	
	Car(String name, int number, int width, int height, int length, double fuel, double fuelEco) {
		this.name = name;	this.number = number;   this.width = width;   this.height = height;
		this.length = length;   this.fuel = fuel;   this.fuelEco = fuelEco;
		x = y = 0.0;
	}
	
	double getX() { return x; }
	double getY() { return y; }
	double getFuel() { return fuel; }

	void putSpec() {
		System.out.println("���O�F"+ name);
		System.out.println("�ԕ��F"+ width +"mm");
		System.out.println("�ԍ��F"+ height +"mm");
		System.out.println("�Ԓ��F"+ length +"mm");
		System.out.println("�R��F"+ fuelEco +"km/L");
	}
	
	boolean move(double dx, double dy) {
		double dist = Math.sqrt(dx * dx + dy * dy);
		
		double rFuel = dist / fuelEco;
		
		if (rFuel > fuel) {
			return false;
		} else {
			fuel -= rFuel;
			x += dx;	
			y += dy;
			return true;
		}
	}
}
