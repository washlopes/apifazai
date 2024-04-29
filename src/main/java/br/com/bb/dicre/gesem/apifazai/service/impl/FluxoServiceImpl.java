package br.com.bb.dicre.gesem.apifazai.service.impl;

import java.util.List;
import java.util.Optional;

import org.springframework.stereotype.Service;

import br.com.bb.dicre.gesem.apifazai.dto.FluxoDto;
import br.com.bb.dicre.gesem.apifazai.exceptions.NotFoundException;
import br.com.bb.dicre.gesem.apifazai.mapper.FluxoMapper;
import br.com.bb.dicre.gesem.apifazai.modelo.Fluxo;
import br.com.bb.dicre.gesem.apifazai.repository.IFluxoRepository;
import br.com.bb.dicre.gesem.apifazai.service.IFluxoService;

@Service
public class FluxoServiceImpl implements IFluxoService {
	
	private final IFluxoRepository repositorio;
	
	public FluxoServiceImpl(IFluxoRepository repositorio) {
		this.repositorio = repositorio;
	}

	@Override
	public List<Fluxo> findAll() {
		return repositorio.findAll();
	}
	@Override
	public Fluxo findById(String numeroProcesso) {
		return getFluxoPeloId(numeroProcesso);
	}

	@Override
	public Fluxo findByMci(Long mci) { 
		return getFluxoPeloMci(mci);
	}

	@Override
	public Fluxo criar(FluxoDto dto) {	
		
		/* if (!dto.getMatricula().equalsIgnoreCase("F6211986") && !dto.getMatricula().equalsIgnoreCase("F8365803") && 
				!dto.getMatricula().equalsIgnoreCase("F8054909") && !dto.getMatricula().equalsIgnoreCase("F8935676") &&
				!dto.getMatricula().equalsIgnoreCase("F3800577") && !dto.getMatricula().equalsIgnoreCase("F3074519") &&
				!dto.getMatricula().equalsIgnoreCase("F6881699") && !dto.getMatricula().equalsIgnoreCase("F8441891") && 
				!dto.getMatricula().equalsIgnoreCase("F2190410") && !dto.getMatricula().equalsIgnoreCase("F2331600") &&
				!dto.getMatricula().equalsIgnoreCase("F8343594") && !dto.getMatricula().equalsIgnoreCase("F2634898") &&
				!dto.getMatricula().equalsIgnoreCase("F8116403") && !dto.getMatricula().equalsIgnoreCase("F6336980") &&
				!dto.getMatricula().equalsIgnoreCase("F9329258") && !dto.getMatricula().equalsIgnoreCase("F9817649") &&
				!dto.getMatricula().equalsIgnoreCase("F4538629") && !dto.getMatricula().equalsIgnoreCase("F9805839") &&
				!dto.getMatricula().equalsIgnoreCase("F8501604") && !dto.getMatricula().equalsIgnoreCase("F1712941") &&
				!dto.getMatricula().equalsIgnoreCase("F2258976") && !dto.getMatricula().equalsIgnoreCase("F2789450") &&
				!dto.getMatricula().equalsIgnoreCase("F2817345") && !dto.getMatricula().equalsIgnoreCase("F3864379") &&
				!dto.getMatricula().equalsIgnoreCase("F5950973") && !dto.getMatricula().equalsIgnoreCase("F6874937") &&
				!dto.getMatricula().equalsIgnoreCase("F8527877") && !dto.getMatricula().equalsIgnoreCase("F9343092")) {
			throw new BadRequestException("Inclusão não permitida para a matrícula!");
		} */
		
		return repositorio.save(FluxoMapper.fromDtoToEntity(dto));
	}

	@Override
	public Fluxo atualizar(FluxoDto dto) {
		Fluxo fluxo = getFluxoPeloMci(dto.getMci());		
		
		dto.setTempoExecucao(fluxo.getTempoExecucao());				
		
		return repositorio.save(FluxoMapper.fromDtoToEntity(dto));
	}
	
	private Fluxo getFluxoPeloId(String numeroProcesso) {
		Optional <Fluxo> fluxo = repositorio.findById(numeroProcesso);
		
		if (fluxo.isEmpty()) {			
			throw new NotFoundException("Solicitacao não encontrada!");
		}
		
		return fluxo.get();
	}
	
	private Fluxo getFluxoPeloMci(Long mci) {
		Optional <Fluxo> fluxo = repositorio.findByMci(mci);
		
		if (fluxo.isEmpty()) {			
			throw new NotFoundException("Solicitacao não encontrada!");
		}
		
		return fluxo.get();
	}

}
