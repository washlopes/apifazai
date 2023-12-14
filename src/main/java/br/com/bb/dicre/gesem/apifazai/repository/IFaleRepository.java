package br.com.bb.dicre.gesem.apifazai.repository;

import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import br.com.bb.dicre.gesem.apifazai.modelo.Fale;

public interface IFaleRepository extends JpaRepository<Fale, String> {
	
	@Query("SELECT f FROM Fale f where f.mci = :mci")
	public Optional <Fale> findByMci(Integer mci);

}
