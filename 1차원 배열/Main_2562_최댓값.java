package prac;

import java.util.Scanner;

/*
 * 9���� ���� �ٸ� �ڿ����� �־��� ��, �̵� �� �ִ��� ã�� �� �ִ��� �� ��° �������� ���ϴ� ���α׷��� �ۼ��Ͻÿ�.
 * ���� ���, ���� �ٸ� 9���� �ڿ��� 
 * 3, 29, 38, 12, 57, 74, 40, 85, 61�� �־�����, 
 * �̵� �� �ִ��� 85�̰�, �� ���� 8��° ���̴�.
 * 
 * ù° �ٺ��� ��ȩ ��° �ٱ��� �� �ٿ� �ϳ��� �ڿ����� �־�����. 
 * �־����� �ڿ����� 100 ���� �۴�.
 * 
 * ù° �ٿ� �ִ��� ����ϰ�, ��° �ٿ� �ִ��� �� ��° �������� ����Ѵ�.
 */

public class Main_2562_�ִ� {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		
		int[] num = new int [9];
		int max = num[0];
		int a = 0;
		
		for(int i=0; i<num.length; i++) {
			num[i] = sc.nextInt();
		}
		
		for(int i=0; i<num.length; i++) {
			if(max < num[i]) {
				max = num[i];
				a = i+1;
			}
		}
		System.out.println(max);
		System.out.println(a);
		
	}
	
//	BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
//	BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
//	StringTokenizer st;
//	
//	int cnt = Integer.parseInt(br.readLine());
//	
//	int[] num = new int [cnt];
//	int max = num[0];
//	
//	for(int i=0; i<cnt; i++) {
//		st = new StringTokenizer(br.readLine(), " ");
//		num[i] = Integer.parseInt(st.nextToken());
//	}
//
//	for(int i=0; i<cnt; i++) {
//		if(max < num[i]) {
//			max = num[i];
//		}
//		bw.write(max);
//		bw.write(i);
//	}

}
