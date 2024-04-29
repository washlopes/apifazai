package br.com.bb.dicre.gesem.apifazai.service;

import java.util.List;

import org.springframework.stereotype.Service;

import br.com.bb.dicre.gesem.apifazai.dto.FluxoDto;
import br.com.bb.dicre.gesem.apifazai.modelo.Fluxo;


public interface IFluxoService {
	
	List <Fluxo> findAll();
	
	Fluxo findById(String numeroProcesso);
	
	Fluxo findByMci(Long mci);
	
	Fluxo criar(FluxoDto dto);
	
	Fluxo atualizar(FluxoDto dto);

}