package modelo;

public abstract class ComboComida {
	protected String descripcion;
	protected double precio;

	protected ComboComida(String descripcion, double precio) {
		this.descripcion = descripcion;
		this.precio = precio;
	}

	public abstract double precio();

	public abstract String descripcion();
}
