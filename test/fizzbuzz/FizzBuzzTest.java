package fizzbuzz;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class FizzBuzzTest {

	@BeforeEach
	void setUp() throws Exception {
	}

	@Test
	void Niveau1() {
		assertEquals(FizzBuzz.fizzbuzz(1),"1");
	}
	
	@Test
	void Niveau2() {
		assertEquals(FizzBuzz.fizzbuzz(2),"2");
	}
	
	@Test
	void Niveau3() {
		assertEquals(FizzBuzz.fizzbuzz(3),"fizz");
	}
	
	@Test
	void Niveau4() {
		assertEquals(FizzBuzz.fizzbuzz(4),"4");
		assertEquals(FizzBuzz.fizzbuzz(7),"7");
	}
	
	@Test
	void Niveau5() {
		assertEquals(FizzBuzz.fizzbuzz(6),"fizz");
	}

	@Test
	void Niveau6() {
		assertEquals(FizzBuzz.fizzbuzz(5),"buzz");
		assertEquals(FizzBuzz.fizzbuzz(10),"buzz");
		assertEquals(FizzBuzz.fizzbuzz(500),"buzz");
	}
	
	@Test
	void Niveau7() {
		assertEquals(FizzBuzz.fizzbuzz(15),"fizzbuzz");
		assertEquals(FizzBuzz.fizzbuzz(2*5*3),"fizzbuzz");
		assertEquals(FizzBuzz.fizzbuzz(2*5*3*3),"fizzbuzz");
	}
}
