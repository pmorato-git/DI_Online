package clases;

/**
 * @author Pablo Morato
 * @version 1.0
 */
public class Main {

	public static void main(String[] args) {
		Circulo circulo1 = new Circulo(1, "circulo1", 3);
		Rectangulo rectangulo1 = new Rectangulo(1, "Rectangulo1", 2, 3);
		
		double areaCirculo = calcularAreaCirculo(circulo1);
		
		double areaRectangulo = calcularAreaRectangulo(rectangulo1);
		
		// Imprimir los resultados 
		System.out.println(circulo1);
		System.out.println("Area circulo: "+areaCirculo);
		System.out.println("rectangulo1");
		System.out.println("Area cuadrado: "+areaRectangulo);
	}

	/**
	 * @param pasamos los lados del rectangulo, lado A
	 * @param ladoB
	 * @return area del rectangulo
	 */
	private static double calcularAreaRectangulo(Rectangulo rectangulo1) {
		// Calculo area rectangulo
		double ladoA = rectangulo1.getLadoA();
		double ladoB = rectangulo1.getLadoB();
		double areaRectangulo = ladoA*ladoB;
		return areaRectangulo;
	}

	/**
	 * Este método servirá para calcular el area de un circulo
	 * @param radio del circulo qu evamos a utilizar
	 * @return area del circulo
	 */
	private static double calcularAreaCirculo(Circulo circulo1) {
		// Calculo area circulo pi * r * r
		double radio = circulo1.getRadio();
		double areaCirculo = 3.14 * radio * radio;
		return areaCirculo;
	}

}
