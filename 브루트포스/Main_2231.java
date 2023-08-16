import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main_2231 {

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String num = br.readLine();
		
		int len = num.length();
		int n = Integer.parseInt(num);
		int start = n - (len * 9);
		int res = 0;

		for (int i = start; i < n; i++) {
			int sum = i;
			int k = i;
			while (k > 0) {
				sum += k % 10;
				k /= 10;
			}
			if (sum == n) {
				res = i;
				break;
			}
		}

		System.out.println(res);
	}
}
