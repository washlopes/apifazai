package br.com.bb.dicre.gesem.apifazai.service;

import java.util.List;

import br.com.bb.dicre.gesem.apifazai.dto.SolicitacaoExcecaoDto;
import br.com.bb.dicre.gesem.apifazai.modelo.SolicitacaoExcecao;

public interface ISolicitacaoExcecaoService {
	
	List <SolicitacaoExcecao> obterTodos();
	
	SolicitacaoExcecao obterPeloNumero(String numero);
	
	SolicitacaoExcecao obterPeloMci(Long mci);
	
	SolicitacaoExcecao salvar(SolicitacaoExcecaoDto dto);
	
	SolicitacaoExcecao atualizar(SolicitacaoExcecaoDto dto, String numero);
	
	void excluir(String numero);

}
