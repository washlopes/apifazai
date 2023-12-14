package br.com.bb.dicre.gesem.apifazai.mapper;

import br.com.bb.dicre.gesem.apifazai.dto.FaleDto;
import br.com.bb.dicre.gesem.apifazai.modelo.Fale;

public class FaleMapper {
	
	public static Fale fromDtoToEntity(FaleDto dto) {
		return Fale.builder()
				.numero(dto.getNumero())
				.mci(dto.getMci())
				.statusDaSolicitacao("AGUARDANDO ANÁLISE")
				.build();
	}

}