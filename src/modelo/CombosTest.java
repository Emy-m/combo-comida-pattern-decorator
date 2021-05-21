package modelo;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

public class CombosTest {
	@Test
	public void comboTest() {
		ComboComida comboBasicoConPapasYQueso = new PorcionQueso("Queso", 100,
				new PorcionPapas("Papas", 150, new ComboComidaBasico("Combo Basico", 200)));

		assertEquals(450, comboBasicoConPapasYQueso.precio());
	}
}
