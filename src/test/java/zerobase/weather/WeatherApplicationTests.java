package zerobase.weather;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertTrue;

@SpringBootTest
class WeatherApplicationTests {

	@Test
	void equalTest(){
		assertEquals(1, 1);
	}

	@Test
	void nullTest(){
		Assertions.assertNull(null);
	}

	@Test
	void trueTest(){
		assertTrue(1==1);
	}

}
