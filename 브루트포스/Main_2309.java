import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;

public class Main_2309 {

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int arr[] = new int[9];
		int sum = 0;
		int num1 = 0, num2 = 0;

		for (int i = 0; i < arr.length; i++) {
			arr[i] = Integer.parseInt(br.readLine());
			sum += arr[i];
		}
		
		Arrays.sort(arr);
		
		for (int i = 0; i < arr.length; i++) {
			for (int j = 0; j < arr.length; j++) {
				if (sum - arr[i] - arr[j] == 100) {
					num1 = i;
					num2 = j;
				}
			}
		}

		for (int i = 0; i < arr.length; i++) {
			if (i != num1 && i != num2) {
				System.out.println(arr[i]);
			}
		}
	}
}
