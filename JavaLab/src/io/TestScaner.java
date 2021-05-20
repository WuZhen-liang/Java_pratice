package io;

import java.util.Scanner;

public class TestScaner {

	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in);
		System.out.println("請輸入選項:");
		System.out.println("1:xxxxx");
		System.out.println("2:xxxxx");
		String answer = scanner.nextLine();
		int selection = Integer.parseInt(answer);
		System.out.println("使用者輸入為:"+answer);
		if (selection >2) {
			System.out.println("True");
		}
		
		
	}

}
