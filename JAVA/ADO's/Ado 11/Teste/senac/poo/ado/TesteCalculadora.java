package senac.poo.ado;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class TesteCalculadora {

	@Test
	public void testeSoma() {
		Calculadora Calculo1 = new Calculadora(5.0, 10.50);
		Calculo1.Somar();
		
		assertEquals(5.0, 10.50, Calculo1.getSoma());
	}
	@Test
	public void testeSubtrair() {
		Calculadora Calculo2 = new Calculadora(7.5, 3.4);
		Calculo2.Subtrair();
		
		assertEquals(7.5, 3.4, Calculo2.getSubtracao());
	}
	@Test
	public void testeMultiplicar() {
		Calculadora Calculo3 = new Calculadora(1.2, 2.5);
		Calculo3.Multiplicar();
		
		assertEquals(1.2, 2.5, Calculo3.getMultiplicacao());
	}
	@Test
	public void testeDividir() {
		Calculadora Calculo4 = new Calculadora(3.0, 2.0);
		Calculo4.Dividir();
		
		assertEquals(3.0, 2.0, Calculo4.getDivisao());
	}

}
