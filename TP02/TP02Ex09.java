/*						AULA ASSINCRONA 31/08 - LP1I3

	KAUÊ DE JESUS LIVIO CB3005461 E PEDRO PAULO DOS REIS FARIA CB3007278
	
*/

import java.util.Scanner;

class TP02Ex09 {
	public static void main(String[] args) {
		
		int[][] matriz;
		int m = 0, n = 0, controle = 1;
		
		Scanner ler = new Scanner(System.in);
		
		System.out.println("Quantas linhas deve ter a matriz? (Escolha no maximo 10)");
		m = ler.nextInt();
		
		while (m > 10 || m < 0){
			System.out.println("Escolha um valor positivo menor que 10!!");
			m = ler.nextInt();
		}
		
		System.out.println("Quantas colunas deve ter a matriz? (Escolha no maximo 10)");
		n = ler.nextInt();
		
		while (n > 10 || n < 0){
			System.out.println("Escolha um valor positivo menor que 10!!");
			n = ler.nextInt();
		}
		
		matriz = new int[m][n];
			
		for (int i = 0; i < m; i++){
			for (int j = 0; j < n; j++){
				System.out.print("Digite o valor " + controle + ": ");
				controle++;
				matriz[i][j] = ler.nextInt();
			}
		}
		
		System.out.println();
				
		for (int i = 0; i < m; i++){
			for (int j = 0; j < n; j++){
				System.out.print(" " + matriz[i][j] + " ");
			}
			System.out.println();
		}
	}
}