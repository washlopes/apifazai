package br.com.bb.dicre.gesem.apifazai.dto;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
@EqualsAndHashCode(callSuper=false)
@Builder
public class ReperfilamentoDto {
	
	private String numero;
	
	private Integer mci;
	
	private String statusSolicitacao;

}
