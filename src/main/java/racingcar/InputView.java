package racingcar;

public class InputView {

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
}
