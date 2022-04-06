package sumador;

/**
 * Práctica de 1º DAW para poner en práctica métodos TDD
 * @author FERNANDO MACIÁ LÓPEZ
 *
 */
public class ASumar {

	public ASumar() {

	}

	/**
	 * Método que descompone un string, realiza la suma, y muestra lo siguiente:
	 * "3 + 4 + 7 + 9 = 23"
	 * @param cad: string con el número a operar
	 * @return string con los sumandos y el resultado de la suma
	 */
	public String sumativo(String cad) {
        String numero = cad;
        if (numero.length() == 1) {
            return (numero + " = " + numero);
        }
        else {
        	return "Error. Mi código ha fallado...";
        }
	}
}
