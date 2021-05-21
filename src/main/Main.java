package main;

import modelo.ComboComida;
import modelo.ComboComidaBasico;
import modelo.ComboComidaEspecial;
import modelo.PorcionCarne;
import modelo.PorcionPapas;
import modelo.PorcionQueso;
import modelo.PorcionTomate;

public class Main {

	public static void main(String[] args) {
		ComboComida comboBasicoConPapasYQueso = new PorcionQueso("Queso", 100,
				new PorcionPapas("Papas", 150, new ComboComidaBasico("Combo Basico", 200)));

		ComboComida comboEspecialConTomateYCarne = new PorcionCarne("Carne", 150,
				new PorcionTomate("Tomate", 50, new ComboComidaEspecial("Combo Especial", 300)));

		System.out.println("Primer pedido: " + comboBasicoConPapasYQueso.descripcion() + " Precio: "
				+ comboBasicoConPapasYQueso.precio());
		System.out.println("Segundo pedido: " + comboEspecialConTomateYCarne.descripcion() + " Precio: "
				+ comboEspecialConTomateYCarne.precio());
	}

}
