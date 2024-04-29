package br.com.bb.dicre.gesem.apifazai.mapper;

import br.com.bb.dicre.gesem.apifazai.dto.SolicitacaoFlexibilizacaoQprDto;
import br.com.bb.dicre.gesem.apifazai.modelo.SolicitacaoFlexibilizacaoQpr;

public class SolicitacaoFlexibilizacaoQprMapper {
	
	private SolicitacaoFlexibilizacaoQprMapper() {
		
	}
	
	public static SolicitacaoFlexibilizacaoQpr fromDtoToEntity(SolicitacaoFlexibilizacaoQprDto dto) {
		return SolicitacaoFlexibilizacaoQpr.builder()
				.id(dto.getId())
				.numero(dto.getNumero())
				.tipoFlexibilizacao(dto.getTipoFlexibilizacao())
				.produto(dto.getProduto())
				.mciCedente(dto.getMciCedente().isEmpty() ? Long.parseLong("0") : Long.valueOf(dto.getMciCedente()
						.replace(".", "").replace("-","").replace("/", "")))
				.cpfSacado(dto.getCpfSacado().isEmpty() ? Long.parseLong("0") :  Long.valueOf(dto.getCpfSacado()
						.replace(".", "").replace("-","").replace("/", "")))
				.cnpjSacado(dto.getCnpjSacado().isEmpty() ? Long.parseLong("0") : Long.valueOf(dto.getCnpjSacado()
						.replace(".", "").replace("-","").replace("/", "")))
				.status("EM ANÁLISE")
				.build();
	}

}