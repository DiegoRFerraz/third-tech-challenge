package br.com.fiap.squad3.restaurantfinder.converter;

import external.database.jpa.entities.AvaliacaoEntity;
import external.database.jpa.entities.RestauranteEntity;
import br.com.fiap.squad3.restaurantfinder.model.dtos.AvaliacaoDto;

public interface AvaliacaoConverter {
    AvaliacaoDto toDto(AvaliacaoEntity avaliacaoEntity);

    AvaliacaoEntity toEntity(AvaliacaoDto avaliacaoDto, RestauranteEntity restauranteEntity);

    void updateEntityFromDto(AvaliacaoEntity avaliacaoEntity, AvaliacaoDto avaliacaoDto);
}