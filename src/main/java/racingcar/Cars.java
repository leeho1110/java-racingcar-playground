package racingcar;

import java.util.List;

public class Cars {

	private List<Car> cars;

	public Cars(List<Car> carsList) {
		this.cars = carsList;
	}

	public void move(Integer attempt) {
		for (int i = 0; i < attempt; i++) {
			cars.stream().forEach(car -> car.move());
			System.out.println();
		}

	}

	public List<Car> getCars() {
		return cars;
	}
}
