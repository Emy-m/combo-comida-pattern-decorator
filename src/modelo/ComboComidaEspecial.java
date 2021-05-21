package modelo;

public class ComboComidaEspecial extends ComboComida {

	public ComboComidaEspecial(String descripcion, double precio) {
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
