package br.com.bb.dicre.gesem.apifazai.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import br.com.bb.dicre.gesem.apifazai.dto.FluxoDto;
import br.com.bb.dicre.gesem.apifazai.modelo.Fluxo;
import br.com.bb.dicre.gesem.apifazai.service.impl.FluxoServiceImpl;

@RestController
public class FluxoController {
	
	@Autowired
	private FluxoServiceImpl servico;
	
	@GetMapping("/fluxos")
	public ResponseEntity <List <Fluxo>> getTodas() {
		return ResponseEntity.status(HttpStatus.OK).body(servico.findAll());
	}
	
	@GetMapping("/fluxos/numero/{numero}")
	public ResponseEntity <Fluxo> getExcecaoPeloNumero(@PathVariable String numero) {
		return ResponseEntity.status(HttpStatus.OK).body(servico.findById(numero));
	}
	
	@GetMapping("/fluxos/mci/{mci}")
	public ResponseEntity <Fluxo> getExcecaoPeloMci(@PathVariable Long mci) {
		return ResponseEntity.status(HttpStatus.OK).body(servico.findByMci(mci));
	}
	
	
	@PostMapping("/fluxo")
	public ResponseEntity <Fluxo> criar(@RequestBody FluxoDto fluxo) {
		Fluxo flux = servico.criar(fluxo);
		
		return ResponseEntity.status(HttpStatus.CREATED).body(flux);
	}

}
