package br.com.bb.dicre.gesem.apifazai.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import br.com.bb.dicre.gesem.apifazai.modelo.Esfl;
import br.com.bb.dicre.gesem.apifazai.service.IEsflService;

@RestController
public class EsflController {
	
	@Autowired
	private IEsflService servico;
	
	@GetMapping("/calculos")
	public ResponseEntity<List <Esfl>> obterTodos() {
		return ResponseEntity.status(HttpStatus.OK).body(servico.obterTodos());
	}
	
	@GetMapping("/calculos/id/{id}")
	public ResponseEntity <Esfl> obterPeloId(@PathVariable Long id) {
		return ResponseEntity.status(HttpStatus.OK).body(servico.obterPeloId(id));
	}
	
	@GetMapping("/calculos/mci/{mci}")
	public ResponseEntity <Esfl> obterPeloMci(@PathVariable Integer mci) {	
		
		return ResponseEntity.status(HttpStatus.OK).body(servico.obterPeloMci(mci));
	}

}
