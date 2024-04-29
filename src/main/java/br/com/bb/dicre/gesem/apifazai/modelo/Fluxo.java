package br.com.bb.dicre.gesem.apifazai.modelo;

import java.io.Serializable;
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
@Table(name="fluxo", schema="fazai")
public class Fluxo implements Serializable {
	
	/**
	 * 
	 */
	private static final long serialVersionUID = -2045968911728505482L;

	@Id
	@Column(name="numero")
	private String numero;
	
	@Column(name="ts_execucao")
	private LocalDateTime tempoExecucao;
	
	private Long mci;	
	
	private String etapa;

}
