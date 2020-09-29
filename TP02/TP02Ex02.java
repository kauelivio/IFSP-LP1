/*						AULA ASSINCRONA 31/08 - LP1I3

	KAUÊ DE JESUS LIVIO CB3005461 E PEDRO PAULO DOS REIS FARIA CB3007278
	
*/

import java.util.Scanner;

class TP02Ex02 {
	public static void main(String[] args) {
		
		double[] valores;
		valores = new double[10];
		
		double maior = 0, soma = 0, media = 0;
		
		Scanner ler = new Scanner(System.in);
		
		for(int i = 0; i < 10; i++){
			
			System.out.print("Digite o " + (i + 1) + " valor: ");
			valores[i] = ler.nextDouble();
			
			while (valores[i] <= 0){
				
				System.out.print("Os valores devem ser positivos, digite o " + (i + 1) + " novamente: ");
				valores[i] = ler.nextDouble();
				
			}
			
			if (valores[i] > maior){
				maior = valores[i];
			}
			
			soma += valores[i];
			
			
		}
		
		media = soma / 10;
		
		System.out.println("O maior valor digitado eh " + maior);
		System.out.println("A soma dos valores eh " + soma);
		System.out.println("A media dos valores eh " + media);	
	}
}