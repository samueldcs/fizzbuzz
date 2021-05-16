import java.util.List;
import java.util.function.Function;

import static java.util.stream.Collectors.*;

public class FizzBuzz {
	
	public static final String FIZZ = "Fizz";
	private static final String BUZZ = "Buzz";
	
	public List<String> convert(final List<Integer> input) {
		return input.stream()
				.map(toFizzBuzz())
				.collect(toUnmodifiableList());
	}
	
	private Function<Integer, String> toFizzBuzz() {
		return number -> {
			if (isMultipleOfThreeAndFive(number)) {
				return FIZZ + BUZZ;
			}
			if (isMultipleOfThree(number)) {
				return FIZZ;
			}
			if (isMultipleOfFive(number)) {
				return BUZZ;
			}
			return number.toString();
		};
	}
	
	private boolean isMultipleOfThreeAndFive(final Integer number) {
		return isMultipleOfThree(number) && isMultipleOfFive(number);
	}
	
	private boolean isMultipleOfFive(final Integer number) {
		return number % 5 == 0;
	}
	
	private boolean isMultipleOfThree(final Integer number) {
		return number % 3 == 0;
	}
}
