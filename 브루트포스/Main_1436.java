import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main_1436 {

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int n = Integer.parseInt(br.readLine());
		int num = 666;
		int cnt = 0;

		while (true) {
			if (Integer.toString(num).contains("666")) {
				cnt++;
			}
			if (cnt == n) {
				System.out.println(num);
				break;
			}
			num++;
		}

	}
}
