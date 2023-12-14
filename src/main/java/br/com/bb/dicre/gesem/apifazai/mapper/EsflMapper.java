package br.com.bb.dicre.gesem.apifazai.mapper;

import java.time.LocalDate;
import java.util.Objects;

import br.com.bb.dicre.gesem.apifazai.dto.EsflDto;
import br.com.bb.dicre.gesem.apifazai.modelo.Esfl;

public class EsflMapper {
	
	public static Esfl fromDtoToEntity(EsflDto dto) {
		return Esfl.builder()
				.id(dto.getId())
				.dataCalculo(Objects.isNull(dto.getDataCalculo()) ? LocalDate.now() : dto.getDataCalculo())
				.mci(dto.getMci())				
				.metodologia(dto.getMetodologia())
				.limiteAprovado(dto.getLimiteAprovado())
				.riscoDiris(dto.getRiscoDiris())
				.faturamento(dto.getFaturamento())
				.endividamento(dto.getEndividamento())
				.variacaoFaturamentoEndividamento(dto.getVariacaoFaturamentoEndividamento())
				.qtdeAnotInformativa(dto.getQtdeAnotInformativa())
				.valorAnotInformativa(dto.getValorAnotInformativa())
				.qtdeAnotFraca(dto.getQtdeAnotFraca())
				.valorAnotFraca(dto.getValorAnotFraca())
				.qtdeAnotRelativa(dto.getQtdeAnotRelativa())
				.valorAnotRelativa(dto.getValorAnotRelativa())
				.qtdeAnotRelativaAbsoluta(dto.getQtdeAnotRelativaAbsoluta())
				.valorAnotRelativaAbsoluta(dto.getValorAnotRelativaAbsoluta())
				.qtdeAnotImpeditiva(dto.getQtdeAnotImpeditiva())
				.valorAnotImpeditiva(dto.getValorAnotImpeditiva())
				.qtdeAnotTotal(dto.getQtdeAnotTotal())
				.valorAnotTotal(dto.getValorAnotTotal())
				.limiteV1(dto.getLimiteV1())
				.rotativoV1(dto.getRotativoV1())
				.investimentoV1(dto.getInvestimentoV1())
				.recebiveisV1(dto.getRecebiveisV1())
				.limiteV2(dto.getLimiteV2())
				.rotativoV2(dto.getRotativoV2())
				.investimentoV2(dto.getInvestimentoV2())
				.recebiveisV2(dto.getRecebiveisV2())
				.build();
						
	}

}
