package backJoon;

import java.util.Scanner;

/*
 * N개의 숫자가 공백 없이 쓰여있다. 
 * 이 숫자를 모두 합해서 출력하는 프로그램을 작성하시오.
 */

public class Main_11720_정수의개수 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int n = sc.nextInt();
		String num = sc.next();
		int sum = 0;
		
		for(int i=0; i<n; i++) {
			sum += num.charAt(i)-'0';
		}
		System.out.println(sum);
	}
}
