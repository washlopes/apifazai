package br.com.bb.dicre.gesem.apifazai.service.impl;

import java.util.List;
import java.util.Optional;

import org.springframework.stereotype.Service;

import br.com.bb.dicre.gesem.apifazai.dto.FaleDto;
import br.com.bb.dicre.gesem.apifazai.exceptions.NotFoundException;
import br.com.bb.dicre.gesem.apifazai.mapper.FaleMapper;
import br.com.bb.dicre.gesem.apifazai.modelo.Fale;
import br.com.bb.dicre.gesem.apifazai.repository.IFaleRepository;
import br.com.bb.dicre.gesem.apifazai.service.IFaleService;

@Service
public class FaleServiceImpl implements IFaleService {
	
	private final IFaleRepository repositorio;
	
	public FaleServiceImpl(IFaleRepository repositorio) {
		this.repositorio = repositorio;
	}

	@Override
	public List<Fale> obterTodos() {
		// TODO Auto-generated method stub
		return repositorio.findAll();
	}

	@Override
	public Fale obterPeloNumero(String numero) {
		// TODO Auto-generated method stub
		return getPeloNumero(numero);
	}

	@Override
	public Fale obterPeloMci(Integer mci) {
		// TODO Auto-generated method stub
		return getPeloMci(mci);
	}

	@Override
	public Fale salvar(FaleDto dto) {
		// TODO Auto-generated method stub
		return this.repositorio.save(FaleMapper.fromDtoToEntity(dto));
	}

	@Override
	public Fale atualizar(FaleDto dto, String numero) {
		// TODO Auto-generated method stub
		return this.repositorio.save(FaleMapper.fromDtoToEntity(dto));
	}

	@Override
	public void excluir(String numero) {
		// TODO Auto-generated method stub
		this.repositorio.deleteById(numero);
	}
	
	private Fale getPeloNumero(String numero) {
		Optional <Fale> fale = this.repositorio.findById(numero);
		
		if (fale.isEmpty()) {
			throw new NotFoundException("Fale não encontrado!");
		}
		
		return fale.get();
	}
	
	private Fale getPeloMci(Integer mci) {
		Optional <Fale> fale = this.repositorio.findByMci(mci);
		
		if (fale.isEmpty()) {
			throw new NotFoundException("Fale não encontrado!");
		}
		
		return fale.get();
	}

}
