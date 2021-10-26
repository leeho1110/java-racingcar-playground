package racingcar;

import java.util.Scanner;

public class InputView {

	private static Scanner scanner = new Scanner(System.in);

	public static void printCarsPostion(String name, int position) {
		System.out.println(name + ": " + makePositionView(position));
	}

	private static String makePositionView(int position) {
		String postionString = "";
		for (int i = 0; i < position; i++) {
			postionString += "-";
		}

		return postionString;
	}

	public static String getCarsNames() {
		System.out.println("경주할 자동차 이름을 입력하세요 (이름은 쉼표(,)를 기준으로 구분).\n-> ");
		return scanner.nextLine();
	}

	public static int getRacingAttempt() {
		System.out.println("경주할 자동차 이름을 입력하세요 (이름은 쉼표(,)를 기준으로 구분).\n-> ");
		return Integer.parseInt(scanner.nextLine());
	}
}
