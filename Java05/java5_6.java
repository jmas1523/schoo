class java5_6 {
	
	public static void main(String[] args) {
		
		System.out.println("  float        int   \n---------------------");
		
		int i = 0;
		for (float x = 0.0F; x <= 1.0F; x += 0.001F) {
			float y = (float)i / 1000;
			System.out.printf("%9.7f   %9.7f\n", x, y);
			i++;
		}
	}
}
		