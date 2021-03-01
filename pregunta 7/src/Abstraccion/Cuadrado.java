package Abstraccion;

import javax.swing.JOptionPane;

public class Cuadrado extends FigurasGeometricas {
	@Override
	public void PerimetroF()
	{
		System.out.println("Area del Cuadrado");
		
		lado = Double.parseDouble(JOptionPane.showInputDialog("Ingrese el Lado del Cuadrado"));
		
		Perimetro = 4*lado;
		
		System.out.println("Lado" + lado);
		System.out.println("Formula : 4 * Lado");
		
		System.out.println("El area del Cuadrado es:" + Perimetro);
	}

}
