import java.util.Scanner;

public class java7_14 {

	static int a = 0;
	public static int setN(int x, int pos, int n) {
		for (int i = 0; i < n; i++) {
			a = a | 1 << pos + i;
		}
		a = a | x;
		return a;
	}	
	static int b = 0;
	public static int resetN(int x, int pos, int n) {
		for (int i = 0; i < n; i++) {
			b = b | 1 << pos + i;
		}
		b = b ^ setN(x, pos, n);
		return b;
	}
	static int c = 0;
	public static int inverseN(int x, int pos, int n) {
		for (int i = 0; i < n; i++) {
			c = c | 1 << pos + i;
		}
		c = c ^ x;
		return c;
	}
	
	public static void main(String[] args) {
		Scanner stdIn = new Scanner(System.in);
		
		System.out.print("�����F"); int x = stdIn.nextInt();
		System.out.print("pos���Ԗځi0�`31�j�G"); int pos = stdIn.nextInt();
		System.out.print("���̃r�b�g�F"); int n = stdIn.nextInt();
		
		System.out.println("pos"+ pos +"�Ԗڂ��獶�ɘA������"+ n +"���P�ɂ����l�@:"+ setN(x,pos,n));
		System.out.println("pos"+ pos +"�Ԗڂ��獶�ɘA������"+ n +"��0�ɂ����l�@:"+ resetN(x,pos,n));
		System.out.println("pos"+ pos +"�Ԗڂ��獶�ɘA������"+ n +"�𔽓]�����l:"+ inverseN(x,pos,n));
	}

}