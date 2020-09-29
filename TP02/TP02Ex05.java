/*						AULA ASSINCRONA 31/08 - LP1I3

	KAUÊ DE JESUS LIVIO CB3005461 E PEDRO PAULO DOS REIS FARIA CB3007278
	
*/

import java.util.Scanner;

class TP02Ex05 {
	public static void main(String[] args) {
		
		int[][] valores = new int[3][2];
		
		Scanner ler = new Scanner(System.in);
			
		for (int i = 0; i < 3; i++){
			for (int j = 0; j < 2; j++){
				valores[i][j] = i + j;
			}
		}
		
		for (int i = 0; i < 3; i++){
			for (int j = 0; j < 2; j++){
				System.out.print(" " + valores[i][j] + " ");
			}
			System.out.println();
		}
	}
}