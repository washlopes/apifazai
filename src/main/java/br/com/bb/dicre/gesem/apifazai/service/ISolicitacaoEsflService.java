package br.com.bb.dicre.gesem.apifazai.service;

import java.util.List;

import br.com.bb.dicre.gesem.apifazai.dto.SolicitacaoEsflDto;
import br.com.bb.dicre.gesem.apifazai.modelo.SolicitacaoEsfl;

public interface ISolicitacaoEsflService {
	
	List <SolicitacaoEsfl> obterTodos();
	
	SolicitacaoEsfl obterPeloId(Long id);
	
	List <SolicitacaoEsfl> obterPeloMci(Integer mci);
	
	SolicitacaoEsfl salver(SolicitacaoEsflDto dto);
	
	SolicitacaoEsfl atualizar(SolicitacaoEsflDto dto, Long id);
	
	void excluir(Long id);

}
