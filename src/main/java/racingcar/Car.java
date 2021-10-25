package racingcar;

import java.util.regex.Pattern;

public class Car {

	String name;
	int position;

	public Car(String name) {
		initName(name);
	}

	public void initName(String name){
		if(validateNames(name)){
			this.name = this.name;
			return;
		}

		throw new IllegalArgumentException("자동차 이름은 5자 이하여야 합니다.");
	}

	public boolean validateNames(String userInput) {
		return Pattern.matches(".{1,5}$",userInput);
	}

	public int getPosition() {
		return position;
	}

	public void setPosition(int position) {
		this.position = position;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}
}
