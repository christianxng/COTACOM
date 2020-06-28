package br.com.Model;


import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.JoinTable;
import javax.persistence.ManyToOne;
import javax.persistence.Table;


/**
 * @author Christian Rodrigues - 3629
 */

@Entity
@Table(name = "cotacao")
public class Cotacao{	
	
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private int Id_cotacao;
    @Column
    private int id_funcionario_cotacao;  
    @Column
    private String Observacao_cotacao;
    @Column
    private String Data_cotacao;
    @Column
    private String Qtd_cotacao;  
    
    @ManyToOne(cascade = CascadeType.ALL)
    @JoinTable(name ="Cotacoes_requisicao",
 	joinColumns= @JoinColumn(name="Id_cotacao"),
		 inverseJoinColumns = @JoinColumn(name="Id_requisicao"))
    private Requisicao requisicao;
    

	public String getQtd_cotacao() {
		return Qtd_cotacao;
	}
	public void setQtd_cotacao(String qtd_cotacao) {
		Qtd_cotacao = qtd_cotacao;
	}
	public String getData_cotacao() {
		return Data_cotacao;
	}
	public void setData_cotacao(String data_cotacao) {
		Data_cotacao = data_cotacao;
	}
	public int getId_cotacao() {
		return Id_cotacao;
	}
	public void setId_cotacao(int id_cotacao) {
		Id_cotacao = id_cotacao;
	}
	public int getId_funcionario_cotacao() {
		return id_funcionario_cotacao;
	}
	public void setId_funcionario_cotacao(int id_funcionario_cotacao) {
		this.id_funcionario_cotacao = id_funcionario_cotacao;
	}

	public String getObservacao_cotacao() {
		return Observacao_cotacao;
	}
	public void setObservacao_cotacao(String observacao_cotacao) {
		Observacao_cotacao = observacao_cotacao;
	}		

	public Requisicao getRequisicao() {
		return requisicao;
	}
	public void setRequisicao(Requisicao requisicao) {
		this.requisicao = requisicao;
	}  
	
	
	
	
		
		
}
	
	


	
	

