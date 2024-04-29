package br.com.bb.dicre.gesem.apifazai.seguranca;

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
public class Usuario implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = 6202966765100683776L;
	
	private String chave;
	
	private String senha;

}
