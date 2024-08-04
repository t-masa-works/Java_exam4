package exam;

public class Exam4 {

	public static void main(String[] args) {
		//		資料を確認した後、以下の課題を解いてください
		//
		//		【課題1】
		//		10個の整数を要素とする新しい1次元配列を宣言して初期化し、任意の値を代入する。
		int[] numbers = new int[10];
		//		整数は10、12、14、16、18、20、22、24、26、28とする。
		numbers[0] = 10;
		numbers[1] = 12;
		numbers[2] = 14;
		numbers[3] = 16;
		numbers[4] = 18;
		numbers[5] = 20;
		numbers[6] = 22;
		numbers[7] = 24;
		numbers[8] = 26;
		numbers[9] = 28;
		//		配列の要素を for ループを使用して順番に表示するプログラム。
		//		配列の要素は11,12,13,14,15とする。
		int[] r_numbers = { 11, 12, 13, 14, 15 };
		for (int i = 0; i < r_numbers.length; i++) {
			System.out.println(r_numbers[i]);
		}
		//		配列の要素を合計してその結果を表示するプログラム。
		//		配列の要素は55,60,70,82とする。
		int[] p_numbers = { 55, 60, 70, 82 };
		int total = 0;
		for (int i = 0; i < p_numbers.length; i++) {
			int sum = p_numbers[i] + total;
			total = sum;
			System.out.println(sum);
		}
		//		配列の要素を for ループを使用して表示し、その中で偶数の場合は「偶数」と、奇数の場合は「奇数」と表示するプログラム
		//		配列の要素は5, 8, -1, 2とする。
		int[] gk_numbers = { 5, 8, -1, 2 };
		for (int i = 0; i < gk_numbers.length; i++) {
			if (gk_numbers[i] % 2 == 0) {
				System.out.println("偶数");
			} else {
				System.out.println("奇数");
			}
		}
		//		配列の要素の合計が特定の閾値を超える場合に「閾値を超えました」と表示するプログラム。
		//		閾値は100とする。
		int[] h_numbers = { 10, 20, 30, 40, 50, 60, 70, 80, 90, 100 };
		int h_total = 0;
		for (int i = 1; i < h_numbers.length; i++) {
			int sum = h_numbers[i] + h_total;
			h_total = sum;
			if (sum > 100) {
				System.out.println("閾値を超えました");
				break;
			} else {
				System.out.println(sum);
			}
		}
		//		【課題2】
		//		9*9の整数型2次元配列を宣言して初期化し、for文で九九を代入するプログラム
		int kuku[][] = new int[9][9];
		for (int x = 1; x <= 9; x++) {
			for (int y = 1; y <= 9; y++) {
				int mul = x * y;
				System.out.println(mul);
			}
			System.out.println();
		}
	}
}
