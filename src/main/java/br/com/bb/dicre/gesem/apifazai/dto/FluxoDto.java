package br.com.bb.dicre.gesem.apifazai.dto;

import java.io.Serializable;
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
public class FluxoDto implements Serializable {
	
	/**
	 * 
	 */
	private static final long serialVersionUID = -2145477614732472955L;

	private String numero;
	
	private LocalDateTime tempoExecucao;
	
	private Long mci;	
	
	private String etapa;

}
