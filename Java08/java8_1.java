import java.util.Scanner;

public class java8_1 {

	public static void main(String[] args) {
		Scanner stdIn = new Scanner(System.in);
		
		System.out.println("あなたのデータを入力してください。");
		System.out.print("名前："); String name = stdIn.next();
		System.out.print("年齢："); int age = stdIn.nextInt();
		System.out.print("身長は(mで記入)："); double height = stdIn.nextDouble();
		System.out.print("体重は（kgで記入）："); double weight = stdIn.nextDouble();
		
		Person person = new Person(name, age, height, weight);
		
		System.out.println("あなたのデータを表示します。");
		person.printData();
		

	}

}
