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
	 * M�todo que calcula la suma de todos los d�gitos de un n�mero
	 * @param valor_inicial: string con el n�mero a operar
	 * @return Int con la suma de todos los d�gitos
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
