/*						AULA ASSINCRONA 31/08 - LP1I3

	KAUÊ DE JESUS LIVIO CB3005461 E PEDRO PAULO DOS REIS FARIA CB3007278
	
*/

import java.util.Scanner;

class TP02Ex07 {
	public static void main(String[] args) {
		
		int[][] valores = new int[3][4];
		int controle = 1, mult = 0;
		
		Scanner ler = new Scanner(System.in);
			
		for (int i = 0; i < 3; i++){
			for (int j = 0; j < 4; j++){
				System.out.print("Digite o valor " + controle + ": ");
				controle++;
				valores[i][j] = ler.nextInt();
			}
		}
		
		System.out.print("Por quanto deseja multiplica a matriz? ");
		mult = ler.nextInt();
		
		for (int i = 0; i < 3; i++){
			for (int j = 0; j < 4; j++){
				valores[i][j] = valores[i][j] * mult;
				System.out.print(" " + valores[i][j] + " ");
			}
			System.out.println();
		}
	}
}