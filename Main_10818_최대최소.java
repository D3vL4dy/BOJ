package prac;

import java.util.Scanner;

/*
 * N���� ������ �־�����. 
 * �̶�, �ּڰ��� �ִ��� ���ϴ� ���α׷��� �ۼ��Ͻÿ�.
 * 
 * ù° �ٿ� ������ ���� N (1 �� N �� 1,000,000)�� �־�����. 
 * ��° �ٿ��� N���� ������ �������� �����ؼ� �־�����. 
 * ��� ������ -1,000,000���� ũ�ų� ����, 1,000,000���� �۰ų� ���� �����̴�.
 */

public class Main_10818_�ִ��ּ� {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		int num = sc.nextInt();

		for (int i = 1; i <= num; i++) {
			int a = sc.nextInt();
			int b = sc.nextInt();
			System.out.println(a + b);
		}

	}
}
