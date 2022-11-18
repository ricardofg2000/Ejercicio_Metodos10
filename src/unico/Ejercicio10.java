package unico;

public class Ejercicio10 {

	public static void main(String[] args) {
		/*
		 * Implementar un método que calcule la raíz cuadrada de un número por
		 * aproximaciones. La función debe recibir un número y devolver el resultado.
		 * Luego tras la llamada, debemos mostrar el resultado, y si descubrimos que no
		 * es exacto, debemos calcular el resto y mostrarlo.
		 * 
		 * Por ejemplo, para calcular la raíz cuadrada de 23, probamos con:
		 * 
		 * con el 5 nos pasamos, con lo que el resultado del método sería 4. Mostramos
		 * el resultado del método, y luego calculamos el resto: 23-16=7.
		 */
		final String RAIZT = "La raiz es ";
		final String RESTOT = "El resto es ";
		int num;
		int resto;
		int raiz;

		num = Util.leerInt("Introduzca un número: ");
		raiz = raizCuadrada(num);
		Util.escribir(RAIZT + raiz);
		if (raiz*raiz != num) {
			resto = num - raiz*raiz;
			Util.escribir(RESTOT + resto);
		}
		
	}

	private static int raizCuadrada(int num) {
		int aprox;
		for (aprox = 1; (aprox * aprox) <= num; aprox++);
		aprox += -1;
		return aprox; 
	}

}
