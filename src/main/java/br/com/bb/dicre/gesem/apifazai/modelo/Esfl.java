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
