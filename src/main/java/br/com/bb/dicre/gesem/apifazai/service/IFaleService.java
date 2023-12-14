package br.com.bb.dicre.gesem.apifazai.service;

import java.util.List;

import br.com.bb.dicre.gesem.apifazai.dto.FaleDto;
import br.com.bb.dicre.gesem.apifazai.modelo.Fale;

public interface IFaleService {
	
	List <Fale> obterTodos();
	
	Fale obterPeloNumero(String numero);
	
	Fale obterPeloMci(Integer mci);
	
	Fale salvar(FaleDto dto);
	
	Fale atualizar(FaleDto dto, String numero);
	
	void excluir(String numero);
	

}
