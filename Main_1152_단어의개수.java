package prac;

import java.util.Scanner;

/*
 * ���� ��ҹ��ڿ� �������� �̷���� ���ڿ��� �־�����. 
 * �� ���ڿ����� �� ���� �ܾ ������? 
 * ��, �� �ܾ ���� �� �����ϸ� ������ Ƚ����ŭ ��� ����� �Ѵ�.
 * 
 * ù �ٿ� ���� ��ҹ��ڿ� �������� �̷���� ���ڿ��� �־�����. 
 * �� ���ڿ��� ���̴� 1,000,000�� ���� �ʴ´�. 
 * �ܾ�� ���� �� ���� ���еǸ�, ������ �����ؼ� ������ ���� ����. 
 * ���� ���ڿ��� �������� �����ϰų� ���� �� �ִ�.
 */

public class Main_1152_�ܾ��ǰ��� {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		String str = null;
		String[] word;

		str = scan.nextLine();

		str = str.trim();
		
		if (str.equals("")) {
			System.out.println(0);
		} else {
			word = str.split(" ");
			System.out.println(word.length);
		}

	}

}
