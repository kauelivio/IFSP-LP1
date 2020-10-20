/*						AULA ASSINCRONA 31/08 - LP1I3

	KAUÊ DE JESUS LIVIO CB3005461 E PEDRO PAULO DOS REIS FARIA CB3007278
	
*/

import java.util.Scanner;

class Ex03 {
	public static void main(String[] args) {
		
		AmostraTemperatura t1 = new AmostraTemperatura(0, 0, 0, 0, 0, 0, 0);
		
		System.out.println("Data t1: " + t1.getData());
		System.out.println("Hora t1: " + t1.getHora());
		System.out.println("Temperatura t1: " + t1.getValor());
		System.out.println("Vezes medidas t1: " + t1.getNumSeq());
		
		AmostraTemperatura t2 = new AmostraTemperatura(0, 0, 0, 0, 0, 0, 0);
		
		t2.AmostraTemperatura();
		
		System.out.println("Data t2: " + t2.getData());
		System.out.println("Hora t2: " + t2.getHora());
		System.out.println("Temperatura t2: " + t2.getValor());
		System.out.println("Vezes medidas t2: " + t2.getNumSeq());
		
		t1.setData();
		t1.setHora();
		t1.setValor();
		
		System.out.println("Data t1: " + t1.getData());
		System.out.println("Hora t1: " + t1.getHora());
		System.out.println("Temperatura t1: " + t1.getValor());
		System.out.println("Vezes medidas t1: " + t1.getNumSeq());
		
	}
}