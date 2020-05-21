
public class ExId {
	static int counter = 0;
	private static int n = 1;
 	
	private int id;
	
	public static int setN(int N) {
		n = N;
		return n;
	}
	
	public ExId() {
		if (n == 1) {
			id = ++counter;
		} else {
			counter += n;
			id = counter;
		}
	}
	
	public int getId() {
		return id;
	}
	
	static int getMaxId() {
		return counter;
	}
	
	
}
