package br.com.bb.dicre.gesem.apifazai.service.impl;

import java.util.List;
import java.util.Objects;
import java.util.Optional;

import org.springframework.stereotype.Service;

import br.com.bb.dicre.gesem.apifazai.dto.ReperfilamentoDto;
import br.com.bb.dicre.gesem.apifazai.exceptions.BadRequestException;
import br.com.bb.dicre.gesem.apifazai.exceptions.NotFoundException;
import br.com.bb.dicre.gesem.apifazai.mapper.ReperfilamentoMapper;
import br.com.bb.dicre.gesem.apifazai.modelo.Reperfilamento;
import br.com.bb.dicre.gesem.apifazai.repository.IReperfilamentoRepository;
import br.com.bb.dicre.gesem.apifazai.service.IReperfilamentoService;

@Service
public class ReperfilamentoServiceImpl implements IReperfilamentoService {
	
	private IReperfilamentoRepository repositorio;
	
	public ReperfilamentoServiceImpl(IReperfilamentoRepository repositorio) {
		this.repositorio = repositorio;
	}

	@Override
	public List<Reperfilamento> obterTodos() {
		// TODO Auto-generated method stub
		return repositorio.findAll();
	}

	@Override
	public Reperfilamento obterPeloNumero(String numero) {
		// TODO Auto-generated method stub
		return obterReperfilamentoPeloNumero(numero);
	}

	@Override
	public Reperfilamento salvar(ReperfilamentoDto dto) {
		// TODO Auto-generated method stub
		
		/* if (!Objects.isNull(dto.getNumero())) {
			throw new BadRequestException("Para a criação não deve ser fornecido o numero.");
		} */
		
		return repositorio.save(ReperfilamentoMapper.fromDtoToEntity(dto));
	}

	@Override
	public Reperfilamento atualizar(ReperfilamentoDto dto, String numero) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public void excluir(String numero) {
		// TODO Auto-generated method stub

	}
	
	private Reperfilamento obterReperfilamentoPeloNumero(String numero) {
		
		Optional <Reperfilamento> reperfilamento = repositorio.findById(numero);
		
		if (reperfilamento.isEmpty()) {
			throw new NotFoundException("Reperfilamento não encontrado!");
		}
		
		
		return reperfilamento.get();
		
	}

}
