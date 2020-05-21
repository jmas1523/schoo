import java.util.Scanner;

public class java12_1 {

	public static void main(String[] args) {
		Scanner stdIn = new Scanner(System.in);

		System.out.println("車のデータを入力せよ。");
		System.out.print("名前は："); String name = stdIn.next();
		System.out.print("車幅は："); int width = stdIn.nextInt();
		System.out.print("高さは："); int height = stdIn.nextInt();
		System.out.print("長さは："); int length = stdIn.nextInt();
		System.out.print("ガソリンの量は："); double fuel = stdIn.nextDouble();
		
		CarTotal myCar = new CarTotal(name, width, height, length, fuel);
		
		myCar.putSpec();
		
		while (true) {
			System.out.println("現在地（"+ myCar.getX() +", "+ myCar.getY() +
								")・残り燃料　"+ myCar.getFuel());
			System.out.print("移動しますか[0･･･No／1･･･Yes]:");
			if (stdIn.nextInt() == 0) { break; }
			
			System.out.print("X方向の移動距離：");
			double dx = stdIn.nextDouble();
			System.out.print("Y方向の移動距離：");
			double dy = stdIn.nextDouble();
			
			double dist = Math.sqrt(dx * dx + dy * dy);
			
			if (!myCar.move(dx, dy)) {
				System.out.println("燃料が足りません！");
			} else {
				System.out.println("総走行距離は"+ myCar.totalDist(dist) +"です");
			}
		}
	}
}
