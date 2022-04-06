package sumador;

/**
 * Pr�ctica de 1� DAW para poner en pr�ctica m�todos TDD
 * @author FERNANDO MACI� L�PEZ
 *
 */
public class ASumar {

	public ASumar() {

	}

	/**
	 * M�todo que descompone un string, realiza la suma, y muestra lo siguiente:
	 * "3 + 4 + 7 + 9 = 23"
	 * @param cad: string con el n�mero a operar
	 * @return string con los sumandos y el resultado de la suma
	 */
	public String sumativo(String cad) {
        String numero = cad;
        if (numero.length() == 1) {
            return (numero + " = " + numero);
        }
        else {
        	return "Error. Mi c�digo ha fallado...";
        }
	}
}
