package prac;

import java.util.Scanner;

/*
 * N개의 정수가 주어진다. 
 * 이때, 최솟값과 최댓값을 구하는 프로그램을 작성하시오.
 * 
 * 첫째 줄에 정수의 개수 N (1 ≤ N ≤ 1,000,000)이 주어진다. 
 * 둘째 줄에는 N개의 정수를 공백으로 구분해서 주어진다. 
 * 모든 정수는 -1,000,000보다 크거나 같고, 1,000,000보다 작거나 같은 정수이다.
 */

public class Main_10818_최대최소 {

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
