package prac;

import java.util.Arrays;
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
		
		int mul = a * b * c;
//		String to = Integer.toString(mul);
		String to = String.valueOf(mul); // 17037300

		int[] num = new int [10]; // 0,1,2,3,4,5,6,7,8,9
		
		for(int i=0; i<to.length(); i++) {
			for(int j=0; j<num.length; j++) {
				if(to.(j)) {
					num[j]++;
				}
			}
		}
		System.out.println(Arrays.toString(num));
		
		
		
	}

}
