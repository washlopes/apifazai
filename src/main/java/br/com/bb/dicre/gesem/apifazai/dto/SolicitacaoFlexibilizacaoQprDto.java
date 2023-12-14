package br.com.bb.dicre.gesem.apifazai.dto;

import java.io.Serializable;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
@EqualsAndHashCode(callSuper=false)
@Builder
public class SolicitacaoFlexibilizacaoQprDto implements Serializable {
	
	/**
	 * 
	 */
	private static final long serialVersionUID = 6450648102255050942L;
	
	private Long id;
	
	private String numero;
	
	private String tipoFlexibilizacao;
	
	private String produto;
	
	private String mciCedente;
	
	private String cpfSacado;
	
	private String cnpjSacado;
	
	private String status;
	
	

}
