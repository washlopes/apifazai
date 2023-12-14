package br.com.bb.dicre.gesem.apifazai.service.impl;

import java.util.List;
import java.util.Optional;

import org.springframework.stereotype.Service;

import br.com.bb.dicre.gesem.apifazai.dto.EsflDto;
import br.com.bb.dicre.gesem.apifazai.exceptions.NotFoundException;
import br.com.bb.dicre.gesem.apifazai.modelo.Esfl;
import br.com.bb.dicre.gesem.apifazai.repository.IEsflRepository;
import br.com.bb.dicre.gesem.apifazai.service.IEsflService;

@Service
public class EsflServiceImpl implements IEsflService {
	
	private IEsflRepository repositorio;
	
	public EsflServiceImpl(IEsflRepository repositorio) {
		this.repositorio = repositorio;
	}

	@Override
	public List<Esfl> obterTodos() {
		// TODO Auto-generated method stub
		return this.repositorio.findAll();
	}

	@Override
	public Esfl obterPeloId(Long id) {
		// TODO Auto-generated method stub
		return getById(id);
	}

	@Override
	public Esfl obterPeloMci(Integer mci) {		 
		return getByMci(mci);
	}

	@Override
	public Esfl salvar(EsflDto dto) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Esfl atualizar(EsflDto dto) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public void excluir(Long id) {
		// TODO Auto-generated method stub
		
	}
	
	private Esfl getById(Long id) {
		Optional <Esfl> esfl = this.repositorio.findById(id);
		
		if (esfl.isEmpty()) {
			throw new NotFoundException("Cálculo não encontrado");
		}
		
		return esfl.get();
	}
	
	private Esfl getByMci(Integer mci) {
		Optional <Esfl> calculo = this.repositorio.findByMci(mci);
		
		if (calculo.isEmpty()) {
			throw new NotFoundException("Cliente não é público alvo da metodologia 8");
		}
		
		return calculo.get();
		
	}

}
