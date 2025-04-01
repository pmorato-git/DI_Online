package clases;

public class Main {

	public static void main(String[] args) {
		Circulo circulo1 = new Circulo(1, "circulo1", 3);
		Rectangulo rectangulo1 = new Rectangulo(1, "Rectangulo1", 2, 3);
		
		// Calculo area circulo pi * r * r
		double radio = circulo1.getRadio();
		double areaCirculo = 3.14 * radio * radio;
		
		// Calculo area rectangulo
		double ladoA = rectangulo1.getLadoA();
		double ladoB = rectangulo1.getLadoB();
		double areaRectangulo = ladoA*ladoB;
		
		// Imprimir los resultados 
		System.out.println(circulo1);
		System.out.println("Area circulo: "+areaCirculo);
		System.out.println("rectangulo1");
		System.out.println("Area cuadrado: "+areaRectangulo);
	}

}
