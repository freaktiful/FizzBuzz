package FizzBuzz;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

public class FizzBuzzer {
	
	List<FizzBuzzerInterface> FizzBuzzSequence =
			Arrays.asList(new FizzBuzz(), new Number(), new Number(), new Fizz(), new Number(), new Buzz(), 
					      new Fizz(), new Number(), new Number(), new Fizz(), new Buzz(), new Number(), 
					      new Fizz(), new Number(), new Number());
	
	public String fizzBuzz(int number) {
		return FizzBuzzSequence.get(number%15).fizzBuzz(number);
	}

	public List<String> fizzBuzzer(int number) {
		List<Integer> range = IntStream.rangeClosed(1, number).boxed().collect(Collectors.toList());
		return range.stream().map(x -> fizzBuzz(x)).collect(Collectors.toList());
	}
}