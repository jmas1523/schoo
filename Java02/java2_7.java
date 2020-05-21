import java.util.Random;

class java2_7 {
	public static void main(String[] args) {
		Random rand = new Random();
		
		int R = rand.nextInt(9)+1;
		
		System.out.println("整数値："+R+"");
		
		int S = rand.nextInt(9)-9;
		
		System.out.println("整数値："+S+"");
		
		int T = rand.nextInt(90)+10;
		
		System.out.println("整数値："+T+"");
	}
}