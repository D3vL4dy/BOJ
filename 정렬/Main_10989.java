package practice;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;

public class Main_10989 { // 카운팅정렬

	public static void main(String[] args) throws Exception {

		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringBuilder sb = new StringBuilder();

		int n = Integer.parseInt(br.readLine());

		int count[] = new int[10001];

		for (int i = 0; i < n; i++) {
			count[Integer.parseInt(br.readLine())]++;
		}

		for (int i = 1; i < 10001; i++) {
			while (count[i] > 0) {
				sb.append(i).append('\n');
				count[i]--;
			}
		}
		System.out.println(sb);
	}

}