package tests;



import static org.junit.jupiter.api.Assertions.assertEquals;


import java.util.stream.Stream;

import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

import clases.Numeros;

class TestNumeros {

	@ParameterizedTest
	@MethodSource("primo")
	void testPrimo (int numero, boolean expected) {
		
		Numeros num = new Numeros(numero);
		boolean res = num.esPrimo();
		assertEquals(expected, res);
		
	}
	
	private static Stream<Arguments> primo() {

		return Stream.of(
				
				Arguments.of(1, false),
				Arguments.of(2, true),
				Arguments.of(7, true),
				Arguments.of(8, false)

		);

	}
	
	@ParameterizedTest
	@MethodSource("capicua")
	void testCapicua (int numero, boolean expected) {
		
		Numeros num = new Numeros(numero);
		boolean res = num.esCapicua();
		assertEquals(expected, res);
		
	}
	

	private static Stream<Arguments> capicua() {

		return Stream.of(
				
				Arguments.of(0, true),
				Arguments.of(-1, false),
				Arguments.of(7, true),
				Arguments.of(1221, true)

		);

	}

}
