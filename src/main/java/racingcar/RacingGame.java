package racingcar;

import java.util.Arrays;
import java.util.List;

public class RacingGame {

	private List<Car> cars;

	public void gameStart() {
		String carNamesString = InputView.getCarsNames();
		validateCarsName(carNamesString);

		int attempt = InputView.getRacingAttempt();
	}


	private void validateCarsName(String carNames) {
		if(isLessThanTwo(carNames)){
			throw new IllegalArgumentException("자동차는 최소 두대 이상이여야 합니다.");
		}
	}

	private boolean isLessThanTwo(String carNames) {
		return carNames.split(",").length < 2;
	}
}
