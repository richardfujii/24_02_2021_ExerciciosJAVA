package exercicio2;

import java.util.Scanner;

public class exercicio2 {

		public static void main(String[] args)
		{	
			int totaldias,anos,meses,dias;
			Scanner entrada = new Scanner(System.in);
			System.out.println("Digite sua idade em dias: ");
			totaldias = entrada.nextInt();
			
			anos = totaldias/365;
			meses = (totaldias%365)/30;
			dias = (totaldias%365)%30;
			
			System.out.printf("Você tem: %d ano(s), %d mes(es) e %d dia(s).\n",anos,meses,dias);
			System.out.println("Você tem: "+anos+" ano(s), "+meses+"mes(es) e "+dias+" dia(s).");
		}
	}


