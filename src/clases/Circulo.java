package clases;

/**
 * @author Pepe
 * @version 2.0
 */
public class Circulo {
	private int id;
	private String nombre;
	private double radio;
	
	public Circulo() {}
	
	public Circulo(int id, String nombre, double radio) {
		super();
		this.id = id;
		this.nombre = nombre;
		this.radio = radio;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public double getRadio() {
		return radio;
	}

	public void setRadio(double radio) {
		this.radio = radio;
	}

	@Override
	public String toString() {
		return "Circulo [id=" + id + ", nombre=" + nombre + ", radio=" + radio + "]";
	}
	
	
	
	
}
