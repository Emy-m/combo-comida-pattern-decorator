package modelo;

public class PorcionTomate extends PorcionAdicional {

	public PorcionTomate(String descripcion, double precio, ComboComida combo) {
		super(descripcion, precio, combo);
	}

	@Override
	public String descripcion() {
		return combo.descripcion() + ", porcion de tomate";
	}

	@Override
	public double precio() {
		return combo.precio() + this.precio;
	}

}
