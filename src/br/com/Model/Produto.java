package br.com.Model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.JoinColumns;
import javax.persistence.JoinTable;
import javax.persistence.ManyToOne;
import javax.persistence.Table;



@Entity
@Table(name = "produto")

public class Produto {
	
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private int codigo_produto;
	@Column
	private String descricao_produto; 
	@Column
    private int qnt_estoque_produto;
	@Column
    private String categoria_produto;
	@Column
    private String marca_produto;
	@Column
    private int unidade_produto;
	@Column
    private double quantidade_produto;
	
	@ManyToOne
	@JoinTable(name ="Requisicao_Produtos",
 	joinColumns= @JoinColumn(name="codigo_produto"),
		 inverseJoinColumns = @JoinColumn(name="Id_requisicao"))
	private Requisicao requisicoes_prod;
	
	
	@ManyToOne
	@JoinTable(name = "Encomenda_produtos_F",
	joinColumns=@JoinColumn(name="codigo_produto"),
			inverseJoinColumns=@JoinColumn(name="codigo_encomenda"))
	private Encomenda encomenda_produto_fornecedores;
    
    public int getCodigo_produto() {
		return codigo_produto;
	}
	public void setCodigo_produto(int codigo_produto) {
		this.codigo_produto = codigo_produto;
	}
	public String getDescricao_produto() {
		return descricao_produto;
	}
	public void setDescricao_produto(String descricao_produto) {
		this.descricao_produto = descricao_produto;
	}
	public int getQnt_estoque_produto() {
		return qnt_estoque_produto;
	}
	public void setQnt_estoque_produto(int qnt_estoque_produto) {
		this.qnt_estoque_produto = qnt_estoque_produto;
	}
	public String getCategoria_produto() {
		return categoria_produto;
	}
	public void setCategoria_produto(String categoria_produto) {
		this.categoria_produto = categoria_produto;
	}
	public String getMarca_produto() {
		return marca_produto;
	}
	public void setMarca_produto(String marca_produto) {
		this.marca_produto = marca_produto;
	}
	public int getUnidade_produto() {
		return unidade_produto;
	}
	public void setUnidade_produto(int unidade_produto) {
		this.unidade_produto = unidade_produto;
	}
	public double getQuantidade_produto() {
		return quantidade_produto;
	}
	public void setQuantidade_produto(double quantidade_produto) {
		this.quantidade_produto = quantidade_produto;
	}
	public Requisicao getRequisicoes_prod() {
		return requisicoes_prod;
	}
	public void setRequisicoes_prod(Requisicao requisicoes_prod) {
		this.requisicoes_prod = requisicoes_prod;
	}
	

}
