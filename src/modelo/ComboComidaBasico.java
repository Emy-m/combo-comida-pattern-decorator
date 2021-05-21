package modelo;

public class ComboComidaBasico extends ComboComida {

	public ComboComidaBasico(String descripcion, double precio) {
		super(descripcion, precio);
	}

	@Override
	public double precio() {
		return this.precio;
	}

	@Override
	public String descripcion() {
		return this.descripcion;
	}

}
