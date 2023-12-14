package br.com.bb.dicre.gesem.apifazai.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import br.com.bb.dicre.gesem.apifazai.dto.SolicitacaoFlexibilizacaoQprDto;
import br.com.bb.dicre.gesem.apifazai.modelo.SolicitacaoFlexibilizacaoQpr;
import br.com.bb.dicre.gesem.apifazai.service.ISolicitacaoFlexibilizacaoQprService;

@RestController
public class SolicitacaoFlexibilizacaoQprController {
	
	@Autowired
	private ISolicitacaoFlexibilizacaoQprService servico; 
	
	@GetMapping("/qpr")
	public ResponseEntity <List <SolicitacaoFlexibilizacaoQpr>> getSolicitacoes() {
		return ResponseEntity.status(HttpStatus.OK).body(servico.findAll());
	}
	
	@PostMapping("/qpr")
	public ResponseEntity <SolicitacaoFlexibilizacaoQpr> criar(@RequestBody SolicitacaoFlexibilizacaoQprDto dto) {
		return ResponseEntity.status(HttpStatus.CREATED).body(servico.criar(dto));
	}

}
