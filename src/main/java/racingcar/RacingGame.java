package racingcar;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class RacingGame {

	private List<Car> cars;

	public void gameStart() {
		String carNamesString = InputView.getCarsNames();
		validateCarsName(carNamesString);

		int attempt = InputView.getRacingAttempt();

		initCars(carNamesString);

	}

	public static void main(String[] args) {
		RacingGame g = new RacingGame();
		g.initCars("c1,c2");
	}

	public void initCars(String carNamesString) {
		List<Car> carList = Arrays.asList(carNamesString.split(",")).stream().map(name -> new Car(name)).collect(
			Collectors.toList());
		this.cars = carList;
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
