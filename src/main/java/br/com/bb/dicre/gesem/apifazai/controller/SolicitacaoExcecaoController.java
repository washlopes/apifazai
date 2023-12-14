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

import br.com.bb.dicre.gesem.apifazai.dto.SolicitacaoExcecaoDto;
import br.com.bb.dicre.gesem.apifazai.modelo.SolicitacaoExcecao;
import br.com.bb.dicre.gesem.apifazai.service.impl.SolicitacaoExcecaoServiceImpl;

@RestController
public class SolicitacaoExcecaoController {
	
	@Autowired
	private SolicitacaoExcecaoServiceImpl servico;
	
	@GetMapping("/fluxo")
	public ResponseEntity <List <SolicitacaoExcecao>> getTodas() {
		return ResponseEntity.status(HttpStatus.OK).body(servico.obterTodos());
	}
	
	@GetMapping("/fluxo/numero/{numero}")
	public ResponseEntity <SolicitacaoExcecao> getExcecaoPeloNumero(@PathVariable String numero) {
		return ResponseEntity.status(HttpStatus.OK).body(servico.obterPeloNumero(numero));
	}
	
	@GetMapping("/fluxo/mci/{mci}")
	public ResponseEntity <SolicitacaoExcecao> getExcecaoPeloMci(@PathVariable Long mci) {
		return ResponseEntity.status(HttpStatus.OK).body(servico.obterPeloMci(mci));
	}
	
	
	@PostMapping("/fluxo")
	public ResponseEntity <SolicitacaoExcecao> criar(@RequestBody SolicitacaoExcecaoDto excecao) {		
		return ResponseEntity.status(HttpStatus.CREATED).body(servico.salvar(excecao));
	}
	

}
