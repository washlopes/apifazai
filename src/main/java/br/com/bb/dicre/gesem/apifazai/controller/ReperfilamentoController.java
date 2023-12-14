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

import br.com.bb.dicre.gesem.apifazai.dto.ReperfilamentoDto;
import br.com.bb.dicre.gesem.apifazai.modelo.Reperfilamento;
import br.com.bb.dicre.gesem.apifazai.service.IReperfilamentoService;

@RestController
public class ReperfilamentoController {
	
	@Autowired
	private IReperfilamentoService reperfilamentoServico;
	
	@GetMapping("/reperfilamentos")
	public ResponseEntity <List <Reperfilamento>> obterTodos() {
		return ResponseEntity.status(HttpStatus.OK).body(reperfilamentoServico.obterTodos());
	}
	
	@GetMapping("/reperfilamentos/{numero}")
	public ResponseEntity <Reperfilamento> obterPeloNumero(@PathVariable String numero) {
		return ResponseEntity.status(HttpStatus.OK).body(reperfilamentoServico.obterPeloNumero(numero));
	}
	
	@PostMapping("/reperfilamentos")
	public ResponseEntity <Reperfilamento> salvar(@RequestBody ReperfilamentoDto dto) {
		return ResponseEntity.status(HttpStatus.OK).body(reperfilamentoServico.salvar(dto));
	}
	
	

}
