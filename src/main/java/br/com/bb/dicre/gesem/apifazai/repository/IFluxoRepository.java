package br.com.bb.dicre.gesem.apifazai.repository;

import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import br.com.bb.dicre.gesem.apifazai.modelo.Fluxo;
import br.com.bb.dicre.gesem.apifazai.modelo.SolicitacaoExcecao;

public interface IFluxoRepository extends JpaRepository<Fluxo, String> {

	@Query("SELECT f FROM Fluxo f WHERE f.mci = : mci")
	public Optional <Fluxo> findByMci(Long mci);
	
}
