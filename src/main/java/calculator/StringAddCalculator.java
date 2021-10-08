package calculator;

import java.util.Arrays;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class StringAddCalculator {

	public static int splitAndSum(String expression) {
		int result = 0;
			
		if(isNullOrEmpty(expression)){
			return 0;
		}

		if(isLengthEqualOne(expression)){
			return Integer.parseInt(expression);
		}

		return splitWithDelimiterAndSum(expression);
	}

	private static int splitWithDelimiterAndSum(String expression) {
		int result = 0;
		String delimiter = ",|:";

		Matcher m = Pattern.compile("//(.)\n(.*)").matcher(expression);
		if (m.find()) {
			delimiter = m.group(1);
			expression = m.group(2);
		}

		return getSumOfExpression(delimiter,expression);
	}

	private static int getSumOfExpression(String delimiter, String expression) {
		return Arrays.asList(expression.split(delimiter)).stream()
			.map(number -> Integer.parseInt(number))
			.map(number -> isMinus(number))
			.mapToInt(intNumber -> intNumber)
			.sum();
	}

	private static int isMinus(int number) {
		if(number < 0){
			throw new RuntimeException();
		}
		return number;
	}

	private static boolean isLengthEqualOne(String expression) {
		return expression.length() == 1;
	}

	private static boolean isNullOrEmpty(String expression) {
		return expression == null || expression.isEmpty() || expression.isBlank();
	}
}
