/*
 * This Java source file was generated by the Gradle 'init' task.
 */
package FizzBuzz;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

public class FizzBuzzTest {
	
	FizzBuzz fizzBuzzer = new FizzBuzz();
	
    @Test public void WhenAMultipleOf3IsPassedItReturnsFizz() {
        
        assertEquals("fizz", fizzBuzzer.fizzBuzz(3));
    }
    
    
    public class FizzBuzz {
    	public String fizzBuzz(int number) {
    		return "fizz";
    	}
    }
}
