package modelo;

public class PorcionQueso extends PorcionAdicional {

	public PorcionQueso(String descripcion, double precio, ComboComida combo) {
		super(descripcion, precio, combo);
	}

	@Override
	public String descripcion() {
		return combo.descripcion() + ", porcion de queso";
	}

	@Override
	public double precio() {
		return combo.precio() + this.precio;
	}
}
