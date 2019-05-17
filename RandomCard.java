package cn.tedu.day01;

import java.util.Random;

public class RandomCard {

	public static void main(String[] args) {
		Random random = new Random();
		String[] arr1 = { "A", "2", "3", "4", "5", "6", "7", "8", "9", "10", "J", "Q", "K" };
		String[] arr2 = { "黑桃", "红桃", "草花", "方块" };

		for (int i = arr1.length - 1; i > 0; i--) {
			int j = random.nextInt(i);
			String t = arr1[i];
			arr1[i] = arr1[j];
			arr1[j] = t;

		}
		
		for (int i = 0; i < arr1.length; i++) {
			for (int j = 0; j < arr2.length; j++) {
				System.out.print("\t" + arr2[j] + arr1[i]);
			}
			System.out.println();
		}
		System.out.println("\t" + "大怪" + "\t" + "小怪");
	}
}
