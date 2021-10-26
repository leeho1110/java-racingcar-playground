package racingcar;

import java.util.Arrays;
import java.util.List;

public class RacingGame {

	private List<Car> cars;

	public void gameStart() {
		String carNamesString = InputView.getCarsNames();
		int attempt = InputView.getRacingAttempt();
	}

	private boolean isLessThanTwo(String carNames) {
		return carNames.split(",").length < 2;
	}
}
