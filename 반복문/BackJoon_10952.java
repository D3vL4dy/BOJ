package backJoon;

/*
 * 두 정수 A와 B를 입력받은 다음, A+B를 출력하는 프로그램을 작성하시오.
 * 입력의 마지막에는 0 두 개가 들어온다.
 */

import java.util.Scanner;

public class BackJoon_10952 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		int a = 0;
		int b = 0;

		while (true) {
			a = sc.nextInt();
			b = sc.nextInt();
			if (!(a == 0 && b == 0)) {
				System.out.println(a + b);
			} else
				break;
		}
	}

}
