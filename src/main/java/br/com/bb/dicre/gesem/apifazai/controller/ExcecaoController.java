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

import br.com.bb.dicre.gesem.apifazai.dto.ExcecaoDto;
import br.com.bb.dicre.gesem.apifazai.modelo.Excecao;
import br.com.bb.dicre.gesem.apifazai.service.impl.ExcecaoServiceImpl;

@RestController
public class ExcecaoController {
	
	@Autowired
	private ExcecaoServiceImpl servico;
	
	@GetMapping("/excecoes")
	public ResponseEntity <List <Excecao>> getTodas() {
		return ResponseEntity.status(HttpStatus.OK).body(servico.findAll());
	}
	
	@GetMapping("/excecoes/numero/{numero}")
	public ResponseEntity <Excecao> getExcecaoPeloNumero(@PathVariable String numero) {
		return ResponseEntity.status(HttpStatus.OK).body(servico.findById(numero));
	}
	
	@GetMapping("/excecoes/mci/{mci}")
	public ResponseEntity <Excecao> getExcecaoPeloMci(@PathVariable Long mci) {
		return ResponseEntity.status(HttpStatus.OK).body(servico.findByMci(mci));
	}
	
	
	@PostMapping("/excecoes")
	public ResponseEntity <Excecao> criar(@RequestBody ExcecaoDto excecao) {
		Excecao excec = servico.criar(excecao);
		
		return ResponseEntity.status(HttpStatus.CREATED).body(excec);
	}
	

}
