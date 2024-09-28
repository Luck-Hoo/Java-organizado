package com.example.demo.dtos;

import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.NotNull;

import java.math.BigDecimal;

// record são classes imutáveis. Gera atumaticamente getters e construtores para os parâmetros
// Não é necessário implementar equals e hashcode e toString (codigos boilerplate)
public record ProductRecordDTO(@NotBlank String nameProduct, @NotNull BigDecimal value) {

}
