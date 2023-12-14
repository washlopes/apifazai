package br.com.bb.dicre.gesem.apifazai.modelo;

import java.io.Serializable;

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
@Table(name="solicitacao_flex_qpr", schema="fazai")
@Data
@AllArgsConstructor
@NoArgsConstructor
@EqualsAndHashCode(callSuper=false)
@Builder
public class SolicitacaoFlexibilizacaoQpr implements Serializable {
	
	/**
	 * 
	 */
	private static final long serialVersionUID = -5838241695291683585L;

	@Id
	@GeneratedValue(strategy=GenerationType.SEQUENCE, generator = "solicitacao_flex_qpr_id_seq")
	@SequenceGenerator(name="solicitacao_flex_qpr_id_seq", sequenceName = "solicitacao_flex_qpr_id_seq", schema="fazai", allocationSize = 1)
	private Long id;
	
	private String numero;
	
	private String tipoFlexibilizacao;
	
	private String produto;
	
	private Long mciCedente;
	
	private Long cpfSacado;
	
	private Long cnpjSacado;
	
	private String status;
	

}
