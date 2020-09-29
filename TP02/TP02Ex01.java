/*						AULA ASSINCRONA 31/08 - LP1I3

	KAUÊ DE JESUS LIVIO CB3005461 E PEDRO PAULO DOS REIS FARIA CB3007278
	
*/

import java.util.Scanner;

class TP02Ex01 {
	public static void main(String[] args) {
		
		double valor1, valor2;
		
		Scanner ler = new Scanner(System.in);
		
		System.out.print("Digite o valor 1: ");
		valor1 = ler.nextDouble();
		System.out.print("Digite o valor 2: ");
		valor2 = ler.nextDouble();
		
		while (valor2 < valor1){
			
			if ( 1 == 1)
			{
				System.out.println("teste");
			}
			
			System.out.print("O valor 2 deve ser maior que o valor 1, digite o 2 novamente: ");
			valor2 = ler.nextDouble();
			
		}
		
		System.out.println("Obrigado!!");	
	}
}