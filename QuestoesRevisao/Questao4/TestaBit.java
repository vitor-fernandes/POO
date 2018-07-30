package Questao4;

import java.util.Scanner;

public class TestaBit {

	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in);
		
		System.out.print("Tamanho do Array: ");
		int tamanho = Integer.parseInt(scanner.nextLine());
		
		Bit array1 = new Bit(tamanho);	
		Bit array2 = new Bit(tamanho);
		
		array1.setBits();
		array2.setBits();
		
		System.out.println();
		
		System.out.println("Array1: " + array1.toString());
		System.out.println("Array2: " + array2.toString());
		
		System.out.println();
		
		System.out.println(array1.toString());
		System.out.println(array2.toString());
		array1.operacaoAND(array2);
		System.out.println();
		
		System.out.println(array1.toString());
		System.out.println(array2.toString());
		array1.operacaoOR(array2);
		System.out.println();
		
		System.out.println(array1.toString());
		array1.operacaoNOT();
		
		System.out.println();
		
		System.out.println(array1.toString() + " == " + array2.toString()+" ? " + array1.equals(array2));
		
		scanner.close();
	}

}
