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

import br.com.bb.dicre.gesem.apifazai.dto.SolicitacaoEsflDto;
import br.com.bb.dicre.gesem.apifazai.modelo.SolicitacaoEsfl;
import br.com.bb.dicre.gesem.apifazai.service.ISolicitacaoEsflService;

@RestController
public class SolicitacaoEsflController {
	
	@Autowired
	private ISolicitacaoEsflService servico;
	
	@GetMapping("/solicitacoesesfl")
	public ResponseEntity <List <SolicitacaoEsfl>> obterTodos() {
		return ResponseEntity.status(HttpStatus.OK).body(servico.obterTodos());
	}
	
	@GetMapping("/solicitacoesesfl/id/{id}")
	public ResponseEntity <SolicitacaoEsfl> obterPeloId(@PathVariable Long id) {
		return ResponseEntity.status(HttpStatus.OK).body(servico.obterPeloId(id));
	}
	
	@GetMapping("/solicitacoesesfl/mci/{mci}")
	public ResponseEntity <List <SolicitacaoEsfl>> obterPeloMci(@PathVariable Integer mci) {
		return ResponseEntity.status(HttpStatus.OK).body(servico.obterPeloMci(mci));
	}
	
	@PostMapping("/solicitacoesesfl")
	public ResponseEntity <SolicitacaoEsfl> salvar(@RequestBody SolicitacaoEsflDto dto) {
		return ResponseEntity.status(HttpStatus.CREATED).body(servico.salver(dto));
	}

}
