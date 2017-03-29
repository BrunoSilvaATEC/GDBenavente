package View;

import java.util.ArrayList;
import java.util.Scanner;


import Controller.GestaoSocios;
import Model.Socio;

public class CriaSocio {
	
	public CriaSocio(){
		 ArrayList<GestaoSocios> b = null ;
		 GestaoSocios b= new Socio(a);
		Scanner a = new Scanner(System.in);
		
		System.out.println("\t\t Criar Socio ");
		
		System.out.print("\t Nome: ");
		String nome = a.nextLine();
		System.out.print("\t Localidade: ");
		String localidade = a.nextLine();
		System.out.print("\t Contacto: ");
		int contacto = a.nextInt();
		b.add(nome,localidade,contacto);
		
		for (int i=0;i<=1;i++)
		{
		GerirSocio(nome,localidade,contacto);
		}

		
		
	}

	private void GerirSocio(String nome, String localidade, int contacto) {
		// TODO Auto-generated method stub
		
	}

}
