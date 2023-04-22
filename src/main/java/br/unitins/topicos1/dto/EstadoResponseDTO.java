package br.unitins.topicos1.dto;

import br.unitins.topicos1.model.Estado;

public record EstadoResponseDTO(
        Long id,
        String nome,
        String sigla) {

    public EstadoResponseDTO(Estado estado) {
        this(estado.getId(), estado.getSigla(), estado.getNome());
    }
}
