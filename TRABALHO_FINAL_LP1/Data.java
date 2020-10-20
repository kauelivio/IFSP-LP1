/*						AULA ASSINCRONA 31/08 - LP1I3

	KAUÊ DE JESUS LIVIO CB3005461 E PEDRO PAULO DOS REIS FARIA CB3007278
	
*/

import java.util.Scanner;
import java.text.DateFormat;
import java.util.Date;

public class Data{
 private int dia;
 private int mes;
 private int ano;

 Scanner ler = new Scanner(System.in);

  public Data(int d, int m, int a){
    this.dia = d;
    this.mes = m;
    this.ano = a;
  }

  public void Data(){
    System.out.println("Digite o dia: ");
    dia = ler.nextInt();

    while(dia < 1 || dia > 31){
      System.out.println("Digite um dia valido!!");
      dia = ler.nextInt();
    }

    System.out.println("Digite o mes: ");
    mes = ler.nextInt();

    while(mes < 1 || mes > 12){
      System.out.println("Digite um mes valido!!");
      mes = ler.nextInt();
    }

    while((mes == 4 || mes == 6 || mes == 9 || mes == 11) && dia > 30){
      System.out.println("Digite um dia do mes valido!!");
      dia = ler.nextInt();
    }

    while(mes == 2 && dia > 29){
      System.out.println("Digite um dia do mes valido!!");
      dia = ler.nextInt();
    }

    System.out.println("Digite o ano: ");
    ano = ler.nextInt();

    while(ano < 0){
      System.out.println("Digite um ano valido!!");
      ano = ler.nextInt();
    }

    if(ano % 4 != 0){
      while(mes == 2 && dia > 28){
        System.out.println("Digite um dia do mes valido!!");
        dia = ler.nextInt();
      }
    }
  }

  public void setDia(int d){
    this.dia = d;
  }

  public int getDia(){
    return dia;
  }

  public void setMes(int m){
    this.mes = m;
  }

  public int getMes(){
    return mes;
  }

  public void setAno(int a){
    this.ano = a;
  }

  public int getAno(){
    return ano;
  }

  public void setDia(){
    System.out.println("Digite o dia: ");
    dia = ler.nextInt();

    while(dia < 1 || dia > 31){
      System.out.println("Digite um dia valido!!");
      dia = ler.nextInt();
    }
  }

  public void setMes(){
    System.out.println("Digite o mes: ");
    mes = ler.nextInt();

    while(mes < 1 || mes > 12){
      System.out.println("Digite um mes valido!!");
      mes = ler.nextInt();
    }
  }

  public void setAno(){
    System.out.println("Digite o ano: ");
    ano = ler.nextInt();

    while(ano < 0){
      System.out.println("Digite um ano valido!!");
      ano = ler.nextInt();
    }
  }

  public String mostra1(){
    return dia + "/" + mes + "/" + ano;
  }

  public String mostra2(){
    String mesExt = "";
  
    switch (mes) {
      case 1: mesExt = "Janeiro";
	  break;
      case 2: mesExt = "Fevereiro";
	  break;
      case 3: mesExt = "Março";
	  break;
      case 4: mesExt = "Abril";
	  break;
      case 5: mesExt = "Maio";
	  break;
      case 6: mesExt = "Junho";
	  break;
      case 7: mesExt = "Julho";
	  break;
      case 8: mesExt = "Agosto";
	  break;
      case 9: mesExt = "Setembro";
	  break;
      case 10: mesExt = "Outubro";
	  break;
      case 11: mesExt = "Novembro";
	  break;
      case 12: mesExt = "Dezembro";
      break;
      default: break;
    }

    return dia + "/" + mesExt + "/" + ano; 
  }

  public boolean bissexto(){
    if( ano % 4 == 0){
      return true;
    }
    else{
      return false;
    }
  }

  public int diasTranscorridos(){
    int[] qtdDiasDoMes = {31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31};
    int totalDias = 0;

    if(bissexto()){
      qtdDiasDoMes[1] = 29;
    }

    for(int i = 0; i < (mes - 1); i++){
      totalDias += qtdDiasDoMes[i];
    }

    totalDias += dia;

    return totalDias;

  }

  public void apresentaDataAtual(){
    Date hoje = new Date();
    String hojeFormatado = DateFormat.getDateInstance(DateFormat.FULL).format(hoje);
	
	System.out.println(hojeFormatado);
  }
}