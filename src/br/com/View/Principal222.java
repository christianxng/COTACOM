package br.com.View;

import br.com.Controller.*;
import br.com.Model.Cotacao;
import br.com.Model.Requisicao;

import java.util.List;

/**
 * @author Christian Rodrigues - 3629
 */

public class Principal222 {

	public static void main(String[] args) {
		
		RepositorioDados repositorio = new RepositorioDados();
		Requisicao requisicao = new Requisicao();
		Cotacao cotacao = new Cotacao();
		
		cotacao.setObservacao_cotacao("bjbfdbfdbdfs");
		cotacao.setId_funcionario_cotacao(2000);
		requisicao.setObservacao_requisicao("ffdbfdbfdbfda");
		requisicao.setId_funcionario_requisicao("071");
		requisicao.setData_necessidade_requisicao("2019");
		
		repositorio.salvar_requisicao(requisicao);
		repositorio.salvar_cotacao(cotacao);
		
		List<Requisicao> listar_requisicao = repositorio.listar_todas_requisicoes();
		
		for (Requisicao requisicao2 : listar_requisicao) {
			System.out.println(requisicao2.getId_requisicao());
			System.out.println(requisicao2.getId_funcionario_requisicao());
			System.out.println(requisicao2.getData_necessidade_requisicao());
			System.out.println(requisicao2.getObservacao_requisicao());
			
		}
		
List<Cotacao> listar_cotacao = repositorio.listar_todas_cotacoes();
		
		for (Cotacao cotacao2 : listar_cotacao) {
			System.out.println(cotacao2.getId_cotacao());
			System.out.println(cotacao2.getId_funcionario_cotacao());
			System.out.println(cotacao2.getObservacao_cotacao());
			
			
		}

	}

}
