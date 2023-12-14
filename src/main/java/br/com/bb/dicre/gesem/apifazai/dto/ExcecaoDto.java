package br.com.bb.dicre.gesem.apifazai.dto;

import java.io.Serializable;
import java.time.LocalDate;
import java.time.LocalDateTime;

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
public class ExcecaoDto implements Serializable {
	
	/**
	 * 
	 */
	private static final long serialVersionUID = 9073801304231303207L;
	
	private String numeroProcesso;

	private LocalDateTime tempoExecucao;
	
	private Long mci;
	
	private LocalDate prazo;
	
	private String matricula;
	
	private String texto;
	
	private String etapa;

}
