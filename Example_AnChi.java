package test_batch;

import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Example_AnChi {

	private static int validationNumber() {
		Scanner scanner = new Scanner(System.in);
		int inputNumber = 0;
		String input = "";
		do {
			System.out.print("Nhập số chẵn : ");
			input = scanner.nextLine();
			Pattern patternNum = Pattern.compile("\\d*");
			Matcher matcher = patternNum.matcher(input);
			if (matcher.matches()) {
				inputNumber = Integer.parseInt(input);
				if (inputNumber % 2 != 0 || inputNumber == 0) {
					System.out.println("Số nhập vào phải là số chẵn và khác 0 nhé AN CHI !!!");
				}
			} else {
				System.out.println("An Chi Nhập ký tự bậy à ^_^ !!!");
			}
		} while (inputNumber % 2 != 0 || inputNumber == 0);
		return inputNumber;
	}
	private static void handleInput(int inputNumber) {
		if (inputNumber % 2 == 0) {
			int result = 0;
			int sumBefore = 0;
			int sumAfter = 0;
			for (int i = 0; i <= inputNumber / 2; i++) {
				sumBefore += i;
			}
			for (int j = inputNumber / 2; j <= inputNumber; j++) {
				sumAfter += j;
			}
			result = sumAfter - sumBefore;
			System.out.println("Sum(" + inputNumber / 2 + "->" + inputNumber + ") - " + "Sum(0->" + inputNumber / 2
					+ ") = " + result);
		}
	}

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		int inputNumber = validationNumber();
		handleInput(inputNumber);
		System.out.print("Để tiếp tục nhấn phím A _ Muốn thoát nhấn phím C: ");
		String choose = scanner.nextLine().toUpperCase();
		if ("C".equals(choose)) {
			System.exit(0);
		}
		while ("A".equals(choose)) {
			inputNumber = validationNumber();
			handleInput(inputNumber);
		}
	}
}
