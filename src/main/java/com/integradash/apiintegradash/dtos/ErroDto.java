package com.integradash.apiintegradash.dtos;

import jakarta.validation.constraints.NotBlank;
import org.springframework.format.annotation.DateTimeFormat;

import java.util.Date;

public record ErroDto(
        @NotBlank String nomeerro,

        @NotBlank
        @DateTimeFormat(pattern="yyyy-MM-dd") Date data_erro,


        @NotBlank String descricao_erro,
        @NotBlank String status_erro
) {
}
