package br.com.bb.dicre.gesem.apifazai.service;

import java.util.List;

import br.com.bb.dicre.gesem.apifazai.dto.ExcecaoDto;
import br.com.bb.dicre.gesem.apifazai.modelo.Excecao;

public interface IExcecaoService {
	
	List <Excecao> findAll();
	
	Excecao findById(String numeroProcesso);
	
	Excecao findByMci(Long mci);
	
	Excecao criar(ExcecaoDto dto);
	
	Excecao atualizar(ExcecaoDto dto);

}
