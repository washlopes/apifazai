package br.com.bb.dicre.gesem.apifazai.mapper;

import br.com.bb.dicre.gesem.apifazai.dto.ReperfilamentoDto;
import br.com.bb.dicre.gesem.apifazai.modelo.Reperfilamento;

public class ReperfilamentoMapper {
	
	public static Reperfilamento fromDtoToEntity(ReperfilamentoDto dto) {
		return Reperfilamento.builder()
		.numero(dto.getNumero())
		.mci(dto.getMci())
		.statusSolicitacao(dto.getStatusSolicitacao())
		.build();
	}

}
