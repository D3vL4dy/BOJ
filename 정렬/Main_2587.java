package practice;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;

public class Main_2587 {

	public static void main(String[] args) throws Exception, IOException {

		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringBuilder sb = new StringBuilder();

		int arr[] = new int[5];
		int sum = 0;

		for (int i = 0; i < 5; i++) {
			arr[i] = Integer.parseInt(br.readLine());
			sum += arr[i];
		}

		sb.append(sum / 5 + "\n");
		Arrays.sort(arr);
		sb.append(arr[2]);

		br.close();

		System.out.println(sb);
	}

}