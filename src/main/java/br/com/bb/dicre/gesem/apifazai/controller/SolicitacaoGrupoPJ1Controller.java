package br.com.bb.dicre.gesem.apifazai.controller;

import java.util.List;

import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import br.com.bb.dicre.gesem.apifazai.dto.SolicitacaoGrupoPJ1Dto;
import br.com.bb.dicre.gesem.apifazai.modelo.SolicitacaoGrupoPJ1;
import br.com.bb.dicre.gesem.apifazai.service.impl.SolicitacaoGrupoPJ1ServiceImpl;

@RestController
public class SolicitacaoGrupoPJ1Controller {
	
	@Autowired
	private SolicitacaoGrupoPJ1ServiceImpl servico;
	
	@GetMapping("/solicitacoes")
	public ResponseEntity <List <SolicitacaoGrupoPJ1> > buscarTodos() {
		return ResponseEntity.status(HttpStatus.OK).body(servico.findAll());
	}
	
	@GetMapping("/solicitacoes/{id}")
	public ResponseEntity <SolicitacaoGrupoPJ1> buscarPorId(@PathVariable Long id) {
		return ResponseEntity.status(HttpStatus.OK).body(servico.findById(id));
	}
	
	@GetMapping("/solicitacaomci/{mci}")
	public ResponseEntity <SolicitacaoGrupoPJ1> buscarPorMciLong(@PathVariable Integer mci) {
		return ResponseEntity.status(HttpStatus.OK).body(servico.findByMci(mci));
	}
	
	@GetMapping("/solicitacaonumero/{numero}")
	public ResponseEntity <SolicitacaoGrupoPJ1> buscarPorNumero(@PathVariable String numero) {
		return ResponseEntity.status(HttpStatus.OK).body(servico.findByNumero(numero));
	}
	
	@PostMapping(path="/solicitacoes", consumes= MediaType.APPLICATION_JSON_VALUE, produces=MediaType.APPLICATION_JSON_VALUE)	
	public ResponseEntity <SolicitacaoGrupoPJ1> criar(@Valid @RequestBody SolicitacaoGrupoPJ1Dto solicitacao) {
		
		if (solicitacao.getMci1().isBlank()) {
			System.out.println("MCI: 0");
		} else {
			System.out.println(solicitacao.getMci1());
		}
		
		SolicitacaoGrupoPJ1 sol = servico.criar(solicitacao);
		
		return ResponseEntity.status(HttpStatus.CREATED).body(sol);
		
	}
	
	@PutMapping("/solicitacao/{numero}")
	public ResponseEntity <SolicitacaoGrupoPJ1> atualizar(@Valid @RequestBody SolicitacaoGrupoPJ1Dto solicitacao) {
		return ResponseEntity.status(HttpStatus.OK).body(servico.atualizarPeloNumero(solicitacao, solicitacao.getNumero()));
	}

}

