package br.com.Model;


import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.JoinTable;
import javax.persistence.OneToOne;
import javax.persistence.Table;


/**
 * @author Christian Rodrigues - 3629
 */

@Entity
@Table(name = "compra")
public class Compra{	
	
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private int Id_compra;
	@Column
	private int id_funcionario_compra;
	@Column
    private String Observacao_compra;
	
	@OneToOne(cascade = CascadeType.ALL)
	 @JoinTable(name ="Compra_Cotacao",
	 	joinColumns= @JoinColumn(name="Id_compra"),
			 inverseJoinColumns = @JoinColumn(name="Id_cotacao"))	
	private Cotacao cotacao;	
	

	public int getId_funcionario_compra() {
		return id_funcionario_compra;
	}
	public void setId_funcionario_compra(int id_funcionario_compra) {
		this.id_funcionario_compra = id_funcionario_compra;
	}

	public int getId_compra() {
		return Id_compra;
	}
	public void setId_compra(int id_compra) {
		Id_compra = id_compra;
	}
	public String getObservacao_compra() {
		return Observacao_compra;
	}
	public void setObservacao_compra(String observacao_compra) {
		Observacao_compra = observacao_compra;
	}
	

	public Cotacao getCotacao() {
		return cotacao;
	}
	public void setCotacao(Cotacao cotacao) {
		this.cotacao = cotacao;
	}
	
	
    


}
