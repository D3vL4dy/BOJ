package backJoon;

/*
 * 정수 N개로 이루어진 수열 A와 정수 X가 주어진다. 
 * 이때, A에서 X보다 작은 수를 모두 출력하는 프로그램을 작성하시오.
 * 
 * 첫째 줄에 N과 X가 주어진다. (1 ≤ N, X ≤ 10,000)
 */

import java.util.Scanner;

public class BackJoon_10871 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		int num = sc.nextInt();
		int a = sc.nextInt();
		int x = 0;

		for (int i = 1; i <= num; i++) {
			x = sc.nextInt();

			if (x < a) {
				System.out.print(x + " ");
			}
		}

	}
}
