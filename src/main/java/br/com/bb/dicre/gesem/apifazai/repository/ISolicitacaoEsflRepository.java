package br.com.bb.dicre.gesem.apifazai.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import br.com.bb.dicre.gesem.apifazai.modelo.SolicitacaoEsfl;

public interface ISolicitacaoEsflRepository extends JpaRepository<SolicitacaoEsfl, Long> {
	
	@Query("SELECT s FROM SolicitacaoEsfl s where s.mci = :mci")
	public List <SolicitacaoEsfl> findByMci(Integer mci);
	

}
