import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main_10430 {

	public static void main(String[] args) throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine(), " ");
		StringBuilder sb = new StringBuilder();

		int a = Integer.parseInt(st.nextToken());
		int b = Integer.parseInt(st.nextToken());
		int c = Integer.parseInt(st.nextToken());

		br.close();

		sb.append((a + b) % c + "\n");
		sb.append(((a % c) + (b % c)) % c + "\n");
		sb.append((a * b) % c + "\n");
		sb.append(((a % c) * (b % c)) % c + "\n");

		System.out.println(sb);

	}

}
