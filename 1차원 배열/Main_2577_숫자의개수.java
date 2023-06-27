package prac;

import java.util.Scanner;

/*
 * �� ���� �ڿ��� A, B, C�� �־��� �� A �� B �� C�� ����� ����� 
 * 0���� 9���� ������ ���ڰ� �� ���� ���������� ���ϴ� ���α׷��� �ۼ��Ͻÿ�.
 * 
 * ���� ��� A = 150, B = 266, C = 427 �̶�� 
 * A �� B �� C = 150 �� 266 �� 427 = 17037300 �� �ǰ�, 
 * ����� ��� 17037300 ���� 0�� 3��, 1�� 1��, 3�� 2��, 7�� 2�� ������.
 * 
 * ù° �ٿ� A, ��° �ٿ� B, ��° �ٿ� C�� �־�����. 
 * A, B, C�� ��� 100���� ũ�ų� ����, 1,000���� ���� �ڿ����̴�.
 * 
 * ù° �ٿ��� A �� B �� C�� ����� 0 �� �� �� �������� ����Ѵ�. 
 * ���������� ��° �ٺ��� �� ��° �ٱ��� A �� B �� C�� ����� 1���� 9������ ���ڰ� ���� �� �� �������� ���ʷ� �� �ٿ� �ϳ��� ����Ѵ�.
 */

public class Main_2577_�����ǰ��� {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);

		int a = sc.nextInt();
		int b = sc.nextInt();
		int c = sc.nextInt();
		sc.close();

		// �迭 counts�� ���� ������ count[0]~count[9]�̴�.
		int[] counts = new int[10];

		// a * b * c�� �����ϰ� �� ���� int�� ���� t�� ����
		int t = a * b * c;

		// while�� ���� t>0 �϶� ������ �ڵ带 �ݺ�
		while (t > 0) {
			// count[t%10]�� 1�� ���Ѵ�
			counts[t % 10]++;
			
			// t������ 10 ���� ���� t�� ����
			t /= 10;
		}
		
		for (int i = 0; i < counts.length; ++i) {
			System.out.println(counts[i]);
		}

	}

}
