package br.com.Controller;

import br.com.Model.Pessoa;
import java.util.List;



//import javax.persistence.Query;
import javax.swing.JOptionPane;

public class Login_acesso {	
	
	RepositorioDados repositorio = new RepositorioDados();
	public static boolean acesso;
	public void acesso(String login, String senha){
		
		List<Pessoa> listar_pessoa = repositorio.listar_todas_pessoas();				
		for (Pessoa lista : listar_pessoa) 
		{					
			if(lista.getLogin().equalsIgnoreCase(login) && lista.getSenha().equalsIgnoreCase(senha))
			{
				JOptionPane.showMessageDialog(null,"Usuário e senha corretos");			
				acesso = true;				 
				break;
			}					       					
		    
			else{
				JOptionPane.showMessageDialog(null,"Usuário ou senha incorretos \n Tente Novamente");
				acesso = false;				
			}
		
	
		}

	}
	
	/*public void usuarioAcesso(String login,String senha)
	{
		repositorio.em.getTransaction().begin();
		Query consulta = repositorio.em.createQuery("select login, senha  from Pessoa pessoa where login ='"+login+"'and senha = '"+senha+"'");
		if(consulta.getResultList() != null)
		{
			JOptionPane.showMessageDialog(null,"Usuário e senha corretos");
			
			
			acesso = true;
		}
		else
		{
			JOptionPane.showMessageDialog(null,"Usuário ou senha incorretos");
			acesso = false;
			
		}
		
	}	*/
}



