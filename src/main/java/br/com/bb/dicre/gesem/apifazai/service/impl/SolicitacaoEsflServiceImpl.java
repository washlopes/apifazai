package br.com.bb.dicre.gesem.apifazai.service.impl;

import java.util.Collections;
import java.util.List;
import java.util.Objects;
import java.util.Optional;

import org.springframework.stereotype.Service;

import br.com.bb.dicre.gesem.apifazai.dto.SolicitacaoEsflDto;
import br.com.bb.dicre.gesem.apifazai.exceptions.BadRequestException;
import br.com.bb.dicre.gesem.apifazai.exceptions.NotFoundException;
import br.com.bb.dicre.gesem.apifazai.mapper.SolicitacaoEsflMapper;
import br.com.bb.dicre.gesem.apifazai.modelo.SolicitacaoEsfl;
import br.com.bb.dicre.gesem.apifazai.repository.ISolicitacaoEsflRepository;
import br.com.bb.dicre.gesem.apifazai.service.ISolicitacaoEsflService;


@Service
public class SolicitacaoEsflServiceImpl implements ISolicitacaoEsflService {
	
	private ISolicitacaoEsflRepository repositorio;
	
	public SolicitacaoEsflServiceImpl(ISolicitacaoEsflRepository repositorio) {
		this.repositorio = repositorio;
	}

	@Override
	public List<SolicitacaoEsfl> obterTodos() {
		
		List <SolicitacaoEsfl> solicitacoes = this.repositorio.findAll(); 
		
		return solicitacoes.isEmpty() ? Collections.emptyList() : solicitacoes;
	}

	@Override
	public SolicitacaoEsfl obterPeloId(Long id) {
		return getById(id);
	}

	@Override
	public List <SolicitacaoEsfl> obterPeloMci(Integer mci) {
 
		return getByMci(mci);
	}

	@Override
	public SolicitacaoEsfl salver(SolicitacaoEsflDto dto) { 
		
		if (Objects.nonNull(dto.getId())) {
			throw new BadRequestException("O ID não deve ser informado no cadastramento de novas solicitações!");
		}
		
		return this.repositorio.save(SolicitacaoEsflMapper.fromDtoToEntity(dto));
	}

	@Override
	public SolicitacaoEsfl atualizar(SolicitacaoEsflDto dto, Long id) {
		
		if (Objects.nonNull(getById(id))) {
			return this.repositorio.save(SolicitacaoEsflMapper.fromDtoToEntity(dto));
		}		
		
		return null;
	}

	@Override
	public void excluir(Long id) {		
		
		if (Objects.nonNull(getById(id))) {
			this.repositorio.deleteById(id);
		}

	}
	
	public SolicitacaoEsfl getById(Long id) {
		Optional <SolicitacaoEsfl> solicitacao = this.repositorio.findById(id);
		
		if (solicitacao.isEmpty()) {
			throw new NotFoundException("Solicitacao não encontrada!");
		}
		
		return solicitacao.get();
	}
	
	public List <SolicitacaoEsfl> getByMci(Integer mci) {
		List <SolicitacaoEsfl> solicitacoes = this.repositorio.findByMci(mci);
		
		if (solicitacoes.isEmpty()) {
			throw new NotFoundException("Solicitacao não encontrada!");
		}
		
		return solicitacoes;
	}

}
