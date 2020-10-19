/*						AULA ASSINCRONA 31/08 - LP1I3

	KAUÊ DE JESUS LIVIO CB3005461 E PEDRO PAULO DOS REIS FARIA CB3007278
	
*/

import java.util.Scanner;

class Ex02 {
	public static void main(String[] args) {
		
		Data minhaDatinha = new Data(0, 0, 0);
		
		minhaDatinha.Data();
		
		System.out.println(minhaDatinha.mostra1());
		
		minhaDatinha.entraDia();
		minhaDatinha.entraMes();
		minhaDatinha.entraAno();
		
		System.out.println("Dia: " + minhaDatinha.retDia());
		System.out.println("Mes: " + minhaDatinha.retMes());
		System.out.println("Ano: " + minhaDatinha.retAno());
		System.out.println(minhaDatinha.mostra1());
		System.out.println(minhaDatinha.mostra2());
		System.out.println("O ano e bissexto: " + minhaDatinha.bissexto());
		System.out.println("Dias transcorridos no ano: " + minhaDatinha.diasTranscorridos());
		minhaDatinha.apresentaDataAtual();
	}
}