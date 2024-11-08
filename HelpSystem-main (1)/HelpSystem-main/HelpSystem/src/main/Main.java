package main;

import backend.mysqlConnection;
import frontend.CriarConta;

public class Main {
	
	public static void main(String[] args) {
		
		mysqlConnection.getConnection();
		
		
		CriarConta criarConta = new CriarConta();
		
		
		criarConta.window();
		
		
	}

}

