package exercicio4;

import java.util.Scanner;
import java.lang.Math;


public class exercicio4 {
	public static void main(String args [])
	{
		int a,b,c;
		double d,r,s;
		Scanner entrada = new Scanner(System.in);
		
		System.out.println("Digite o valor de a: ");
		a = entrada.nextInt();
		System.out.println("Digite o valor de b: ");
		b = entrada.nextInt();
		System.out.println("Digite o valor de c: ");
		c = entrada.nextInt();
		
		r = Math.pow(a + b, 2);
		s = Math.pow(b + c, 2);
		d = (r+s)/2;
		
		System.out.println("O valor de D é:"+d);
		
	}

}
