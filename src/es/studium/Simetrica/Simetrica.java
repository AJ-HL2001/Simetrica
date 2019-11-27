package es.studium.Simetrica;

import java.util.Scanner;

public class Simetrica {

	public static void main(String[] args) {
		Scanner teclado = new Scanner(System.in);
			
		//Variables
		int tabla[][] = new int [3][3];
		int i, j;
		boolean simetrica = true;
		
		//Inicio
		for(i=0;i<3;i++) {
			for(j=0;j<3;j++) {
				System.out.println("Ingrese el valor de la posición:("+i+","+j+")");
				tabla[i][j] = teclado.nextInt();
			}
		}
		for(i=0;(i<3)&&(simetrica);i++) {
			for(j=0;(j<3)&&(simetrica);j++) {
				if(tabla[i][j]!=tabla[j][i]) {
					simetrica = false;
				}
			}
		}
		if(simetrica) {
			System.out.println("La matriz es simétrica");
		}
		else {
			System.out.println("La matriz no es simétrica");
		}
		teclado.close();
	}
}
