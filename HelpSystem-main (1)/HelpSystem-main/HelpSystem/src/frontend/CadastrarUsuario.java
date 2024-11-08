package frontend;

public class CadastrarUsuario {
	
	String[] dadosUsuario = new String[3];
	
	public void cadastro(String nome, String email, String senha) {
		
		
		dadosUsuario[0] = nome;
		dadosUsuario[1] = email;
		dadosUsuario[2] = senha;
		
		
		ListaUsuarios.usuarios.add(dadosUsuario);
		
		
		for(int i=0;i<dadosUsuario.length;i++) {
			
			System.out.println(ListaUsuarios.usuarios.get(ListaUsuarios.usuarios.size()-1)[i]);
			
		}
		
	}

}
