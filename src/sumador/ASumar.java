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
        if (cad.length() == 1) {
            return (cad + " = " + cad);
        }
        if (cad.substring(0,1).equals("-")) {
        	return "Negativo. Siempre negativo";
        }
        else {
        	StringBuilder resultado = new StringBuilder ();
        	for (int i = 0; i < cad.length(); i++) {
        		resultado.append(cad.substring(i, i+1));
        		resultado.append(" ");
        		if (i == cad.length()-1) {
        			resultado.append("= ");
        			resultado.append(sumar(cad));
        		}
        		else {
        			resultado.append("+ ");
        		}
        	}
        	return resultado.toString();
        }
	}
	
	/**
	 * Método que calcula la suma de todos los dígitos de un número
	 * @param valor_inicial: string con el número a operar
	 * @return Int con la suma de todos los dígitos
	 */
	public int sumar(String valor_inicial) {
        int suma = 0;

        for (int i = 0; i < valor_inicial.length(); i++) {
            String digito = valor_inicial.substring(i, i+1);
            suma = suma + Integer.parseInt(digito);  
        }
        return suma;
    }
}
