package br.com.Controller;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;
import javax.persistence.Query;

import br.com.Model.Compra;
import br.com.Model.Cotacao;
import br.com.Model.Pessoa;
import br.com.Model.Requisicao;

import java.util.List;


public class RepositorioDados {
	
	EntityManagerFactory emf; // Gerencia Entidade - Abre conexão com o banco
	EntityManager em; // Gerencia Operações com o banco (CRUD) 
	
	
	public RepositorioDados() 
	{
		emf = Persistence.createEntityManagerFactory("dados"); // unidade de persitência arquivo XML
		em = emf.createEntityManager();
	}
	
	//---------------------- REQUISICAO--------------------------------
	
	
	public void salvar_requisicao(Requisicao requisicao){
		em.getTransaction().begin(); // Inicia transação com o banco
		em.merge(requisicao); // edita o objeto
		em.getTransaction().commit(); // salva no banco. 
		emf.close(); // encerra a transação. 
	}
	
	public void remover_requisicao(Requisicao requisicao){
		em.getTransaction().begin();
		em.remove(requisicao);
		em.getTransaction().commit();
		emf.close();	
		
	}
	
	public List<Requisicao> listar_todas_requisicoes(){
		
		em.getTransaction().begin();
		Query consulta = em.createQuery("select requisicao from Requisicao requisicao");
		@SuppressWarnings("unchecked")
		List<Requisicao> requisicoes = consulta.getResultList();
		em.getTransaction().commit();
		emf.close();
		return requisicoes;
	}
	
	
	public Requisicao pesquisar_requisicao_por_id(int id){
		em.getTransaction().begin();
		Requisicao requisicao = em.find(Requisicao.class, id);
		em.getTransaction().commit();
		emf.close();
		return requisicao;
		
		
	}
	
	//---------------------- COTACÃO--------------------------------
	
	
	
	
	public void salvar_cotacao(Cotacao cotacao){
		em.getTransaction().begin();
		em.merge(cotacao);
		em.getTransaction().commit();
		emf.close();
	}
	
	public void remover_cotacao(Cotacao cotacao){
		em.getTransaction().begin();
		em.remove(cotacao);
		em.getTransaction().commit();
		emf.close();
		
		
	}
	
	public List<Cotacao> listar_todas_cotacoes(){
		
		em.getTransaction().begin();
		Query consulta = em.createQuery("select cotacao from Cotacao cotacao");
		@SuppressWarnings("unchecked")
		List<Cotacao> cotacoes = consulta.getResultList();
		em.getTransaction().commit();
		emf.close();
		return cotacoes;
	}
	
	public Cotacao pesquisar_cotacao_por_id(int id){
		em.getTransaction().begin();
		Cotacao cotacao = em.find(Cotacao.class, id);
		em.getTransaction().commit();
		emf.close();
		return cotacao;
		
		
	}
	
	//---------------------- COMPRA--------------------------------
	
	
	
	
		public void salvar_compra(Compra compra){
			em.getTransaction().begin();
			em.merge(compra);
			em.getTransaction().commit();
			emf.close();
		}
		
		public void remover_compra(Compra compra){
			em.getTransaction().begin();
			em.remove(compra);
			em.getTransaction().commit();
			emf.close();
			
			
		}
		
		public List<Compra> listar_todas_compras(){
			
			em.getTransaction().begin();
			Query consulta = em.createQuery("select compra from Compra compra");
			@SuppressWarnings("unchecked")
			List<Compra> compras = consulta.getResultList();
			em.getTransaction().commit();
			emf.close();
			return compras;
		}
		
		public Compra pesquisar_compra_por_id(int id){
			em.getTransaction().begin();
			Compra compra = em.find(Compra.class, id);
			em.getTransaction().commit();
			emf.close();
			return compra;
			
			
		}
	
		
		
		//----------------------Pessoa --------------------------------
		
		
		
		
			public void salvar_pessoa(Pessoa pessoa){
				em.getTransaction().begin();
				em.merge(pessoa);
				em.getTransaction().commit();
				emf.close();
			}
			
			public void remover_pessoa(Pessoa pessoa){
				em.getTransaction().begin();
				em.remove(pessoa);
				em.getTransaction().commit();
				emf.close();
				
				
			}
			
			public List<Pessoa> listar_todas_pessoas(){
				
				em.getTransaction().begin();
				Query consulta = em.createQuery("select pessoa from Pessoa pessoa");
				@SuppressWarnings("unchecked")
				List<Pessoa> pessoa = consulta.getResultList();
				em.getTransaction().commit();
				emf.close();
				return pessoa;
			}
			
			public Pessoa pesquisar_pessoa_por_id(int id){
				em.getTransaction().begin();
				Pessoa pessoa = em.find(Pessoa.class, id);
				em.getTransaction().commit();
				emf.close();
				return pessoa;
				
				
			}	
			
			
			
}