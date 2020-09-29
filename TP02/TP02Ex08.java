/*						AULA ASSINCRONA 31/08 - LP1I3

	KAUÊ DE JESUS LIVIO CB3005461 E PEDRO PAULO DOS REIS FARIA CB3007278
	
*/

import java.util.Scanner;

class TP02Ex08 {
	public static void main(String[] args) {
		
		int[][] matriz1 = new int[3][4];
		int[][] matriz2 = new int[3][4];
		int controle = 1, mult = 0;
		
		Scanner ler = new Scanner(System.in);
			
		for (int i = 0; i < 3; i++){
			for (int j = 0; j < 4; j++){
				System.out.print("Digite o valor " + controle + ": ");
				controle++;
				matriz1[i][j] = ler.nextInt();
			}
		}
		
		System.out.print("Por quanto deseja multiplica a matriz? ");
		mult = ler.nextInt();
		
		for (int i = 0; i < 3; i++){
			for (int j = 0; j < 4; j++){
				System.out.print(" " + matriz1[i][j] + " ");
			}
			System.out.println();
		}
		
		System.out.println();
		
		for (int i = 0; i < 3; i++){
			for (int j = 0; j < 4; j++){
				matriz2[i][j] = matriz1[i][j] * mult;
				System.out.print(" " + matriz2[i][j] + " ");
			}
			System.out.println();
		}
	}
}