import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main_3009 {

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st;

		int x[] = new int[3];
		int y[] = new int[3];
		int ax = 0;
		int by = 0;

		for (int i = 0; i < 3; i++) {
			st = new StringTokenizer(br.readLine(), " ");
			x[i] = Integer.parseInt(st.nextToken());
			y[i] = Integer.parseInt(st.nextToken());
		}

		if (x[0] == x[1]) {
			ax = x[2];
		} else {
			ax = (x[0] == x[2] ? x[1] : x[0]);
		}

		if (y[0] == y[1]) {
			by = y[2];
		} else {
			by = (y[0] == y[2] ? y[1] : y[0]);
		}

		System.out.println(ax + " " + by);

	}
	
}
