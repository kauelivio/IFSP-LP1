/*						AULA ASSINCRONA 31/08 - LP1I3

	KAUÊ DE JESUS LIVIO CB3005461 E PEDRO PAULO DOS REIS FARIA CB3007278
	
*/

import java.util.Scanner;

class TP02Ex06 {
	public static void main(String[] args) {
		
		String[][] nomes = {
			{"Kaue", "Luis", "Pedro"},
			{"Luis", "Victor", "Guilherme"}
		};
		
		for (int i = 0; i < 2; i++){
			for (int j = 0; j < 3; j++){
				System.out.print(" " + nomes[i][j] + " ");
			}
			System.out.println();
		}
	}
}