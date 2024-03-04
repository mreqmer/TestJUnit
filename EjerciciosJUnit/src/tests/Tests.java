package tests;

import static org.junit.jupiter.api.Assertions.assertEquals;

import java.util.stream.Stream;

import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

import clases.Cadenas;

class Tests {
	
	//comprueba el método cuentaEspacios
	
	@ParameterizedTest
	@MethodSource("espacio")
	void testCuentaEspacios (String frase, int expected) {
	
		Cadenas cadena = new Cadenas(frase);
		int res = cadena.cuentaEspacios();
		assertEquals(expected, res);
		
	}
	
	private static Stream<Arguments> espacio() {

		return Stream.of(

				Arguments.of("Hola, buenos días", 2), 
				Arguments.of("Buenas", 0), 
				Arguments.of("T", 0),
				Arguments.of("", 0)

		);

	}
	
	//test delReves
	
	@ParameterizedTest
	@MethodSource("reves")
	void testDelReves (String frase, String expected) {
		
		Cadenas cadena = new Cadenas(frase);
		String res = cadena.delReves(); 
		assertEquals(expected, res);
		
	}
	
	private static Stream<Arguments> reves(){
		return Stream.of(
				
			Arguments.of("Hola, buenos dias", "said soneub ,aloH"),	
			Arguments.of("Hola", "aloH"),	
			Arguments.of("A", "A")
			
		);
				
	}
	
	//test contarPalabra
	
	@ParameterizedTest
	@MethodSource("palabra")
	void testContarPalabra(String frase, String palabra, int expected) {
		
		Cadenas cadena = new Cadenas(frase);
		int res = cadena.contarPalabra(palabra); 
		assertEquals(expected, res);
		
		
	}
	
	private static Stream<Arguments> palabra(){
		return Stream.of(
				
				Arguments.of("Hola, buenos días buenos", "buenos", 2),
				Arguments.of("Hola que tal", "que", 1),
				Arguments.of("A", "A", 1)
				
				
		);
	}
	
	
	
	

}
