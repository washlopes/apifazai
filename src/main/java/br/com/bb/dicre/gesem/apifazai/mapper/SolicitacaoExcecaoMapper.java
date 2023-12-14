package br.com.bb.dicre.gesem.apifazai.mapper;

import java.time.LocalDateTime;

import br.com.bb.dicre.gesem.apifazai.dto.SolicitacaoExcecaoDto;
import br.com.bb.dicre.gesem.apifazai.modelo.SolicitacaoExcecao;

public class SolicitacaoExcecaoMapper {
	
	public static SolicitacaoExcecao fromDtoToEntity(SolicitacaoExcecaoDto dto) {
		return SolicitacaoExcecao.builder()
				.numeroProcesso(dto.getNumeroProcesso())
				.tempoExecucao(LocalDateTime.now())
				.mci(dto.getMci())	
				.matricula(dto.getMatricula())				
				.etapa(dto.getEtapa())
				.build();
	}

}
