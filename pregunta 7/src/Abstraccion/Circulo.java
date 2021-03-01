package Abstraccion;


import javax.swing.JOptionPane;

public class Circulo extends FigurasGeometricas {

	@Override
	public void PerimetroF()
	{
		System.out.println("Perimetro del Circulo");
		
		radio = Double.parseDouble(JOptionPane.showInputDialog("Ingrese el radio del Circulo"));
		
		Perimetro= Math.PI * (radio* 2);
		
		System.out.println("Radio" +radio);
		System.out.println("Formula: PI * Radio*2");
		
		System.out.println(" El perimetro del Circulo es :" +Perimetro);
	}
}
