package br.com.bb.dicre.gesem.apifazai.mapper;

import java.time.LocalDateTime;

import br.com.bb.dicre.gesem.apifazai.dto.FluxoDto;
import br.com.bb.dicre.gesem.apifazai.modelo.Fluxo;

public class FluxoMapper {
	
	public static Fluxo fromDtoToEntity(FluxoDto dto) {
		return Fluxo.builder()
				.numero(dto.getNumero())
				.tempoExecucao(LocalDateTime.now())
				.mci(dto.getMci())				
				.etapa(dto.getEtapa().isEmpty() ? "" : dto.getEtapa())				
				.build();
	}

}
