package practice;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/*
 * 문자열을 입력으로 주면 문자열의 첫 글자와 마지막 글자를 출력하는 프로그램을 작성하시오.
 */

public class Main_9086_문자열 {

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int n = Integer.parseInt(br.readLine());
		String str[] = new String[n];
		for (int i = 0; i < n; i++) {
			str[i] = br.readLine();
		}
		for (int i = 0; i < str.length; i++) {
			System.out.print(str[i].charAt(0));
			System.out.println(str[i].charAt(str[i].length() - 1));
		}
	}

}
