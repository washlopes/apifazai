package br.com.bb.dicre.gesem.apifazai.service;

import java.util.List;

import br.com.bb.dicre.gesem.apifazai.dto.EsflDto;
import br.com.bb.dicre.gesem.apifazai.modelo.Esfl;

public interface IEsflService {

	public List <Esfl> obterTodos();
	
	public Esfl obterPeloId(Long id);
	
	public Esfl obterPeloMci(Integer mci);
	
	public Esfl salvar(EsflDto dto);
	
	public Esfl atualizar(EsflDto dto);
	
	public void excluir(Long id);
	
}
