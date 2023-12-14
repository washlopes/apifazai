package br.com.bb.dicre.gesem.apifazai.service;

import java.util.List;

import br.com.bb.dicre.gesem.apifazai.dto.SolicitacaoGrupoPJ1Dto;
import br.com.bb.dicre.gesem.apifazai.modelo.SolicitacaoGrupoPJ1;

public interface ISolicitacaoGrupoPJ1Service {
	
	List <SolicitacaoGrupoPJ1> findAll();
	
	SolicitacaoGrupoPJ1 findById(Long id);
	
	SolicitacaoGrupoPJ1 findByMci(Integer mci);
	
	SolicitacaoGrupoPJ1 findByNumero(String numero);
	
	SolicitacaoGrupoPJ1 criar(SolicitacaoGrupoPJ1Dto solicitacao);		
	
	SolicitacaoGrupoPJ1 atualizarPeloNumero(SolicitacaoGrupoPJ1Dto solicitacao, String numemro);
	
	void excluir(String numero);	

}

