package test_batch;

import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Example {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		String inputPhone = "";
		int numOfPhone = 0;

		String inputQuantity = "";
		System.out.println("Enter quantity: ");
		inputQuantity = scanner.nextLine();

		Pattern patternNum = Pattern.compile("\\d*");
		Matcher matcher = patternNum.matcher(inputQuantity);
		if (matcher.matches()) {
			numOfPhone = Integer.parseInt(inputQuantity);
			int i = 0;
			String arrPhoneNumber[] = new String[numOfPhone];
			int j = 0;
			while (j <= numOfPhone) {
				String pattern = ("((84) +([0-9]{9}))|((|0[3|5|7|8|9])+([0-9]{8}))\\b");
				System.out.println("Input your phone number: ");
				inputPhone = scanner.nextLine();
				if (inputPhone.matches(pattern)) {
					arrPhoneNumber[i] = inputPhone;
					i++;
				} else {
					System.out.println("NOT OKE");
				}
				j++;
			}
			System.out.println("This is your phone number : " );
			for(int k = 0; k < arrPhoneNumber.length ; k++) {
				System.out.println(arrPhoneNumber[k]);
			}
			
		} else {
			System.out.println("quantity must be number");
		}
	}

}
