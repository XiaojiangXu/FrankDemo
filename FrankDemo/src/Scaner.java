import java.util.Scanner;

public class Scaner {
	public static void main(String[] args) {
		int a;
		Scanner in = new Scanner(System.in);
		System.out.println("请输入要判定的年份：");
		a = in.nextInt();
		// 能被400整除是闰年
		// 能被4整除，不能被100整除是闰年
		if ((a % 400 == 0) || (a % 4 == 0 && a % 100 != 0))
			System.out.println("Yes");
		else
			System.out.println("No");
		in.close();

	}
}
