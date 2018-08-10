package calculadora;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class TestaCalculadora 
{

	Calculadora calc = new Calculadora();
	
	int [] n = {1, 2, 3, 4, 5};
	
	@Test
	void testSoma() { assertEquals(10, calc.soma(5, 5)); }
	
	@Test
	void testSubtracao() { assertEquals(3, calc.subtrai(5, 2)); }
	
	@Test
	void testMaior() { assertEquals(10, calc.maior(9, 10)); }
	
	@Test
	void testaRaiz() { assertEquals(2, calc.raiz(4)); }
	
	@Test
	void testaMedia() { assertEquals(3, calc.media(n)); }

}
