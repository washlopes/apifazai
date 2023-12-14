package br.com.bb.dicre.gesem.apifazai.service;

import java.util.List;

import br.com.bb.dicre.gesem.apifazai.dto.ReperfilamentoDto;
import br.com.bb.dicre.gesem.apifazai.modelo.Reperfilamento;

public interface IReperfilamentoService {
	
	public List <Reperfilamento> obterTodos();
	
	public Reperfilamento obterPeloNumero(String numero);
	
	public Reperfilamento salvar(ReperfilamentoDto dto);
	
	public Reperfilamento atualizar(ReperfilamentoDto dto, String numero);
	
	public void excluir(String numero);

}
