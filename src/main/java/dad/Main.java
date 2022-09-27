package dad;

import java.util.Scanner;

import com.google.gson.Gson;
import com.google.gson.GsonBuilder;

public class Main {

	public static void main(String[] args) {

		String nombre, apellidos;
		int edad;
		Persona p;
		
		Scanner in = new Scanner(System.in);
		System.out.println("Dime tu nombre");
		nombre = in.nextLine();
		System.out.println("Dime tu apellido");
		apellidos = in.nextLine();
		System.out.println("Dime tu edad");
		edad = Integer.parseInt(in.nextLine());
		
		p = new Persona(nombre, apellidos, edad);
		
		Gson gson = new GsonBuilder().setPrettyPrinting().create();
		String json = gson.toJson(p);
		System.out.println(json);
		in.close();
		
		
	}
	
}
