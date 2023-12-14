package br.com.bb.dicre.gesem.apifazai.dto;

import java.math.BigDecimal;
import java.time.LocalDate;

import javax.persistence.Column;

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
public class EsflDto {

	private Long id;	
	
	private LocalDate dataCalculo;	
	
	private Integer mci;
	
	private Integer metodologia;	
	
	private BigDecimal limiteAprovado;	
	
	private String riscoDiris;	
	
	private String riscoNivel5;	
	
	private BigDecimal faturamento;
	
	private BigDecimal endividamento;	
	
	private BigDecimal variacaoFaturamentoEndividamento;	
	
	private Integer qtdeAnotInformativa;
		
	private BigDecimal valorAnotInformativa;
	
	private Integer qtdeAnotFraca;
	
	private BigDecimal valorAnotFraca;
	
	private Integer qtdeAnotRelativa;
	
	private BigDecimal valorAnotRelativa;
	
	private Integer qtdeAnotRelativaAbsoluta;
	
	private BigDecimal valorAnotRelativaAbsoluta;
	
	private Integer qtdeAnotImpeditiva;
	
	private BigDecimal valorAnotImpeditiva;
	
	private Integer qtdeAnotTotal;
	
	private BigDecimal valorAnotTotal;	
	
	private BigDecimal limiteV1;
	
	private BigDecimal rotativoV1;
	
	private BigDecimal investimentoV1;
	
	private BigDecimal recebiveisV1;
	
	private BigDecimal limiteV2;
	
	private BigDecimal rotativoV2;
	
	private BigDecimal investimentoV2;
	
	private BigDecimal recebiveisV2;
	
}
