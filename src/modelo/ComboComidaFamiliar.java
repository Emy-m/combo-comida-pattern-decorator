package modelo;

public class ComboComidaFamiliar extends ComboComida {

	public ComboComidaFamiliar(String descripcion, double precio) {
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
