package br.com.Model;



import java.util.Collection;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;
/**
 * @author Christian Rodrigues - 3629
 */

@Entity
@Table(name = "requisicao")

public class Requisicao{	
	
	 @Id
	 @GeneratedValue(strategy=GenerationType.IDENTITY)
	 
	 @Column(name="Id_requisicao")	 
	 private int Id_requisicao;
	 @Column
	 private String observacao_requisicao;	 
	 @Column	 
	 private String data_necessidade_requisicao;	 
	 @Column
	 private String id_funcionario_requisicao;
	 
	 @OneToMany(mappedBy="requisicao")  // uma requisição para muitas cotações dos produtos 
	 private Collection<Cotacao>lista_cotacoes;  //cotações da requisicao. 
	@OneToMany(cascade = CascadeType.ALL,mappedBy="requisicoes_prod") // uma uma requisição para muitos produtos
	 private Collection<Produto>lista_produtos; // produtos da requisicao. 
	 
	 //private Cotacao cotacoes;
	
	
	
	public int getId_requisicao() {
		return Id_requisicao;
	}
	public void setId_requisicao(int id_requisicao) {
		Id_requisicao = id_requisicao;
	}
	public String getObservacao_requisicao() {
		return observacao_requisicao;
	}
	public void setObservacao_requisicao(String observacao_requisicao) {
		this.observacao_requisicao = observacao_requisicao;
	}
	
	public String getId_funcionario_requisicao() {
		return id_funcionario_requisicao;
	}
	public void setId_funcionario_requisicao(String id_funcionario_requisicao) {
		this.id_funcionario_requisicao = id_funcionario_requisicao;
	}

	public String getData_necessidade_requisicao() {
		return data_necessidade_requisicao;
	}
	public void setData_necessidade_requisicao(String i) {
		this.data_necessidade_requisicao = i;
	}
	public Collection<Cotacao> getLista_cotacoes() {
		return lista_cotacoes;
	}
	public void setLista_cotacoes(Collection<Cotacao> lista_cotacoes) {
		this.lista_cotacoes = lista_cotacoes;
	}	
	
	public Collection<Produto> getProdutos() {
		return lista_produtos;
	}
	public void setProdutos(Collection<Produto> produtos) {
		this.lista_produtos = produtos;
	}	
	
	
}

