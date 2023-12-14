package br.com.bb.dicre.gesem.apifazai.service.impl;

import java.util.List;
import java.util.Objects;
import java.util.Optional;

import org.springframework.stereotype.Service;

import br.com.bb.dicre.gesem.apifazai.dto.SolicitacaoFlexibilizacaoQprDto;
import br.com.bb.dicre.gesem.apifazai.exceptions.BadRequestException;
import br.com.bb.dicre.gesem.apifazai.exceptions.NotFoundException;
import br.com.bb.dicre.gesem.apifazai.mapper.SolicitacaoFlexibilizacaoQprMapper;
import br.com.bb.dicre.gesem.apifazai.modelo.SolicitacaoFlexibilizacaoQpr;
import br.com.bb.dicre.gesem.apifazai.repository.ISolicitacaoFlexibilizacaoQprRepository;
import br.com.bb.dicre.gesem.apifazai.service.ISolicitacaoFlexibilizacaoQprService;

@Service
public class SolicitacaoFlexibilizacaoQprServiceImpl implements ISolicitacaoFlexibilizacaoQprService {
	
	private final ISolicitacaoFlexibilizacaoQprRepository repositorio;
	
	public SolicitacaoFlexibilizacaoQprServiceImpl(ISolicitacaoFlexibilizacaoQprRepository repositorio) {
		this.repositorio = repositorio;
	}

	@Override
	public List<SolicitacaoFlexibilizacaoQpr> findAll() { 
		return repositorio.findAll();
	}

	@Override
	public SolicitacaoFlexibilizacaoQpr findById(String numero) { 
		return getSolicitacaoPeloNumero(numero);
	}

	@Override
	public SolicitacaoFlexibilizacaoQpr findByMciCedente(String mci) {
		return getSolicitacaoPeloMciCedente(mci);
	}

	@Override
	public SolicitacaoFlexibilizacaoQpr findByCpfSacado(String cpfSacado) {
		return getSolicitacaoPeloCpfSacado(cpfSacado);
	}

	@Override
	public SolicitacaoFlexibilizacaoQpr findByCnpjSacado(String cnpjSacado) {
		return getSolicitacaoPeloCnpjSacado(cnpjSacado);
	}

	@Override
	public SolicitacaoFlexibilizacaoQpr criar(SolicitacaoFlexibilizacaoQprDto dto) {
		
		if (!Objects.isNull(dto.getId())) {
			throw new BadRequestException("Para a criação não deve ser fornecido o id.");
		}
		
		return repositorio.save(SolicitacaoFlexibilizacaoQprMapper.fromDtoToEntity(dto));
	}

	@Override
	public SolicitacaoFlexibilizacaoQpr atualizar(SolicitacaoFlexibilizacaoQprDto dto, String numero) {
		
		getSolicitacaoPeloNumero(numero);
		
		dto.setNumero(numero);
		
		return repositorio.save(SolicitacaoFlexibilizacaoQprMapper.fromDtoToEntity(dto));
	}

	@Override
	public void excluir(String numero) {
		
		getSolicitacaoPeloNumero(numero);
		
		repositorio.deleteById(numero);
	}
	
	private SolicitacaoFlexibilizacaoQpr getSolicitacaoPeloNumero(String numero) {	
		
		
		Optional <SolicitacaoFlexibilizacaoQpr> solicitacao = repositorio.findById(numero);
		
		if (solicitacao.isEmpty()) {
			throw new NotFoundException("Solicitacao não encontrada!");
		}
		
		return solicitacao.get();
	}
	
	private SolicitacaoFlexibilizacaoQpr getSolicitacaoPeloMciCedente(String mci) {	
		
		
		Optional <SolicitacaoFlexibilizacaoQpr> solicitacao = repositorio.findByMciCedente(mci);
		
		if (solicitacao.isEmpty()) {
			throw new NotFoundException("Solicitacao não encontrada!");
		}
		
		return solicitacao.get();
	}
	
	private SolicitacaoFlexibilizacaoQpr getSolicitacaoPeloCpfSacado(String cpfSacado) {	
		
		
		Optional <SolicitacaoFlexibilizacaoQpr> solicitacao = repositorio.findByCpfSacado(cpfSacado);
		
		if (solicitacao.isEmpty()) {
			throw new NotFoundException("Solicitacao não encontrada!");
		}
		
		return solicitacao.get();
	}
	
	private SolicitacaoFlexibilizacaoQpr getSolicitacaoPeloCnpjSacado(String cnpjSacado) {	
		
		
		Optional <SolicitacaoFlexibilizacaoQpr> solicitacao = repositorio.findByCnpjSacado(cnpjSacado);
		
		if (solicitacao.isEmpty()) {
			throw new NotFoundException("Solicitacao não encontrada!");
		}
		
		return solicitacao.get();
	}

}
