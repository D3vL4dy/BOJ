import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main_2588_1 {

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int A = Integer.parseInt(br.readLine());
		String B = br.readLine();

		StringBuilder sb = new StringBuilder();

		sb.append(A * (B.charAt(2) - '0'));
		sb.append("\n");

		sb.append(A * (B.charAt(1) - '0'));
		sb.append("\n");

		sb.append(A * (B.charAt(0) - '0'));
		sb.append("\n");

		sb.append(A * Integer.parseInt(B));

		System.out.println(sb);

	}
}
