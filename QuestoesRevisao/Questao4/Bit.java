package Questao4;

import java.util.Scanner;

public class Bit 
{
	private int[] bits;
	
	public Bit()
	{
		this.bits = new int[0];
	}
	
	public Bit(int tamanho)
	{
		this.bits = new int[tamanho];
	}
	
	public void setBits()
	{
		System.out.println("Digite a sequência de Bits: ");
		
		Scanner scanner = new Scanner(System.in);
		
		for (int i = 0; i < this.bits.length; i++)
		{
			this.bits[i] = Integer.parseInt(scanner.nextLine());
		}

	}
	
	public int getBit(int posBit)
	{
		return this.bits[posBit];
	}
	
	public int[] getBits()
	{
		return this.bits;
	}
	
	public void setBit(int posBit, int bit)
	{
		bits[posBit] = bit;
	}
	
	public String toString()
	{
		String bitsString = "";
		for (int i = 0; i < this.bits.length; i++)
		{
			bitsString += this.bits[i];
		}
		
		return bitsString;
	}
	
	public boolean equals(int[] comparaBits)
	{
		return this.bits == comparaBits;
	}
	
	public void operacaoAND(Bit array)
	{
		String result = "";
		for(int i = 0; i < this.bits.length; i++)
		{
			result += this.bits[i] & array.getBit(i);
		}
		
		System.out.println("Operação AND (&): " + result);
	}
	
	public void operacaoOR(Bit array)
	{
		String result = "";
		for(int i = 0; i < this.bits.length; i++)
		{
			result += this.bits[i] | array.getBit(i);
		}
		
		System.out.println("Operação OR (|): " + result);
	}
	
	public void operacaoNOT()
	{
		String result = "";
		for(int i = 0; i < this.bits.length; i++)
		{
			if(this.bits[i] == 0) result += 1;
			else result += 0;
		}
		
		System.out.println("Operação NOT (~): " + result);
	}
	
	public boolean equals(Bit array)
	{
		for(int i = 0; i < this.bits.length; i++)
		{
			if(this.bits[i] == array.getBit(i)) continue;
			else return false;
		}
		return true;
	}
}
