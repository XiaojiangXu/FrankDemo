import java.util.Scanner;

public class Scaner {
	public static void main(String[] args) {
		int a;
		Scanner in = new Scanner(System.in);
		System.out.println("������Ҫ�ж�����ݣ�");
		a = in.nextInt();
		// �ܱ�400����������
		// �ܱ�4���������ܱ�100����������
		if ((a % 400 == 0) || (a % 4 == 0 && a % 100 != 0))
			System.out.println("Yes");
		else
			System.out.println("No");
		in.close();

	}
}
