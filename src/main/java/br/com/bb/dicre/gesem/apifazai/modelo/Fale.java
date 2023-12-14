package br.com.bb.dicre.gesem.apifazai.modelo;

import java.io.Serializable;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.NoArgsConstructor;

@Entity
@Table(name="fale", schema="fazai")
@Data
@NoArgsConstructor
@AllArgsConstructor
@EqualsAndHashCode(callSuper = false)
@Builder
public class Fale implements Serializable {
	
	/**
	 * 
	 */
	private static final long serialVersionUID = 2288762614064323212L;
	
	@Id
	private String numero;
	
	private Integer mci;
	
	private String statusDaSolicitacao;


}
