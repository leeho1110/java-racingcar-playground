package racingcar;

public class ResultView {

	public static void printWinners(Cars cars) {
		String winnersNames = "";

		for (Car car : cars.getCars()) {
			winnersNames += car.getName() + " ";
		}

		System.out.println("우승자는 " + winnersNames + "입니다.");
	}

}
