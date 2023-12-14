package br.com.bb.dicre.gesem.apifazai.dto;

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
public class SolicitacaoExcecaoDto {
	
	private String numeroProcesso;

	private LocalDateTime tempoExecucao;
	
	private Long mci;	
	
	private String matricula;	
	
	private String etapa;


}
