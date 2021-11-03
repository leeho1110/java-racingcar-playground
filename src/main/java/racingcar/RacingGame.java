package racingcar;

import java.util.Arrays;
import java.util.stream.Collectors;

public class RacingGame {

	private Cars cars;
	private Cars winners;
	private Integer attempt;

	public void gameStart() {
		String carNamesString = InputView.getCarsNames();
		validateCarsName(carNamesString);

		this.attempt = InputView.getRacingAttempt();

		initCars(carNamesString);
		racing();
		checkWinners();

		ResultView.printWinners(winners);
	}

	private void checkWinners() {
		int winningPost = getWinningPost();

		this.winners = new Cars(cars.getCars().stream()
			.filter(car -> car.getPosition() == winningPost)
			.collect(Collectors.toList()));
	}

	private int getWinningPost() {
		return cars.getCars().stream()
			.mapToInt(car -> car.getPosition())
			.max()
			.getAsInt();
	}

	private void racing() {
		cars.move(this.attempt);
	}

	public void initCars(String carNamesString) {
		this.cars = new Cars(Arrays.asList(carNamesString.split(",")).stream()
			.map(name -> new Car(name))
			.collect(Collectors.toList()));
	}

	private void validateCarsName(String carNames) {
		if (isLessThanTwo(carNames)) {
			throw new IllegalArgumentException("자동차는 최소 두대 이상이여야 합니다.");
		}
	}

	private boolean isLessThanTwo(String carNames) {
		return carNames.split(",").length < 2;
	}

	public Cars getCars() {
		return this.cars;
	}
}
