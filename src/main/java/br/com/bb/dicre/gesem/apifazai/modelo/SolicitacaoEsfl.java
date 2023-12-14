package br.com.bb.dicre.gesem.apifazai.modelo;

import java.io.Serializable;
import java.math.BigDecimal;
import java.time.LocalDateTime;

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
@Table(name="solicitacao_esfl", schema="esfl")
@Data
@NoArgsConstructor
@AllArgsConstructor
@EqualsAndHashCode(callSuper=false)
@Builder
public class SolicitacaoEsfl implements Serializable {
	
	/**
	 * 
	 */
	private static final long serialVersionUID = -420547481359352175L;

	@Id
	@GeneratedValue(strategy=GenerationType.SEQUENCE, generator="solicitacao_esfl_id_seq" )
	@SequenceGenerator(sequenceName = "solicitacao_esfl_id_seq", name = "solicitacao_esfl_id_seq", schema="esfl", allocationSize = 1)
	private Long id;
	
	private Integer mci;
	
	@Column(name="dt_slct")
	private LocalDateTime dataSolicitacao ;
	
	@Column(name="lmt_prpst")
	private BigDecimal limiteProposto;
	
	@Column(name="sub_lmt_rotativo")
	private BigDecimal subLimiteRotativo;
	
	@Column(name="sub_lmt_investimento")
	private BigDecimal subLimiteInvestimento;
	
	@Column(name="sub_lmt_recebiveis")
	private BigDecimal subLimiteRecebiveis;
	
	private String parecerAgencia;
	

}
