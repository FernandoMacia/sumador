package sumador;

import java.util.Scanner;

public class FMLFunciona {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String cad = "";
		ASumar asumar = new ASumar();
		System.out.print("Introduzca un número: ");
		cad = sc.nextLine();
		System.out.print(asumar.sumativo(cad));
	}
}
