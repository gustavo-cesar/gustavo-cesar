package aula20200323.cofre;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class TestesComCofre {

	@Test
	void fecharAbrirCofre() {

		Cofre cofreFechado = new Cofre();

		assertEquals(false, cofreFechado.isAberto());

		cofreFechado.abrir();
		assertEquals(true, cofreFechado.isAberto());

		cofreFechado.fechar();
		assertEquals(false, cofreFechado.isAberto());

		Cofre cofre = new Cofre();
		cofre.abrir();
		assertEquals(true, cofre.isAberto());
	}

}
