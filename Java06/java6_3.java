class java6_3 {
	
	public static void main(String[] args) {
		double[] a = new double[5];
		
		for (int i = 0; i < a.length; i++) {
			double x = 1.1;
			a[i] =  x * i;
		}
		for (int i = 0; i < a.length; i++) {
			System.out.printf("a["+ i +"] = %3.1f\n",a[i]);
		}
	}
}