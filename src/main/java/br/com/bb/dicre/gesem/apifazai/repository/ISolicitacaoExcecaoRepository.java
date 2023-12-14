package br.com.bb.dicre.gesem.apifazai.repository;

import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import br.com.bb.dicre.gesem.apifazai.modelo.SolicitacaoExcecao;

public interface ISolicitacaoExcecaoRepository extends JpaRepository<SolicitacaoExcecao, String> {
	
	@Query("SELECT se FROM SolicitacaoExcecao se WHERE se.mci = : mci")
	public Optional <SolicitacaoExcecao> findByMci(Long mci);

}
