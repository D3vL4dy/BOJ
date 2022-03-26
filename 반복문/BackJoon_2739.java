package backJoon;

/*
 * N을 입력받은 뒤, 구구단 N단을 출력하는 프로그램을 작성하시오. 
 */

import java.util.Scanner;

public class BackJoon_2739 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		int num = sc.nextInt();
		for (int i = 1; i <= 9; i++) {
			System.out.println(num + " * " + i + " = " + num * i);
		}

	}

}
