package FizzBuzz;

public class Number implements FizzBuzzerInterface {
	@Override
	public String fizzBuzz(int number) {
		return String.valueOf(number);
	}
}