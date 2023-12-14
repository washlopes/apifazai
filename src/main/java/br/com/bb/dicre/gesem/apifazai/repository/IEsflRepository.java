package br.com.bb.dicre.gesem.apifazai.repository;

import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import br.com.bb.dicre.gesem.apifazai.modelo.Esfl;

public interface IEsflRepository extends JpaRepository<Esfl, Long> {
	
	@Query("SELECT e FROM Esfl e where e.mci = :mci and e.dataCalculo = current_date ORDER BY e.dataCalculo")
	public Optional <Esfl> findByMci(Integer mci);

}
