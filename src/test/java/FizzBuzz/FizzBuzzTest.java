/*
 * This Java source file was generated by the Gradle 'init' task.
 */
package FizzBuzz;

import static org.junit.Assert.assertEquals;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import org.junit.Test;

public class FizzBuzzTest {
	
	FizzBuzzer fizzBuzzer = new FizzBuzzer();

    @Test 
    public void WhenAMultipleOf3IsPassedItReturnsFizz() {
        assertEquals("fizz", fizzBuzzer.fizzBuzz(3));
        assertEquals("fizz", fizzBuzzer.fizzBuzz(6));
        assertEquals("fizz", fizzBuzzer.fizzBuzz(9));
    }

    @Test 
    public void WhenAMultipleOf5IsPassedItReturnsBuzz() {
        assertEquals("buzz", fizzBuzzer.fizzBuzz(5));
        assertEquals("buzz", fizzBuzzer.fizzBuzz(10));
        assertEquals("buzz", fizzBuzzer.fizzBuzz(20));
    }
    
    @Test
    public void WhenAMultipleOf15IsPassedItReturnsFizzBuzz() {
    	assertEquals("fizzbuzz", fizzBuzzer.fizzBuzz(15));
    	assertEquals("fizzbuzz", fizzBuzzer.fizzBuzz(30));
    	assertEquals("fizzbuzz", fizzBuzzer.fizzBuzz(45));
    }
    
    @Test
    public void WhenNoRequirementIsFulfilledItReturnsTheNumber() {
    	assertEquals("4", fizzBuzzer.fizzBuzz(4));
    	assertEquals("7", fizzBuzzer.fizzBuzz(7));
    	assertEquals("8", fizzBuzzer.fizzBuzz(8));
    }
    
    List<String> stringOutput = new ArrayList<String>(Arrays.asList( "1","2","fizz","4","buzz","fizz", "7","8", "fizz", "buzz", "11", "fizz", "13", "14", "fizzbuzz",
    		 "16","17","fizz","19","buzz","fizz", "22","23", "fizz", "buzz", "26", "fizz", "28", "29", "fizzbuzz")); 
    
    @Test
    public void WriteTheWholeSequenceOfFizzBuzzerUntilTheProvidedNumber() {
    	assertEquals(stringOutput, fizzBuzzer.fizzBuzzer(30));
    }
    
}
