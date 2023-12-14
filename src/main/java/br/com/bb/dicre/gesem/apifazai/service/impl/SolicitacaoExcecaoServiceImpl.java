package br.com.bb.dicre.gesem.apifazai.service.impl;

import java.util.List;
import java.util.Optional;

import org.springframework.stereotype.Service;

import br.com.bb.dicre.gesem.apifazai.dto.SolicitacaoExcecaoDto;
import br.com.bb.dicre.gesem.apifazai.exceptions.NotFoundException;
import br.com.bb.dicre.gesem.apifazai.mapper.SolicitacaoExcecaoMapper;
import br.com.bb.dicre.gesem.apifazai.modelo.SolicitacaoExcecao;
import br.com.bb.dicre.gesem.apifazai.repository.ISolicitacaoExcecaoRepository;
import br.com.bb.dicre.gesem.apifazai.service.ISolicitacaoExcecaoService;

@Service
public class SolicitacaoExcecaoServiceImpl implements ISolicitacaoExcecaoService {
	
	private final ISolicitacaoExcecaoRepository repositorio;
	
	public SolicitacaoExcecaoServiceImpl(ISolicitacaoExcecaoRepository repositorio) {
		
		this.repositorio = repositorio;
		
	}

	@Override
	public List<SolicitacaoExcecao> obterTodos() {
		
		return this.repositorio.findAll();
		
	}

	@Override
	public SolicitacaoExcecao obterPeloNumero(String numero) {
		
		return getPeloNumero(numero);
		
	}
	
	@Override
	public SolicitacaoExcecao obterPeloMci(Long mci) {
		return getPeloMci(mci);
	}

	@Override
	public SolicitacaoExcecao salvar(SolicitacaoExcecaoDto dto) {
		
		return this.repositorio.save(SolicitacaoExcecaoMapper.fromDtoToEntity(dto));
		
	}

	@Override
	public SolicitacaoExcecao atualizar(SolicitacaoExcecaoDto dto, String numero) { 
		
		SolicitacaoExcecao solicitacao = getPeloNumero(numero);
		
		solicitacao = SolicitacaoExcecaoMapper.fromDtoToEntity(dto);
		
		return this.repositorio.save(solicitacao);
		
	}

	@Override
	public void excluir(String numero) {
		
		this.repositorio.deleteById(getPeloNumero(numero).getNumeroProcesso());

	}
	
	private SolicitacaoExcecao getPeloNumero(String numero) {
		
		Optional <SolicitacaoExcecao> solicitacao = this.repositorio.findById(numero);
		
		if (solicitacao.isEmpty() ) {
			throw new NotFoundException("Solicitação não encontrada!");
		}
		
		return solicitacao.get();
		
	}
	
	private SolicitacaoExcecao getPeloMci(Long mci) {
		
			Optional <SolicitacaoExcecao> solicitacao = this.repositorio.findByMci(mci);
			
			if (solicitacao.isEmpty() ) {
				throw new NotFoundException("Solicitação não encontrada!");
			}
			
			return solicitacao.get();
			
	}


}
