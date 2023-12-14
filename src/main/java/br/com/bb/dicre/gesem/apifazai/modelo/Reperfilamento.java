package br.com.bb.dicre.gesem.apifazai.modelo;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.NoArgsConstructor;

@Entity
@Table(name="t_reperfilamento", schema="fazai")
@Data
@NoArgsConstructor
@AllArgsConstructor
@EqualsAndHashCode(callSuper=false)
@Builder
public class Reperfilamento implements Serializable {
	
	/**
	 * 
	 */
	private static final long serialVersionUID = 8927551313423971997L;

	@Id
	@Column(name="numero")
	private String numero;
	
	private Integer mci;
	
	private String statusSolicitacao;

}
