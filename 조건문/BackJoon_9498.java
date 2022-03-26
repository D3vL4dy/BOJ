package backJoon;

import java.util.Scanner;

/*
 * 시험 점수를 입력받아 
 * 90 ~ 100점은 A, 80 ~ 89점은 B, 
 * 70 ~ 79점은 C, 60 ~ 69점은 D, 
 * 나머지 점수는 F를 출력하는 프로그램을 작성하시오.
 * 
 * 첫째 줄에 시험 점수가 주어진다. 
 * 시험 점수는 0보다 크거나 같고, 100보다 작거나 같은 정수이다.
 */

public class BackJoon_9498 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int num = scan.nextInt();
		String grade = null;

		if (num >= 90 && num <= 100) {
			grade = "A";
		} else if (num >= 80 && num <= 89) {
			grade = "B";
		} else if (num >= 70 && num <= 79) {
			grade = "C";
		} else if (num >= 60 && num <= 69) {
			grade = "D";
		} else {
			grade = "F";
		}

		System.out.println(grade);
	}

}
