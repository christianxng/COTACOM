package br.com.Model;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;


/**
 * @author Christian Rodrigues - 3629
 */


@Entity
@Table(name = "pessoa")

public class Pessoa {
	
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
    private int Id_pessoa;
	@Column
	private String nome_funcionario;
	@Column
	private String CPF;
	@Column
    private String RG;
	@Column
    private String email;
	@Column
    private String endereco;
	@Column
    private String telefone;
	@Column
	private String login;
	@Column
	private String senha;
	
	
	public int getId() {
		return Id_pessoa;
	}
	public void setId(int id) {
		Id_pessoa = id;
	}
	public String getLogin() {
		return login;
	}
	public void setLogin(String login) {
		this.login = login;
	}
	@Column
	private int nivel_acesso;
	@Column
	private int setor;
    
    public String getNome_funcionario() {
		return nome_funcionario;
	}
	public void setNome_funcionario(String nome_funcionario) {
		this.nome_funcionario = nome_funcionario;
	}
	public String getCPF() {
		return CPF;
	}
	public void setCPF(String cPF) {
		CPF = cPF;
	}
	public String getRG() {
		return RG;
	}
	public void setRG(String rG) {
		RG = rG;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public String getEndereco() {
		return endereco;
	}
	public void setEndereco(String endereco) {
		this.endereco = endereco;
	}
	public String getTelefone() {
		return telefone;
	}
	public void setTelefone(String telefone) {
		this.telefone = telefone;
	}

	public String getSenha() {
		return senha;
	}
	public void setSenha(String senha) {
		this.senha = senha;
	}
	public int getNivel_acesso() {
		return nivel_acesso;
	}
	public void setNivel_acesso(int nivel_acesso) {
		this.nivel_acesso = nivel_acesso;
	}
	public int getSetor() {
		return setor;
	}
	public void setSetor(int setor) {
		this.setor = setor;
	}
	

}
