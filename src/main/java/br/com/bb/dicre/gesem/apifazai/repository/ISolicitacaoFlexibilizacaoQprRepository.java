package br.com.bb.dicre.gesem.apifazai.repository;

import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import br.com.bb.dicre.gesem.apifazai.modelo.SolicitacaoFlexibilizacaoQpr;

public interface ISolicitacaoFlexibilizacaoQprRepository extends JpaRepository<SolicitacaoFlexibilizacaoQpr, String> {
	
	@Query("select sfq from SolicitacaoFlexibilizacaoQpr sfq where sfq.mciCedente = :mci")
	public Optional <SolicitacaoFlexibilizacaoQpr> findByMciCedente(String mci);
	
	@Query("select sfq from SolicitacaoFlexibilizacaoQpr sfq where sfq.cpfSacado = :cpfSacado")
	public Optional <SolicitacaoFlexibilizacaoQpr> findByCpfSacado(String cpfSacado);
	
	@Query("select sfq from SolicitacaoFlexibilizacaoQpr sfq where sfq.cnpjSacado = :cnpjSacado")
	public Optional <SolicitacaoFlexibilizacaoQpr> findByCnpjSacado(String cnpjSacado);

}
