package br.com.bb.dicre.gesem.apifazai.mapper;

import java.time.LocalDateTime;
import java.util.Objects;

import br.com.bb.dicre.gesem.apifazai.dto.SolicitacaoGrupoPJ1Dto;
import br.com.bb.dicre.gesem.apifazai.modelo.SolicitacaoGrupoPJ1;

public class SolicitacaoGrupoPJ1Mapper {
	
	public static SolicitacaoGrupoPJ1 fromDtoToEntity(SolicitacaoGrupoPJ1Dto dto) {
		return SolicitacaoGrupoPJ1.builder()
			.numero(dto.getNumero())
			.tipoSolicitacao(dto.getTipoSolicitacao())
			.codigoGrupo(dto.getCodigoGrupo().isEmpty() ? 0 : Integer.parseInt(dto.getCodigoGrupo().trim().replace("G", "").replace("g", "").replace("R", "").replace("r", "")))
			.sugestaoNomeGrupo(dto.getSugestaoNomeGrupo().isEmpty() ? "" : dto.getSugestaoNomeGrupo())
			.mci1(dto.getMci1().isEmpty() ? 0 : Integer.parseInt(dto.getMci1().trim()))
			.mci2(dto.getMci2().isEmpty() ? 0 : Integer.parseInt(dto.getMci2().trim()))
			.mci3(dto.getMci3().isEmpty() ? 0 : Integer.parseInt(dto.getMci3().trim()))
			.mci4(dto.getMci4().isEmpty() ? 0 :  Integer.parseInt( dto.getMci4().trim()))
			.mci5(dto.getMci5().isEmpty() ? 0 :  Integer.parseInt( dto.getMci5().trim()))
			.mci6(dto.getMci6().isEmpty() ? 0 : Integer.parseInt(dto.getMci6().trim()))
			.mci7(dto.getMci7().isEmpty() ? 0 : Integer.parseInt(dto.getMci7().trim()))
			.mci8(dto.getMci8().isEmpty() ? 0 : Integer.parseInt( dto.getMci8().trim()))
			.mci9(dto.getMci9().isEmpty() ? 0 :  Integer.parseInt(dto.getMci9().trim()))
			.mci10(dto.getMci10().isEmpty() ? 0 : Integer.parseInt(dto.getMci10().trim()))			
			/* .motivosDeIndeferimento(dto.getMotivosDeIndeferimento())
			.motivosDeDeferimento(dto.getMotivosDeDeferimento())
			.motivosDeDevolucao(dto.getMotivosDeDevolucao())
			.decisaoDicre(dto.getDecisaoDicre()) */
			.motivosDeExclusaoDasEmpresas(dto.getMotivosDeExclusaoDasEmpresas())
			.dataSolicitacao(LocalDateTime.now())
			.prefixoDoSolicitante(Integer.parseInt(dto.getPrefixoDoSolicitante()))
			.parecerAgencia(dto.getParecerAgencia())
			.statusSolicitacao(dto.getStatusSolicitacao().equals("2")  ? "AGUARDANDO ANÁLISE" : dto.getStatusSolicitacao().toUpperCase())
			.build();
	}	
	

}