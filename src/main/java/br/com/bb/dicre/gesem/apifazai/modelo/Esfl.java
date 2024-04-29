package br.com.bb.dicre.gesem.apifazai.modelo;

import java.io.Serializable;
import java.math.BigDecimal;
import java.time.LocalDate;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.SequenceGenerator;
import javax.persistence.Table;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.NoArgsConstructor;


@Entity
@Table(name="entidade_calculo", schema="esfl")
@Data
@NoArgsConstructor
@AllArgsConstructor
@EqualsAndHashCode(callSuper = false)
@Builder
public class Esfl implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = 3927491816787972271L;

	@Id
	@GeneratedValue(strategy=GenerationType.SEQUENCE, generator="entidade_calculo_id_seq")
	@SequenceGenerator(name="entidade_calculo_id_seq", sequenceName = "entidade_calculo_id_seq", schema="esfl", allocationSize = 1)
	private Long id;
	
	@Column(name="ts_execucao")
	private LocalDate dataCalculo;
	
	@Column(name="cd_cli")
	private Integer mci;
	
	private Integer metodologia;
	
	@Column(name="lmt_apvd")
	private BigDecimal limiteAprovado;
	
	@Column(name="rsco_diris")
	private String riscoDiris;
	
	@Column(name="rsco_5")
	private String riscoNivel5;	
	
	private BigDecimal faturamento;
	
	private BigDecimal endividamento;
	
	@Column(name="var_fat_endiv")
	private BigDecimal variacaoFaturamentoEndividamento;
	
	@Column(name="qtd_anot_inform")
	private Integer qtdeAnotInformativa;
	
	@Column(name="vlr_anot_inform")
	private BigDecimal valorAnotInformativa;
	
	@Column(name="qtd_anot_fraca")
	private Integer qtdeAnotFraca;
	
	@Column(name="vlr_anot_fraca")
	private BigDecimal valorAnotFraca;
	
	@Column(name="qtd_anot_rltv")
	private Integer qtdeAnotRelativa;
	
	@Column(name="vlr_anot_rltv")
	private BigDecimal valorAnotRelativa;
	
	@Column(name="qtd_anot_rltv_abs")
	private Integer qtdeAnotRelativaAbsoluta;
	
	@Column(name="vlr_anot_rltv_abs")
	private BigDecimal valorAnotRelativaAbsoluta;
	
	@Column(name="qtd_anot_impedt")
	private Integer qtdeAnotImpeditiva;
	
	@Column(name="vlr_anot_impedt")
	private BigDecimal valorAnotImpeditiva;
	
	@Column(name="qtd_anot_total")
	private Integer qtdeAnotTotal;
	
	@Column(name="vlr_anot_total")
	private BigDecimal valorAnotTotal;
	
	@Column(name="deb_ano_mes")
	private Long anoMesDeb;
	
	@Column(name="qt_ch_dlvd")
	private Long qtdChequesDevolvidos;
	
	@Column(name="qt_dd_exc")
	private Long qtDevolucoesExcessos;	
	
	@Column(name="vlr_crd_sm")
	private BigDecimal somatotarioCreditos;
	
	@Column(name="vlr_crd_media")
	private BigDecimal mediaCreditos;
	
	@Column(name="vlr_crd_mm_03")
	private BigDecimal creditoTrimestral;
	
	@Column(name="vlr_crd_mm_06")
	private BigDecimal creditoSemestral;	
	
	@Column(name="qtd_anot_inform_presid")
	private Integer qtdeAnotInformativaPresid;
	
	@Column(name="vlr_anot_inform_presid")
	private BigDecimal valorAnotInformativaPresid;
	
	@Column(name="qtd_anot_fraca_presid")
	private Integer qtdeAnotFracaPresid;
	
	@Column(name="vlr_anot_fraca_presid")
	private BigDecimal valorAnotFracaPresid;
	
	@Column(name="qtd_anot_rltv_presid")
	private Integer qtdeAnotRelativaPresid;
	
	@Column(name="vlr_anot_rltv_presid")
	private BigDecimal valorAnotRelativaPresid;
	
	@Column(name="qtd_anot_rltv_abs_presid")
	private Integer qtdeAnotRelativaAbsolutaPresid;
	
	@Column(name="vlr_anot_rltv_abs_presid")
	private BigDecimal valorAnotRelativaAbsolutaPresid;
	
	@Column(name="qtd_anot_impedt_presid")
	private Integer qtdeAnotImpeditivaPresid;
	
	@Column(name="vlr_anot_impedt_presid")
	private BigDecimal valorAnotImpeditivaPresid;
	
	@Column(name="qtd_anot_total_presid")
	private Integer qtdeAnotTotalPresid;
	
	@Column(name="vlr_anot_total_presid")
	private BigDecimal valorAnotTotalPresid;
	
	@Column(name="deb_ano_mes_presid")
	private Long anoMesDebPresid;
	
	@Column(name="qt_ch_dlvd_presid")
	private Long qtdChequesDevolvidosPresid;
	
	@Column(name="qt_dd_exc_presid")
	private Long qtExcessosPresid;	
	
	@Column(name="vlr_crd_sm_presid")
	private BigDecimal somatotarioCreditosPresid;
	
	@Column(name="vlr_crd_media_presid")
	private BigDecimal mediaCreditosPresid;
	
	@Column(name="vlr_crd_mm_03_presid")
	private BigDecimal creditoTrimestralPresid;
	
	@Column(name="vlr_crd_mm_06_presid")
	private BigDecimal creditoSemestralPresid;	
	
	@Column(name="qtd_anot_inform_finan")
	private Integer qtdeAnotInformativaFinan;
	
	@Column(name="vlr_anot_inform_finan")
	private BigDecimal valorAnotInformativaFinan;
	
	@Column(name="qtd_anot_fraca_finan")
	private Integer qtdeAnotFracaFinan;
	
	@Column(name="vlr_anot_fraca_finan")
	private BigDecimal valorAnotFracaFinan;
	
	@Column(name="qtd_anot_rltv_finan")
	private Integer qtdeAnotRelativaFinan;
	
	@Column(name="vlr_anot_rltv_finan")
	private BigDecimal valorAnotRelativaFinan;
	
	@Column(name="qtd_anot_rltv_abs_finan")
	private Integer qtdeAnotRelativaAbsolutaFinan;
	
	@Column(name="vlr_anot_rltv_abs_finan")
	private BigDecimal valorAnotRelativaAbsolutaFinan;
	
	@Column(name="qtd_anot_impedt_finan")
	private Integer qtdeAnotImpeditivaFinan;
	
	@Column(name="vlr_anot_impedt_finan")
	private BigDecimal valorAnotImpeditivaFinan;
	
	@Column(name="qtd_anot_total_finan")
	private Integer qtdeAnotTotalFinan;
	
	@Column(name="vlr_anot_total_finan")
	private BigDecimal valorAnotTotalFinan;
	
	@Column(name="deb_ano_mes_finan")
	private Long anoMesDebFinan;
	
	@Column(name="qt_ch_dlvd_finan")
	private Long qtdChequesDevolvidosFinan;
	
	@Column(name="qt_dd_exc_finan")
	private Long qtExcessosFinan;	
	
	@Column(name="vlr_crd_sm_finan")
	private BigDecimal somatotarioCreditosFinan;
	
	@Column(name="vlr_crd_media_finan")
	private BigDecimal mediaCreditosFinan;
	
	@Column(name="vlr_crd_mm_03_finan")
	private BigDecimal creditoTrimestralFinan;
	
	@Column(name="vlr_crd_mm_06_finan")
	private BigDecimal creditoSemestralFinan;
	
	@Column(name="obsvc")
	private String observacao;
	
	@Column(name="calc_vld")
	private Boolean calculoValido;
	
	@Column(name="limite_v1")
	private BigDecimal limiteV1;
	
	@Column(name="rotativo_v1")
	private BigDecimal rotativoV1;
	
	@Column(name="investimento_v1")
	private BigDecimal investimentoV1;
	
	@Column(name="recebiveis_v1")
	private BigDecimal recebiveisV1;
	
	@Column(name="limite_v2")
	private BigDecimal limiteV2;
	
	@Column(name="rotativo_v2")
	private BigDecimal rotativoV2;
	
	@Column(name="investimento_v2")
	private BigDecimal investimentoV2;
	
	@Column(name="recebiveis_v2")
	private BigDecimal recebiveisV2;

}
