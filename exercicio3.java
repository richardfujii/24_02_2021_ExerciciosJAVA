package exercicio3;

import java.util.Scanner;

public class exercicio3 {
	
	public static void main(String args[])
	{	
		int totalsegundos, horas, minutos, segundos;
		Scanner ler = new Scanner(System.in);
		System.out.println("Digite o tempo de duração desse processo em segundos: ");
		totalsegundos = ler.nextInt();
		
		horas = totalsegundos/3600;
		minutos = (totalsegundos%3600)/60;
		segundos = (totalsegundos%3600)%60;
		
		System.out.printf("O processo dura %d horas, %d minutos e %d segundos.",horas,minutos,segundos);
	}

}
