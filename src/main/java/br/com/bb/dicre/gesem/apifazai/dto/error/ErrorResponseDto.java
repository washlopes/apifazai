package br.com.bb.dicre.gesem.apifazai.dto.error;

import org.springframework.http.HttpStatus;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.NoArgsConstructor;


@Data
@NoArgsConstructor
@AllArgsConstructor
@EqualsAndHashCode(callSuper=false)
@Builder
public class ErrorResponseDto {
	
	private String mensagem;
	
	private HttpStatus status;
	
	private Integer codigo;

}
