package br.com.bb.dicre.gesem.apifazai.service.impl;

import java.util.List;
import java.util.Optional;

import org.springframework.stereotype.Service;

import br.com.bb.dicre.gesem.apifazai.dto.ExcecaoDto;
import br.com.bb.dicre.gesem.apifazai.exceptions.BadRequestException;
import br.com.bb.dicre.gesem.apifazai.exceptions.NotFoundException;
import br.com.bb.dicre.gesem.apifazai.mapper.ExcecaoMapper;
import br.com.bb.dicre.gesem.apifazai.modelo.Excecao;
import br.com.bb.dicre.gesem.apifazai.repository.IExcecaoRepository;
import br.com.bb.dicre.gesem.apifazai.service.IExcecaoService;

@Service
public class ExcecaoServiceImpl implements IExcecaoService {
	
	private final IExcecaoRepository repositorio;
	
	public ExcecaoServiceImpl(IExcecaoRepository repositorio) {
		this.repositorio = repositorio;
	}

	@Override
	public List<Excecao> findAll() {
		return repositorio.findAll();
	}
	@Override
	public Excecao findById(String numeroProcesso) {
		return getExcecaoPeloId(numeroProcesso);
	}

	@Override
	public Excecao findByMci(Long mci) { 
		return getExcecaoPeloMci(mci);
	}

	@Override
	public Excecao criar(ExcecaoDto dto) {	
		
		if (!dto.getMatricula().equalsIgnoreCase("F6211986") && !dto.getMatricula().equalsIgnoreCase("F8365803") && 
				!dto.getMatricula().equalsIgnoreCase("F8054909") && !dto.getMatricula().equalsIgnoreCase("F8935676") &&
				!dto.getMatricula().equalsIgnoreCase("F3800577") && !dto.getMatricula().equalsIgnoreCase("F3074519") &&
				!dto.getMatricula().equalsIgnoreCase("F6881699") && !dto.getMatricula().equalsIgnoreCase("F8441891") && 
				!dto.getMatricula().equalsIgnoreCase("F2190410")) {
			throw new BadRequestException("Inclusão não permitida para a matrícula!");
		}
		
		return repositorio.save(ExcecaoMapper.fromDtoToEntity(dto));
	}

	@Override
	public Excecao atualizar(ExcecaoDto dto) {
		Excecao excecao = getExcecaoPeloMci(dto.getMci());	
		
		dto.setMatricula(excecao.getMatricula());
		dto.setTempoExecucao(excecao.getTempoExecucao());
		dto.setPrazo(excecao.getPrazo());		
		
		return repositorio.save(ExcecaoMapper.fromDtoToEntity(dto));
	}
	
	private Excecao getExcecaoPeloId(String numeroProcesso) {
		Optional <Excecao> excecao = repositorio.findById(numeroProcesso);
		
		if (excecao.isEmpty()) {			
			throw new NotFoundException("Solicitacao não encontrada!");
		}
		
		return excecao.get();
	}
	
	private Excecao getExcecaoPeloMci(Long mci) {
		Optional <Excecao> excecao = repositorio.findByMci(mci);
		
		if (excecao.isEmpty()) {			
			throw new NotFoundException("Solicitacao não encontrada!");
		}
		
		return excecao.get();
	}

}
