package br.com.bb.dicre.gesem.apifazai.dto;

import java.math.BigDecimal;
import java.time.LocalDate;

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
	
	private Long anoMesDeb;
	
	private Long qtdChequesDevolvidos;
	
	private Long qtExcessos;	
	
	private BigDecimal somatotarioCreditos;
	
	private BigDecimal mediaCreditos;
	
	private BigDecimal creditoTrimestral;
	
	private BigDecimal creditoSemestral;	
	
	private Integer qtdeAnotInformativaPresid;
	
	private BigDecimal valorAnotInformativaPresid;
	
	private Integer qtdeAnotFracaPresid;
	
	private BigDecimal valorAnotFracaPresid;
	
	private Integer qtdeAnotRelativaPresid;
	
	private BigDecimal valorAnotRelativaPresid;
	
	private Integer qtdeAnotRelativaAbsolutaPresid;
	
	private BigDecimal valorAnotRelativaAbsolutaPresid;
	
	private Integer qtdeAnotImpeditivaPresid;
	
	private BigDecimal valorAnotImpeditivaPresid;
	
	private Integer qtdeAnotTotalPresid;
	
	private BigDecimal valorAnotTotalPresid;
	
	private Long anoMesDebPresid;
	
	private Long qtdChequesDevolvidosPresid;
	
	private Long qtExcessosPresid;	
	
	private BigDecimal somatotarioCreditosPresid;
	
	private BigDecimal mediaCreditosPresid;
	
	private BigDecimal creditoTrimestralPresid;
	
	private BigDecimal creditoSemestralPresid;	
	
	private Integer qtdeAnotInformativaFinan;
	
	private BigDecimal valorAnotInformativaFinan;
	
	private Integer qtdeAnotFracaFinan;
	
	private BigDecimal valorAnotFracaFinan;
	
	private Integer qtdeAnotRelativaFinan;
	
	private BigDecimal valorAnotRelativaFinan;
	
	private Integer qtdeAnotRelativaAbsolutaFinan;
	
	private BigDecimal valorAnotRelativaAbsolutaFinan;
	
	private Integer qtdeAnotImpeditivaFinan;
	
	private BigDecimal valorAnotImpeditivaFinan;
	
	private Integer qtdeAnotTotalFinan;
	
	private BigDecimal valorAnotTotalFinan;
	
	private Long anoMesDebFinan;
	
	private Long qtdChequesDevolvidosFinan;
	
	private Long qtExcessosFinan;	
	
	private BigDecimal somatotarioCreditosFinan;
	
	private BigDecimal mediaCreditosFinan;
		
	private BigDecimal creditoTrimestralFinan;
	
	private BigDecimal creditoSemestralFinan;
	
	private String observacao;
	
	private Boolean calculoValido;
	
	private BigDecimal limiteV1;
	
	private BigDecimal rotativoV1;
	
	private BigDecimal investimentoV1;
	
	private BigDecimal recebiveisV1;
	
	private BigDecimal limiteV2;
	
	private BigDecimal rotativoV2;
	
	private BigDecimal investimentoV2;
	
	private BigDecimal recebiveisV2;
	
}
