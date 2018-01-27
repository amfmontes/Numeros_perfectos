/**
 * 
 */
package basico;

import java.util.Scanner;;

/**
 * @author Ana
 *
 */
public class Nperfectos {
	
	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub

	int sumadivisores;
						
		for (int numero=1; numero<10000; numero++) {
			sumadivisores=0;//Para cuando empezamos el conteo de números (el bucle), la suma de divisores es 0

			//Empezado el conteo de números, ha de empezar el conteo de i(divisores)
		    for (int i=1; i<numero; i++) {
			if ((numero%i) == 0) {//Si el numero lo dividimos entre i y sale 0, entonces suma ese i 
		 	sumadivisores =sumadivisores + i;}//Suma ese i, ya que los vas recopilando mientras haces el for
	
		}
		if (sumadivisores == numero) {//Si esa suma de divisores es igual al numero, entonces escrébemelo
			System.out.println(numero);}
		}
		
	}
}

		
		


	