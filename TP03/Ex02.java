/*						AULA ASSINCRONA 31/08 - LP1I3

	KAUÊ DE JESUS LIVIO CB3005461 E PEDRO PAULO DOS REIS FARIA CB3007278
	
*/

import java.util.Scanner;

class Ex02 {
	public static void main(String[] args) {
		
		Hora minhaHorinha = new Hora(0, 0, 0);
		
		minhaHorinha.Hora();
		
		System.out.println(minhaHorinha.getHora1());
		
		minhaHorinha.setHor();
		minhaHorinha.setMin();
		minhaHorinha.setSeg();
		
		System.out.println("Hora: " + minhaHorinha.getHor());
		System.out.println("Minuto: " + minhaHorinha.getMin());
		System.out.println("Segundo: " + minhaHorinha.getSeg());
		System.out.println(minhaHorinha.getHora1());
		System.out.println(minhaHorinha.getHora2());
		System.out.println("Total de segundos: " + minhaHorinha.getSegundos());
		
	}
}