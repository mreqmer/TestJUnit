package tests;

import static org.junit.jupiter.api.Assertions.assertEquals;

import java.util.stream.Stream;

import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

import clases.FuncionesRecursivas;

class TestRecursivas {

	@ParameterizedTest
	@MethodSource("sumatorios")
	void testSumatorio(int numero, int expected) {

		int res = FuncionesRecursivas.sumatorio(numero);
		assertEquals(expected, res);

	}

	private static Stream<Arguments> sumatorios() {

		return Stream.of(

				Arguments.of(5, 15),
				Arguments.of(4, 10),
				Arguments.of(1, 1)

		);

	}

	@ParameterizedTest
	@MethodSource("potencias")
	void testPotencia(double numero1, int numero2, int expected) {

		double res = FuncionesRecursivas.potencia(numero1, numero2);
		assertEquals(expected, res);

	}

	private static Stream<Arguments> potencias() {

		return Stream.of(

				Arguments.of(2, 3, 8),
				Arguments.of(5, 2, 25),
				Arguments.of(3, 4, 81)

		);

	}

	@ParameterizedTest
	@MethodSource("fibonacci")
	void testFibonacci (int numero, int expected) {
		
		int res = FuncionesRecursivas.fibonacci(numero);
		assertEquals(expected, res);
		
	}
	
	private static Stream<Arguments> fibonacci() {
		return Stream.of(

				Arguments.of(5, 5),
				Arguments.of(7, 13),
				Arguments.of(10, 55)

		);

	}
	
	
	
}
