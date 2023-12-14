package br.com.bb.dicre.gesem.apifazai.service.impl;

import java.util.List;
import java.util.Optional;

import org.springframework.stereotype.Service;

import br.com.bb.dicre.gesem.apifazai.dto.SolicitacaoGrupoPJ1Dto;
import br.com.bb.dicre.gesem.apifazai.exceptions.NotFoundException;
import br.com.bb.dicre.gesem.apifazai.mapper.SolicitacaoGrupoPJ1Mapper;
import br.com.bb.dicre.gesem.apifazai.modelo.SolicitacaoGrupoPJ1;
import br.com.bb.dicre.gesem.apifazai.repository.ISolicitacaoGrupoPJ1Repository;
import br.com.bb.dicre.gesem.apifazai.service.ISolicitacaoGrupoPJ1Service;

@Service
public class SolicitacaoGrupoPJ1ServiceImpl implements ISolicitacaoGrupoPJ1Service {

	private final ISolicitacaoGrupoPJ1Repository repositorio;
	
	public SolicitacaoGrupoPJ1ServiceImpl(ISolicitacaoGrupoPJ1Repository repositorio) {
		this.repositorio = repositorio;
	}
	
	@Override
	public List <SolicitacaoGrupoPJ1> findAll() {
		
		return repositorio.findAll();
	}

	@Override
	public SolicitacaoGrupoPJ1 findById(Long id) {
				
		return getSolicitacao(id);
	}

	@Override
	public SolicitacaoGrupoPJ1 findByMci(Integer mci) {
		
		return getSolicitacaoPeloMci(mci);		
	}
	
	@Override
	public SolicitacaoGrupoPJ1 findByNumero(String numero) {
		
		return getSolicitacaoPeloNumero(numero);
	}

	@Override
	public SolicitacaoGrupoPJ1 criar(SolicitacaoGrupoPJ1Dto dto) {
		
		SolicitacaoGrupoPJ1 solicit = SolicitacaoGrupoPJ1Mapper.fromDtoToEntity(dto);		
		
		
		/* if (!(repositorio.findByMciAndData(solicit.getMci1(), LocalDateTime.now().minusDays(30L))).isEmpty() ||
				!(repositorio.findByMciAndData(solicit.getMci2(), LocalDateTime.now().minusDays(30L))).isEmpty() ||	
				!(repositorio.findByMciAndData(solicit.getMci3(), LocalDateTime.now().minusDays(30L))).isEmpty() ||
				!(repositorio.findByMciAndData(solicit.getMci4(), LocalDateTime.now().minusDays(30L))).isEmpty() ||
				!(repositorio.findByMciAndData(solicit.getMci5(), LocalDateTime.now().minusDays(30L))).isEmpty() ||
				!(repositorio.findByMciAndData(solicit.getMci6(), LocalDateTime.now().minusDays(30L))).isEmpty() ||
				!(repositorio.findByMciAndData(solicit.getMci7(), LocalDateTime.now().minusDays(30L))).isEmpty() ||
				!(repositorio.findByMciAndData(solicit.getMci8(), LocalDateTime.now().minusDays(30L))).isEmpty() ||
				!(repositorio.findByMciAndData(solicit.getMci9(), LocalDateTime.now().minusDays(30L))).isEmpty() ||
				!(repositorio.findByMciAndData(solicit.getMci10(), LocalDateTime.now().minusDays(30L))).isEmpty())  {			
			
			dto.setStatusAnalise("EM ANÁLISE CURADORIA PJ1");
			solicit =  repositorio.save(SolicitacaoGrupoPJ1Mapper.fromDtoToEntity(dto));			
			
		} else {
			solicit =  repositorio.save(SolicitacaoGrupoPJ1Mapper.fromDtoToEntity(dto));
		} */
		
		solicit =  repositorio.save(SolicitacaoGrupoPJ1Mapper.fromDtoToEntity(dto));
		
		return solicit;
		
	}	
	
	@Override
	public SolicitacaoGrupoPJ1 atualizarPeloNumero(SolicitacaoGrupoPJ1Dto dto, String numero) {		
		
		SolicitacaoGrupoPJ1 solicitacao = getSolicitacaoPeloNumero(numero);	
		
		dto.setNumero(numero);
		dto.setDataSolicitacao(solicitacao.getDataSolicitacao());
		
		return repositorio.save(SolicitacaoGrupoPJ1Mapper.fromDtoToEntity(dto));
		
	}

	@Override
	public void excluir(String numero) {
		
		
		getSolicitacaoPeloNumero(numero);
		
		repositorio.deleteByNumero(numero);
	}

	private SolicitacaoGrupoPJ1 getSolicitacao(Long id) {
		
		Optional <SolicitacaoGrupoPJ1> solicitacao = repositorio.findById(id);
		
		if (solicitacao.isEmpty()) {
			throw new NotFoundException("Solicitacao não encontrada!");
		}
		
		return solicitacao.get();
	}
	
	private SolicitacaoGrupoPJ1 getSolicitacaoPeloMci(Integer mci) {
		
		Optional <SolicitacaoGrupoPJ1> solicitacao = repositorio.findByMci(mci);
		
		if (solicitacao.isEmpty()) {			
			throw new NotFoundException("Solicitacao não encontrada!");
		}
		
		return solicitacao.get();
	}
	
	private SolicitacaoGrupoPJ1 getSolicitacaoPeloNumero(String numero) {	
		
		
		Optional <SolicitacaoGrupoPJ1> solicitacao = repositorio.findByNumero(numero);
		
		if (solicitacao.isEmpty()) {
			throw new NotFoundException("Solicitacao não encontrada!");
		}
		
		return solicitacao.get();
	}
	
}