/*						AULA ASSINCRONA 31/08 - LP1I3

	KAUÊ DE JESUS LIVIO CB3005461 E PEDRO PAULO DOS REIS FARIA CB3007278
	
*/

import java.util.Scanner;

public class AmostraTemperatura{
	private int numseq = 0;
	private Data data;
	private Hora hora;
	private float valor;
	 
	Scanner ler = new Scanner(System.in);
 
	public AmostraTemperatura(int a, int b, int c, int d, int e, int f, float v){
		this.data = new Data(a, b, c);
		this.hora = new Hora(d, e, f);
		this.valor = v;
	}
	
	public AmostraTemperatura(Data d, Hora h, float v){
		this.data = d;
		this.hora = h;
		this.valor = v;
	}
	
	public void AmostraTemperatura(){
		data.Data();
		hora.Hora();
		
		System.out.println("Digite o valor da temperatura: ");
		valor = ler.nextFloat();
		numseq++;
	}
	
	public void setData(int a, int b, int c){
		data.setDia(a);
		data.setMes(b);
		data.setAno(c);
	}
	
	public void setData(){
		data.Data();
	}
	
	public String getData(){
		return data.mostra1();
	}
	
	public void setHora(int d, int e, int f){
		hora.setHor(d);
		hora.setMin(e);
		hora.setSeg(f);
	}
	
	public void setHora(){
		hora.Hora();
	}
	
	public String getHora(){
		return hora.getHora1();
	}
	
	public void setValor(float v){
		this.valor = v;
	}
	
	public void setValor(){
		System.out.println("Digite o valor da temperatura: ");
		valor = ler.nextFloat();
		numseq++;
	}
	
	public float getValor(){
		return valor;
	}
	
	public int getNumSeq(){
		return numseq;
	}
	
	
	
	
 


 
}