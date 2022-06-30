package Objetos;

public class Coche {

	//variables miembro o de instancia
	private String modelo;
	private String marca;
	private int potencia;
	private int velocidad; //así nadie puede tocarla salvo con un método
	private int velocidadMax;
	
	public Coche() {
		velocidad=0;
	}
	
	public Coche(String modelo, String marca, int potencia, int velocidadMax) {
		super();
		this.modelo = modelo;
		this.marca = marca;
		this.potencia = potencia;
		this.velocidadMax = velocidadMax;
		velocidad=0;
	}

	//métodos
	public void acelerar() { //void porque no devuelve nada
		if (velocidad+10<=velocidadMax) {
		velocidad=velocidad+10;
		}
	}
	
	public int getVelocidad() {
		return velocidad;
	}
	
	public void frenar() {
		velocidad=velocidad-15;
		if (velocidad<0) velocidad=0;
	}

	public String getModelo() {
		return modelo;
	}

	public void setModelo(String modelo) {
		this.modelo = modelo;
	}

	public String getMarca() {
		return marca;
	}

	public void setMarca(String marca) {
		this.marca = marca;
	}

	public int getPotencia() {
		return potencia;
	}

	public void setPotencia(int potencia) {
		this.potencia = potencia;
	}

	public int getVelocidadMax() {
		return velocidadMax;
	}

	public void setVelocidadMax(int velocidadMax) {
		this.velocidadMax = velocidadMax;
	}
	
}
