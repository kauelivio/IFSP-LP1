/*						AULA ASSINCRONA 31/08 - LP1I3

	KAUÊ DE JESUS LIVIO CB3005461 E PEDRO PAULO DOS REIS FARIA CB3007278
	
*/

import java.util.Scanner;

class TP02Ex03 {
	public static void main(String[] args) {
		
		double[] valores;
		int iValores = 0, controle1 = 0;
		double maior = 0, menor = 0, soma = 0, media = 0, pcPos = 0, pcNeg = 0;
		
		Scanner ler = new Scanner(System.in);
		
		System.out.println("Quantos valores deseja informar? (Escolha um numero positivo menor que 20)");
		iValores = ler.nextInt();
		
		while (iValores > 20 || iValores <= 0){
			System.out.println("Escolha um número positivo menor que 20!!");
			iValores = ler.nextInt();
		}
		
		valores = new double[iValores];
		
		
		for(int i = 0; i < iValores; i++){
			
			System.out.print("Digite o " + (i + 1) + " valor: ");
			valores[i] = ler.nextDouble();
			
			if (controle1 == 0){
				maior = valores[i];
				menor = valores[i];
				controle1++;
			} else{
				if (valores[i] > maior){
					maior = valores[i];
				}
				if (valores[i] < menor){
					menor = valores[i];
				}	
			}
			
			if (valores[i] > 0){
				pcPos++;
			}
			
			if (valores[i] < 0){
				pcNeg++;
			}
			
			soma += valores[i];
			
			
		}
		
		media = soma / iValores;
		
		pcPos = (pcPos / iValores) * 100;
		pcNeg = (pcNeg / iValores) * 100;
		
		System.out.println("O maior valor digitado eh " + maior);
		System.out.println("O menor valor digitado eh " + menor);
		System.out.println("A soma dos valores eh " + soma);
		System.out.println("A media dos valores eh " + media);
		System.out.println(pcPos + "% dos valores sao positivos");
		System.out.println(pcNeg + "% dos valores sao negativos");
				
	}
}