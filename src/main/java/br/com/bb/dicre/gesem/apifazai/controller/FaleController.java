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

import br.com.bb.dicre.gesem.apifazai.dto.FaleDto;
import br.com.bb.dicre.gesem.apifazai.modelo.Fale;
import br.com.bb.dicre.gesem.apifazai.service.IFaleService;

@RestController
public class FaleController {
	
	@Autowired
	private IFaleService servico;
	
	@GetMapping("/fale")
	public ResponseEntity <List <Fale>> obterTodos() {
		return ResponseEntity.status(HttpStatus.OK).body(servico.obterTodos());
	}
	
	@GetMapping("/false/numero/{numero}")
	public ResponseEntity <Fale> obterPeloNumero(@PathVariable String numero) {
		return ResponseEntity.status(HttpStatus.OK).body(servico.obterPeloNumero(numero));
	}
	
	@GetMapping("/fale/mci/{mci}")
	public ResponseEntity <Fale> obterPeloMci(@PathVariable Integer mci) {
		return ResponseEntity.status(HttpStatus.OK).body(servico.obterPeloMci(mci));
	}
	
	@PostMapping("/fale")
	public ResponseEntity <Fale> salvar(@RequestBody FaleDto dto) {
		return ResponseEntity.status(HttpStatus.CREATED).body(servico.salvar(dto));
	}
	

}
