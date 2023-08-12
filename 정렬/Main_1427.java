package practice;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.Collections;

public class Main_1427 {

	public static void main(String[] args) throws Exception, IOException {

		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringBuilder sb = new StringBuilder();

		String str = br.readLine();
		Character[] ch = new Character[str.length()];

		for (int i = 0; i < str.length(); i++) {
			ch[i] = str.charAt(i);

		}

		Arrays.sort(ch, Collections.reverseOrder());

		for (int i = 0; i < ch.length; i++) {
			sb.append(ch[i]);
		}
		System.out.println(sb);
	}

}