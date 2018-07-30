package Questao3;

import java.util.ArrayList;

public class Poligono 
{
	private ArrayList coordenadasX;
	private ArrayList coordenadasY;
	private double area;
	
	public Poligono()
	{
		this.coordenadasX = new ArrayList();
		this.coordenadasY = new ArrayList();
		this.area = 0.0;
	}
	
	public Poligono(ArrayList x, ArrayList y)
	{
		this.coordenadasX = x;
		this.coordenadasY = y;
	}
	
	
	
}
