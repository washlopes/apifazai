package br.com.bb.dicre.gesem.apifazai.mapper;

import java.time.LocalDateTime;

import br.com.bb.dicre.gesem.apifazai.dto.SolicitacaoEsflDto;
import br.com.bb.dicre.gesem.apifazai.modelo.SolicitacaoEsfl;

public class SolicitacaoEsflMapper {
	
	public static SolicitacaoEsfl fromDtoToEntity(SolicitacaoEsflDto dto) {
		return SolicitacaoEsfl.builder()
				.id(dto.getId())
				.mci(dto.getMci())
				.dataSolicitacao(LocalDateTime.now())
				.limiteProposto(dto.getLimiteProposto())
				.subLimiteRotativo(dto.getSubLimiteRotativo())
				.subLimiteInvestimento(dto.getSubLimiteInvestimento())
				.subLimiteRecebiveis(dto.getSubLimiteRecebiveis())
				.parecerAgencia(dto.getParecerAgencia())
				.build();
	}

}
