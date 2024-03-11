package tests;

import static org.junit.jupiter.api.Assertions.assertArrayEquals;
import static org.junit.jupiter.api.Assertions.assertEquals;

import java.util.stream.Stream;

import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

import clases.Tablas;

class TestTablas {

	@ParameterizedTest
	@MethodSource("magica")
	void testMagica(int[][] tabla, boolean expected) {

		boolean res = Tablas.esMagica(tabla);
		assertEquals(expected, res);

	}

	private static Stream<Arguments> magica() {

		int[][] matrizMagica1 = { { 2, 7, 6 }, { 9, 5, 1 }, { 4, 3, 8 } };

		int[][] matrizMagica2 = { { 1, 2, 3 }, { 4, 5, 6 }, { 7, 8, 9 } };
		int[][] matrizMagica3 = { { 1, 2 }, { 3, 4 } };

		return Stream.of(

				Arguments.of(matrizMagica1, true), Arguments.of(matrizMagica2, false),
				Arguments.of(matrizMagica3, false));

	}

	@ParameterizedTest
	@MethodSource("gira")
	void testGira90(int[][] tabla, int[][] expected) {

		int[][] res = Tablas.gira90(tabla);
		assertArrayEquals(expected, res);

	}

	private static Stream<Arguments> gira() {

		
		int[][] matriz1 = { { 1, 2 }, { 3, 4 }, {5, 6} };
		int[][] matriz2 = { { 1, 2, 3 }, { 4, 5, 6 }, { 7, 8, 9 } };
		int[][] matriz2Esperada = { { 7, 4, 1 }, { 8, 5, 2 }, { 9, 6, 3 } };

		return Stream.of(

				Arguments.of(null, null),
				Arguments.of(matriz1, null),
				Arguments.of(matriz2, matriz2Esperada)
		);

	}

}
