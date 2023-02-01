package backJoon;

import java.util.Scanner;

/*
 * 영어 대소문자와 공백으로 이루어진 문자열이 주어진다. 
 * 이 문자열에는 몇 개의 단어가 있을까? 이를 구하는 프로그램을 작성하시오. 
 * 단, 한 단어가 여러 번 등장하면 등장한 횟수만큼 모두 세어야 한다.
 */

public class Main_1152_단어의개수 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		String str = scan.nextLine();
		String[] word;

		str = str.trim();

		if (str.equals("")) {
			System.out.println(0);
		} else {
			word = str.split(" ");
			System.out.println(word.length);
		}
	}

}
