public class java10_2 {

	public static void main(String[] args) {

		
		ExId a = new ExId();
		ExId b = new ExId();
		ExId c = new ExId();
		ExId.setN(4);
		ExId d = new ExId();
		
		System.out.println("aの識別番号："+ a.getId());
		System.out.println("bの識別番号："+ b.getId());
		System.out.println("cの識別番号："+ c.getId());
		System.out.println("dの識別番号："+ d.getId());
		
	
		System.out.println("最後に与えた識別番号："+ ExId.counter);

	}

}
