
public class Car {
	
	protected String name;
	protected int width;
	protected int height;
	protected int length;
	protected double x;
	protected double y;
	protected double fuel;
	
	public Car(String name, int width, int height, int length, double fuel) {
		this.name = name;   this.width = width;   this.height = height;
		this.length = length;	this.fuel = fuel;   x = y = 0.0;
	}
	
	public double getX() { return x; }
	public double getY() { return y; }
	public double getFuel() { return fuel; }
	
	public void putSpec() {
		System.out.println("���O�F"+ name);
		System.out.println("�ԕ��F"+ width);
		System.out.println("�ԍ��F"+ height);
		System.out.println("�Ԓ��F"+ length);
	}

	public boolean move(double dx, double dy) {
		double dist = Math.sqrt(dx * dx + dy * dy);
		
		if (dist > fuel) {
			return false;
		} else {
			fuel -= dist;
			x += dx;
			y += dy;
			return true;
		}
	}
}