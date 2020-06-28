package br.com.Model;

import java.util.Collection;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.JoinTable;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.Table;

@Entity
@Table(name = "Encomenda")
public class Encomenda {  // tabela de encomenda para fornecedor
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private int codigo_encomenda;
	@Column
	private String observação_encomenda;
	@Column 
	private int situacao;
	
	@OneToMany(mappedBy="encomenda_produto_fornecedores")
	private Collection<Produto>lista_produtos; 
	
	@ManyToOne
	@JoinTable(name ="Encomendas_forncedor",
 	joinColumns= @JoinColumn(name="codigo_encomenda"),
		 inverseJoinColumns = @JoinColumn(name="Id_Fornecedor"))
	private Fornecedores lista_fornecedores;
	
	public int getCodigo_encomenda() {
		return codigo_encomenda;
	}
	public void setCodigo_encomenda(int codigo_encomenda) {
		this.codigo_encomenda = codigo_encomenda;
	}
	public String getObservação_encomenda() {
		return observação_encomenda;
	}
	public void setObservação_encomenda(String observação_encomenda) {
		this.observação_encomenda = observação_encomenda;
	}
	public int getSituacao() {
		return situacao;
	}
	public void setSituacao(int situacao) {
		this.situacao = situacao;
	}
	public Collection<Produto> getLista_produtos() {
		return lista_produtos;
	}
	public void setLista_produtos(Collection<Produto> lista_produtos) {
		this.lista_produtos = lista_produtos;
	}
	
	
	
	

	
}
