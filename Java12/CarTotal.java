
public class CarTotal extends Car{
	
	private double totalDist = 0;
	
	CarTotal(String name, int width, int height, int length, double fuel) {
		super(name, width, height, length, fuel);
	}
	
	/*public double gatTotalDist() {
		return this.totalDist;
	}*/
	
	public double totalDist(double dist) {
		totalDist += dist;
		return totalDist;
	}

}
