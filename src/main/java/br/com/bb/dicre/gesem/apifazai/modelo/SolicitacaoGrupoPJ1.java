package br.com.bb.dicre.gesem.apifazai.modelo;

import java.time.LocalDateTime;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.NoArgsConstructor;

@Entity
@Table(name="solicitacao_grupo_pj1", schema="fazai")
@Data
@Builder
@AllArgsConstructor
@NoArgsConstructor
@EqualsAndHashCode(callSuper=false)
public class SolicitacaoGrupoPJ1 {	
	
	@Id
	private String numero;
	
	@Column(name="ts_execucao")
	private LocalDateTime dataSolicitacao;
	
	private String tipoSolicitacao;
	
	private Integer codigoGrupo;
	
	private Integer mci1; 
	
	private Integer mci2;
	
	private Integer mci3;
	
	private Integer mci4;
	
	private Integer mci5;
	
	private Integer mci6;
	
	private Integer mci7;
	
	private Integer mci8;
	
	private Integer mci9;	
	
	private Integer mci10;	
	
	@Column(name="mtv_excl_empresas")
	private String motivosDeExclusaoDasEmpresas;
	
	private Integer prefixoDoSolicitante;
	
	private String parecerAgencia;
	
	/* private String motivosDeIndeferimento;
	
	private String motivosDeDeferimento;
	
	private String motivosDeDevolucao;
	
	private String decisaoDicre; */	
	
	private String statusSolicitacao;
	
	private String sugestaoNomeGrupo;
	
}