import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

class FizzBuzzTest {
	
	public static final FizzBuzz fizzBuzz = new FizzBuzz();
	
	@Test
	@DisplayName("returns numbers as strings if they're not multiples of 3 and/or 5")
	public void convertsSequenceOfNumbersOneAndTwo() {
		var input = List.of(1, 2);
		var expected = List.of("1", "2");
		assertEquals(expected, fizzBuzz.convert(input));
	}
	
	@Test
	@DisplayName("converts the number 3 to fizz")
	public void convertsNumberThreeToFizz() {
		var input = List.of(3);
		var expected = List.of("Fizz");
		assertEquals(expected, fizzBuzz.convert(input));
	}
	
	@Test
	@DisplayName("converts multiples of 3 to fizz and keeps other numbers")
	public void convertsMultiplesOfThreeAndKeepsOthers() {
		var input = List.of(1, 19, 3, 9);
		var expected = List.of("1", "19", "Fizz", "Fizz");
		assertEquals(expected, fizzBuzz.convert(input));
	}
	
	@Test
	@DisplayName("converts multiples of 5 to buzz and keeps other numbers")
	public void convertsMultiplesOfFiveAndKeepsOthers() {
		var input = List.of(5, 10, 14, 2);
		var expected = List.of("Buzz", "Buzz", "14", "2");
		assertEquals(expected, fizzBuzz.convert(input));
	}
	
	@Test
	@DisplayName("converts multiples of 3 to fizz, multiples of 5 to buzz and keeps other numbers")
	public void convertsFizzAndBuzzAndLeavesOthers() {
		var input = List.of(5, 9, 2, 18, 10);
		var expected = List.of("Buzz", "Fizz", "2", "Fizz", "Buzz");
		assertEquals(expected, fizzBuzz.convert(input));
	}
	
	@Test
	@DisplayName("converts multiples of 3 and 5 to FizzBuzz")
	public void convertsToFizzBuzz() {
		var input = List.of(15);
		var expected = List.of("FizzBuzz");
		assertEquals(expected, fizzBuzz.convert(input));
	}
	
	@Test
	@DisplayName("converts multiples of 3 to Fizz, multiples of 5 to Buzz, multiples of 3 and 5 to FizzBuzz, and stringifies other numbers")
	public void convertsToFizzAndBuzzAndFizzBuzz() {
		var input = List.of(15, 3, 9, 10, 7);
		var expected = List.of("FizzBuzz", "Fizz", "Fizz", "Buzz", "7");
		assertEquals(expected, fizzBuzz.convert(input));
	}
}
