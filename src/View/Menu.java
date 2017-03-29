package View;

import java.util.Scanner;

public class Menu {
	
	public Menu(){
		
		
			int op;
		Scanner esc = new Scanner(System.in);
		System.out.println("\n\t\t -  Menu  -  ");
		System.out.println("\t 1- O Socio ");
		System.out.println("\t 2- Indrouzir receita ");
		System.out.print("\t Opção: ");
		op= esc.nextInt();
		
		
		switch (op){
			case 1:
				new CriaSocio ();
				break;
		
	}
	
}
}