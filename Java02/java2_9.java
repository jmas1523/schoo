import java.util.Random;

class java2_9 {
	public static void main(String[] args) {
		Random rand = new Random();
		
		double x = rand.nextDouble();
		
		System.out.println("0.0�ȏ�1.0�����̎����l�F"+x+"");
		
		double y = rand.nextDouble()*10;
		
		System.out.println("0.0�ȏ�10.0�����̎����l�F"+y);
		
		double z = rand.nextDouble()*2;
		
		System.out.println("-1.0�ȏ�1.0�����̎����l�F"+(z-1));
	}
}