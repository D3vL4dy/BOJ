package practice;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main_4344 {

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st;

		int arr[];
		int sum, cnt;
		int tcase = Integer.parseInt(br.readLine());

		for (int i = 0; i < tcase; i++) {
			sum = 0;
			cnt = 0;
			st = new StringTokenizer(br.readLine());
			int n = Integer.parseInt(st.nextToken());
			arr = new int[n];

			for (int j = 0; j < n; j++) {
				arr[j] = Integer.parseInt(st.nextToken());
				sum += arr[j];
			}

			for (int j = 0; j < n; j++) {
				if (arr[j] > (float) sum / n)
					cnt++;
			}
			System.out.printf("%.3f%%\n", ((float) cnt / n) * 100);
		}
	}
}
