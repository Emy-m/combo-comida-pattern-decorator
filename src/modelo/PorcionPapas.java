package modelo;

public class PorcionPapas extends PorcionAdicional {

	public PorcionPapas(String descripcion, double precio, ComboComida combo) {
		super(descripcion, precio, combo);
	}

	@Override
	public String descripcion() {
		return combo.descripcion() + ", porciond epapas";
	}

	@Override
	public double precio() {
		return combo.precio() + this.precio;
	}

}
