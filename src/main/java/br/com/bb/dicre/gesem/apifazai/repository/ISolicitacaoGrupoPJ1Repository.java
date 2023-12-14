package br.com.bb.dicre.gesem.apifazai.repository;

import java.time.LocalDateTime;
import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import br.com.bb.dicre.gesem.apifazai.modelo.SolicitacaoGrupoPJ1;

public interface ISolicitacaoGrupoPJ1Repository extends JpaRepository<SolicitacaoGrupoPJ1, Long> {

	@Query("select s from SolicitacaoGrupoPJ1 s where s.mci1 = :mci or s.mci2 = :mci or s.mci3 = :mci or s.mci4 = :mci or s.mci5 = :mci"
			+ " or s.mci6 = :mci or s.mci7 = :mci or s.mci8 = :mci or s.mci9 = :mci or s.mci10 = :mci")
	public Optional <SolicitacaoGrupoPJ1> findByMci(Integer mci);
	
	@Query("select s from SolicitacaoGrupoPJ1 s where (s.mci1 = :mci and s.mci2 = :mci and s.mci3 = :mci and s.mci4 = :mci and s.mci5 = :mci"
			+ " and s.mci6 = :mci and s.mci7 = :mci and s.mci8 = :mci and s.mci9 = :mci and s.mci10 = :mci) and s.dataSolicitacao >= :data"
			+ " and s.statusSolicitacao = 'FINALIZADO'")
	public Optional <SolicitacaoGrupoPJ1> findByMciAndData(Integer mci, LocalDateTime data);
	
	@Query("select s from SolicitacaoGrupoPJ1 s where s.numero = :numero")
	public Optional <SolicitacaoGrupoPJ1> findByNumero(String numero);
	
	@Query("delete from SolicitacaoGrupoPJ1 s where s.numero = :numero")
	public Optional <Void> deleteByNumero(String numero);
}