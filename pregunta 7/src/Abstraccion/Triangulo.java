package Abstraccion;
import javax.swing.JOptionPane;

public class Triangulo extends FigurasGeometricas {
	@Override
	public void PerimetroF()
	{
		System.out.println("Area del Triangulo");
		
		Base = Double.parseDouble(JOptionPane.showInputDialog("Ingrese la Base del Triangulo"));
		Altura = Double.parseDouble(JOptionPane.showInputDialog("Ingrese la Altura del Triangulo"));
		
		Perimetro= (lado+lado+lado);
		
		System.out.println("Base" + Base);
		System.out.println("Altura" + Altura);
		System.out.println("Formula :(lado+lado+lado)");
		
		System.out.println("El area del triangulo es :" + Perimetro);
	}
 
	
}
