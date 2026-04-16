package clientes;

import java.util.ArrayList;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		ArrayList<Cliente> lista = new ArrayList<>();
		
		System.out.println("Nome: ");
		String nome = sc.nextLine();
		
		System.out.println("Telefone: ");
		String telefone = sc.nextLine();
		
		Cliente c = new Cliente(nome, telefone);
		lista.add(c);
		
		System.out.println("Cliente cadastrado!");
		

	}

}
