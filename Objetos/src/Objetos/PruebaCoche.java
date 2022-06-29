package Objetos;

import java.util.Scanner;

public class PruebaCoche {

	public static void main(String[] args) {
		Scanner entrada= new Scanner(System.in);
		
		/*Coche coche1=new Coche();
		System.out.println("Marca: ");
		coche1.marca=entrada.nextLine();
		
		System.out.println("Modelo: ");
		coche1.modelo=entrada.nextLine();
		
		System.out.println("Potencia: ");
		coche1.potencia=entrada.nextInt();*/
		
		Coche c2=new Coche();
		//c2.marca="Ford";
		c2.setMarca("Ford");
		//c2.modelo="Mondeo";
		c2.setModelo("Mondeo");
		c2.setPotencia(120);
		c2.setVelocidadMax(40));
		
		c2.acelerar();
		c2.acelerar();
		c2.acelerar();
		c2.acelerar();
		c2.acelerar();
		
	//	c2.setVelocidad(23); método no existe y variable es privada

		System.out.println("El coche va a "+c2.getVelocidad());
		
		c2.frenar();
		c2.frenar();
		c2.frenar();

		System.out.println("El coche va a "+c2.getVelocidad());
		
		Coche c3= new Coche("Seat","León",105,170);

	}

}
