package ejercicio1;

public class Ciclo {
	private String nombre;
	private String tipo;
	
	public Ciclo(String nombre, String tipo) {
		this.nombre = nombre;
		this.tipo = tipo;
	}

	public String getNombre() {
		return nombre;
	}

	public String getTipo() {
		return tipo;
	}

	@Override
	public String toString() {
		return nombre + "("+ tipo + ")";
	}
	
	
}
