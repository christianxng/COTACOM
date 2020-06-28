package br.com.Model;

import java.util.Collection;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.Table;

@Entity
@Table(name = "fornecedor")
public class Fornecedores {
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)

	private int Id_Fornecedor;
	 @Column
	private String contato;
	 @Column
	private String observacao;
	
	
	@OneToMany(mappedBy="lista_fornecedores")
	private Collection<Encomenda>lista_encomendas; 
	
	
	public int getId_Fornecedor() {
		return Id_Fornecedor;
	}
	
	
	public void setId_Fornecedor(int id_Fornecedor) {
		Id_Fornecedor = id_Fornecedor;
	}
	public String getContato() {
		return contato;
	}
	public void setContato(String contato) {
		this.contato = contato;
	}
	public String getObservacao() {
		return observacao;
	}
	public void setObservacao(String observacao) {
		this.observacao = observacao;
	}
}
