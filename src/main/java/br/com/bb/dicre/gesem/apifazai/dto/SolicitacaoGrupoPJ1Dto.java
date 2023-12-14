package br.com.bb.dicre.gesem.apifazai.dto;

import java.time.LocalDateTime;

import javax.validation.constraints.NotBlank;
import javax.validation.constraints.Size;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.NoArgsConstructor;

@Data
@Builder
@AllArgsConstructor
@NoArgsConstructor
@EqualsAndHashCode(callSuper=false)
public class SolicitacaoGrupoPJ1Dto {
	
	// private Long id;
	
	@NotBlank(message="Não pode ser nulo ou vazio")
	@Size(min=9, max=13, message="Deve ter entre 9 e 13 caracteres.")	
	private String numero;
	
	private LocalDateTime dataSolicitacao;
	
	@NotBlank(message="Não pode ser nulo ou vazio")
	private String tipoSolicitacao;
	
	private String codigoGrupo;
	
	
		
	private String mci1;
	
	private String mci2;
	
	private String mci3;
	
	private String mci4;
	
	private String mci5;
	
	private String mci6;
	
	private String mci7;
	
	private String mci8;
	
	private String mci9;
	
	private String mci10;	
	
	private String motivosDeExclusaoDasEmpresas;
	
	private String prefixoDoSolicitante;
	
	private String parecerAgencia;	
	
	/* private String motivosDeIndeferimento;
	
	private String motivosDeDeferimento;
	
	private String motivosDeDevolucao;
	
	private String decisaoDicre; */	
	
	private String statusSolicitacao;
	
	private String sugestaoNomeGrupo;
	
}
