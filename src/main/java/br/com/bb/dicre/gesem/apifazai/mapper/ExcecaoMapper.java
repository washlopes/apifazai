package br.com.bb.dicre.gesem.apifazai.mapper;

import java.time.DayOfWeek;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.util.Objects;

import br.com.bb.dicre.gesem.apifazai.dto.ExcecaoDto;
import br.com.bb.dicre.gesem.apifazai.modelo.Excecao;

public class ExcecaoMapper {
	
	public static Excecao fromDtoToEntity(ExcecaoDto dto) {
		return Excecao.builder()
				.numeroProcesso(dto.getNumeroProcesso())
				.tempoExecucao(LocalDateTime.now())
				.mci(dto.getMci())
				//.prazo(LocalDate.now().plusDays(4))
				.prazo(retornaPrazo())
				.matricula(dto.getMatricula())
				.texto(dto.getTexto())
				.etapa(Objects.isNull(dto.getEtapa()) || dto.getEtapa().isEmpty() ? "" : dto.getEtapa())
				.metodologiaAnalitica(dto.getMetodologiaAnalitica())
				.build();
	}
	
	private static LocalDate retornaPrazo() {		
		
		LocalDate prazo = LocalDate.now();
		
		for(int i = 1; i <= 4; i++) {
			
			if (prazo.plusDays(1).getDayOfWeek().equals(DayOfWeek.SATURDAY)) {
				prazo = prazo.plusDays(3);
			} else {
				prazo = prazo.plusDays(1);
			}
		}
		
		return prazo;
	}

}
