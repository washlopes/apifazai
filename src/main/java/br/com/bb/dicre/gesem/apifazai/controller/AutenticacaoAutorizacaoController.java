package br.com.bb.dicre.gesem.apifazai.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import br.com.bb.dicre.gesem.apifazai.seguranca.Autenticador;
import br.com.bb.dicre.gesem.apifazai.seguranca.Usuario;

@RestController
public class AutenticacaoAutorizacaoController {
	
	@Autowired
	Autenticador autenticador;
	
	@PostMapping("/autenticacao")
	public ResponseEntity <Usuario> autenticar(@RequestBody Usuario usuario) {
		
		try {
			autenticador.autenticar(usuario.getChave(), usuario.getSenha());			
		} catch (Exception e) {
			throw new RuntimeException(e.getLocalizedMessage());
		}
		
		return ResponseEntity.status(HttpStatus.ACCEPTED).body(usuario);
		
	}

}
