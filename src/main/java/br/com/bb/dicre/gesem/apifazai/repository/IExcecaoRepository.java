package br.com.bb.dicre.gesem.apifazai.repository;

import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import br.com.bb.dicre.gesem.apifazai.modelo.Excecao;

public interface IExcecaoRepository extends JpaRepository<Excecao, String> {

	@Query("select e from Excecao e where e.mci = :mci")
	public Optional <Excecao> findByMci(Long mci);
}
