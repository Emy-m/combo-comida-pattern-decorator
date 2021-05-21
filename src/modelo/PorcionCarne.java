package modelo;

public class PorcionCarne extends PorcionAdicional {

	public PorcionCarne(String descripcion, double precio, ComboComida combo) {
		super(descripcion, precio, combo);
	}

	@Override
	public String descripcion() {
		return combo.descripcion() + ", porcion de carne";
	}

	@Override
	public double precio() {
		return combo.precio() + this.precio;
	}

}
