package prac;

import java.util.Scanner;

/*
 * 세 개의 자연수 A, B, C가 주어질 때 A × B × C를 계산한 결과에 
 * 0부터 9까지 각각의 숫자가 몇 번씩 쓰였는지를 구하는 프로그램을 작성하시오.
 * 
 * 예를 들어 A = 150, B = 266, C = 427 이라면 
 * A × B × C = 150 × 266 × 427 = 17037300 이 되고, 
 * 계산한 결과 17037300 에는 0이 3번, 1이 1번, 3이 2번, 7이 2번 쓰였다.
 * 
 * 첫째 줄에 A, 둘째 줄에 B, 셋째 줄에 C가 주어진다. 
 * A, B, C는 모두 100보다 크거나 같고, 1,000보다 작은 자연수이다.
 * 
 * 첫째 줄에는 A × B × C의 결과에 0 이 몇 번 쓰였는지 출력한다. 
 * 마찬가지로 둘째 줄부터 열 번째 줄까지 A × B × C의 결과에 1부터 9까지의 숫자가 각각 몇 번 쓰였는지 차례로 한 줄에 하나씩 출력한다.
 */

public class Main_2577_숫자의개수 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);

		int a = sc.nextInt();
		int b = sc.nextInt();
		int c = sc.nextInt();
		sc.close();

		// 배열 counts를 선언 범위는 count[0]~count[9]이다.
		int[] counts = new int[10];

		// a * b * c를 연산하고 그 값을 int형 변수 t에 저장
		int t = a * b * c;

		// while문 선언 t>0 일때 내부의 코드를 반복
		while (t > 0) {
			// count[t%10]에 1를 더한다
			counts[t % 10]++;
			
			// t나누기 10 값을 변수 t에 저장
			t /= 10;
		}
		
		for (int i = 0; i < counts.length; ++i) {
			System.out.println(counts[i]);
		}

	}

}
