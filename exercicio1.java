package exercicio1;

import java.util.Scanner;

public class exercicio1 {
	
	public static void main (String args[])
	{
		Scanner ler = new Scanner(System.in);
		int anos, meses, dias, totaldias;
		System.out.println("Quantos anos voc� viveu: ");
		anos = ler.nextInt();
		System.out.println("Quantos meses voc� viveu: ");
		meses = ler.nextInt();
		System.out.println("Quantos dias voc� viveu: ");
		dias = ler.nextInt();
		
		totaldias = 365*anos + 30*meses + dias;
		System.out.printf("Voc� viveu %d dias.",totaldias);
		
	}
}
