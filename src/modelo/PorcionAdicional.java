package modelo;

public abstract class PorcionAdicional extends ComboComida {

	protected ComboComida combo;

	protected PorcionAdicional(String descripcion, double precio, ComboComida combo) {
		super(descripcion, precio);
		this.combo = combo;
	}

	protected ComboComida combo() {
		return this.combo;
	}

	@Override
	public abstract String descripcion();

}
