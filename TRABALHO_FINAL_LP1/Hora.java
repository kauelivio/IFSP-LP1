/*						AULA ASSINCRONA 31/08 - LP1I3

	KAUÊ DE JESUS LIVIO CB3005461 E PEDRO PAULO DOS REIS FARIA CB3007278
	
*/

import java.util.Scanner;

public class Hora{
 private int hora;
 private int min;
 private int seg;

 Scanner ler = new Scanner(System.in);

  public Hora(int h, int m, int s){
    this.hora = h;
    this.min = m;
    this.seg = s;
  }

  public void Hora(){
    System.out.println("Digite a hora: ");
    hora = ler.nextInt();

    while(hora < 0 || hora > 23){
      System.out.println("Digite uma hora valida!!");
      hora = ler.nextInt();
    }

    System.out.println("Digite o minuto: ");
    min = ler.nextInt();

    while(min < 0 || min > 59){
      System.out.println("Digite os minutos valido!!");
      min = ler.nextInt();
    }

    System.out.println("Digite o segundo: ");
    seg = ler.nextInt();

    while(seg < 0 || seg > 59){
      System.out.println("Digite os segundos valido!!");
      seg = ler.nextInt();
    }
  }

  public void setHor(int h){
    this.hora = h;
  }

  public int getHor(){
    return hora;
  }

  public void setMin(int m){
    this.min = m;
  }

  public int getMin(){
    return min;
  }

  public void setSeg(int s){
    this.seg = s;
  }

  public int getSeg(){
    return seg;
  }

  public void setHor(){
    System.out.println("Digite a hora: ");
    hora = ler.nextInt();

    while(hora < 0 || hora > 23){
      System.out.println("Digite uma hora valida!!");
      hora = ler.nextInt();
    }
  }

  public void setMin(){
    System.out.println("Digite o minuto: ");
    min = ler.nextInt();

    while(min < 0 || min > 59){
      System.out.println("Digite os minutos valido!!");
      min = ler.nextInt();
    }
  }

  public void setSeg(){
    System.out.println("Digite o segundo: ");
    seg = ler.nextInt();

    while(seg < 0 || seg > 59){
      System.out.println("Digite os segundos valido!!");
      seg = ler.nextInt();
    }
  }

  public String getHora1(){
    return hora + ":" + min + ":" + seg;
  }

  public String getHora2(){
    
    if(hora > 11){
		if(hora == 12){
			return hora + ":" + min + ":" + seg + " PM";
		} else {
			return (hora - 12) + ":" + min + ":" + seg + " PM";
		} 
    } else {
		if(hora == 0){
			return (hora + 12) + ":" + min + ":" + seg + " AM";
		} else {
			return hora + ":" + min + ":" + seg + " AM";
		}
    }
  }

  public int getSegundos(){

    return (hora * 3600) + (min * 60) + seg;

  }
}