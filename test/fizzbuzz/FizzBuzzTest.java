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

}
