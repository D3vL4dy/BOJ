import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Main_25304 {

	public static void main(String[] args) throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		int total = Integer.parseInt(br.readLine());
		int count = Integer.parseInt(br.readLine());

		for (int i = 0; i < count; i++) {
			int price = Integer.parseInt(br.readLine());
			int num = Integer.parseInt(br.readLine());

			total = total - (price * num);
		}

		if (total == 0)
			System.out.println("Yes");
		else
			System.out.println("No");
	}

}