package backJoon;

import java.util.Scanner;

public class Main_2908_상수 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String[] arr = new String[2];
		for (int i = 0; i < arr.length; i++) {
			arr[i] = sc.next();

			StringBuffer sb = new StringBuffer(arr[i]);
			sb.reverse();

			System.out.println(sb);
		}
	}

}
