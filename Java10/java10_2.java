public class java10_2 {

	public static void main(String[] args) {

		
		ExId a = new ExId();
		ExId b = new ExId();
		ExId c = new ExId();
		ExId.setN(4);
		ExId d = new ExId();
		
		System.out.println("a�̎��ʔԍ��F"+ a.getId());
		System.out.println("b�̎��ʔԍ��F"+ b.getId());
		System.out.println("c�̎��ʔԍ��F"+ c.getId());
		System.out.println("d�̎��ʔԍ��F"+ d.getId());
		
	
		System.out.println("�Ō�ɗ^�������ʔԍ��F"+ ExId.counter);

	}

}
