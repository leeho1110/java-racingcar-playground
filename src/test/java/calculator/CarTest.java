package calculator;

import static org.assertj.core.api.Assertions.*;

import org.junit.jupiter.api.Test;

import racingcar.Car;

public class CarTest {

	@Test
	public void 차_이름은_5자를_초과할수없다(){
		Car car = new Car("name");

		String userInput = "fi_ve";
		assertThat(car.validateNames(userInput)).isTrue();

		userInput = "overThanFive";
		assertThat(car.validateNames(userInput)).isFalse();
	}
}
