import java.util.Random;

class java3_17 {
	
	public static void main(String[] args) {
		Random rand = new Random();
		
		int J = rand.nextInt(3);
		
		if (J == 0) {
			System.out.println("�O�[");
		} else if (J == 1) {
			System.out.println("�`���L");
		} else {
			System.out.println("�p�[");
		}
	}
}