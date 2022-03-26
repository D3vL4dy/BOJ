package backJoon;

import java.util.Scanner;

/*
 * 두 정수 A와 B가 주어졌을 때, A와 B를 비교하는 프로그램을 작성하시오.
 * 첫째 줄에 A와 B가 주어진다. A와 B는 공백 한 칸으로 구분되어져 있다.
 */

public class BackJoon_1330 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);

		int a = scan.nextInt();
		int b = scan.nextInt();

		System.out.println(a > b ? ">" : (a < b) ? "<" : "==");
	}

}
