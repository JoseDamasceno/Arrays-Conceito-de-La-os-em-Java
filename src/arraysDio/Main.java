package arraysDio;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		int[] idade = new int[10];// Array criando por tamanho
		idade[0] = 27;
		idade[1] = 31;
		System.out.print("Enter with your age here:");
		idade[9] = sc.nextInt();
		
		System.out.println("Age 0: "+ idade[0]);
		System.out.println("Age  1: "  + idade[1]);
		System.out.println("Age 2: "  + idade[2]);
		System.out.println("Age  10: "  + idade[9]);
		System.out.println();
		// inicializa o array fornecendo  os elementos 
		
		int[] i =  {28,33,04};
		System.out.println(i[0] + ":" +i[1]+ ":"+ i[2]);
		System.out.println();
		
		
		
		int[] j = new int[] {04,28};
		System.out.println(j[0]);
		System.out.println(j[1]);
		System.out.println();
		
		int[] idades = new int[] {12,35,45,22,9,37,51,61};
		
		for (int k : idades ) {
			System.out.println("idade: " + k);
			System.out.println();
		}
		
		
		for (int a = 0; a < idades.length; a++)  { // para ter acesso ao indice especifico este é a forma
			int k  = idades[a];
			System.out.println("idade: " + k);
			System.out.println();
		}
		
		for (int k: idades) {
			if (k >= 18) {
				System.out.println("Idade "+ k + " é maior que 18 anos.");
			}
			else {
				System.out.println("Menor de 18 anos " +  k);
				System.out.println();
			}
		}
		for (int a = 0; a < idades.length; a++ ) {
			int k  = idades[a];
			if (k >=18 ) {
				System.out.println("Idade "+ k + " é maior que 18 anos.");// para ter acesso ao indice especifico este é a forma
			}
		}
			
		
		sc.close();
	}

}
