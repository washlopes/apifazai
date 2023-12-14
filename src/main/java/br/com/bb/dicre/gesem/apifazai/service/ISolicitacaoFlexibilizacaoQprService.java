package br.com.bb.dicre.gesem.apifazai.service;

import java.util.List;

import br.com.bb.dicre.gesem.apifazai.dto.SolicitacaoFlexibilizacaoQprDto;
import br.com.bb.dicre.gesem.apifazai.modelo.SolicitacaoFlexibilizacaoQpr;

public interface ISolicitacaoFlexibilizacaoQprService {
	
	List <SolicitacaoFlexibilizacaoQpr> findAll();	
	
	SolicitacaoFlexibilizacaoQpr findById(String numero);
	
	SolicitacaoFlexibilizacaoQpr findByMciCedente(String mci);
	
	SolicitacaoFlexibilizacaoQpr findByCpfSacado(String cpfSacado);
	
	SolicitacaoFlexibilizacaoQpr findByCnpjSacado(String cnpjSacado);
	
	SolicitacaoFlexibilizacaoQpr criar(SolicitacaoFlexibilizacaoQprDto dto);
	
	SolicitacaoFlexibilizacaoQpr atualizar(SolicitacaoFlexibilizacaoQprDto dto, String numero);
	
	void excluir(String numero);

}
