package br.com.bb.dicre.gesem.apifazai.modelo;

import java.io.Serializable;
import java.time.LocalDate;
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

@Data
@NoArgsConstructor
@AllArgsConstructor
@EqualsAndHashCode(callSuper = false)
@Builder
@Entity
@Table(name="dados_mpe_excecoes", schema="public")
public class Excecao implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = 3150736768053405731L;

	@Id
	@Column(name="nr_processo")
	private String numeroProcesso;
	
	@Column(name="ts_execucao")
	private LocalDateTime tempoExecucao;
	
	private Long mci;
	
	private LocalDate prazo;
	
	private String matricula;
	
	private String texto;
	
	private String etapa;
	
}
