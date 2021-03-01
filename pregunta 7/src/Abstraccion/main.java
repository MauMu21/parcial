package Abstraccion;

import javax.swing.JOptionPane;

public class main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int op;
		do
		{
			op=Integer.parseInt(JOptionPane.showInputDialog(null,"CALCULAR EL PERIMETRO DE LAS FIGURAS GEOMETRICAS"
			   
			+"Seleccione una opcion: \n"
			+" 1. Triangulo\n"
			+" 2. Cuadrado\n"
			+" 3. Circulo\n"
			+" 4. Salir" ));
			
			switch (op)
			{
			case 1:
				Triangulo Nia = new Triangulo();
				Nia.PerimetroF();
				System.out.println("");
				
			break;
			
			case 2:
				Cuadrado Nial = new Cuadrado();
				Nial.PerimetroF();
				System.out.println("");
		 		
			break;
			
			case 3:
				Circulo Nia2 = new Circulo();
				Nia2.PerimetroF();
				System.out.println("");
			break;
			case 4:
				JOptionPane.showMessageDialog(null,"Elija una opcion valida");
				System.out.println("");
			}
			
		}while (op!=4);

	}

}
