
public class java10_1 {

	public static void main(String[] args) {
		Id a = new Id();
		Id b = new Id();
		
		System.out.println("a�̎��ʔԍ��F"+ a.getId());
		System.out.println("b�̎��ʔԍ��F"+ b.getId());
		
		System.out.println("Id.counter = "+ Id.counter);
		System.out.println("a.counter = "+ a.counter);
		System.out.println("b.counter = "+ b.counter);
		System.out.println("�Ō�ɗ^�������ʔԍ��F"+ Id.getMaxId());
	}

}