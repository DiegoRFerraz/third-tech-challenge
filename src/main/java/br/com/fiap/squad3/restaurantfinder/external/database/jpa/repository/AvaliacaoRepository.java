package br.com.fiap.squad3.restaurantfinder.external.database.jpa.repository;

import br.com.fiap.squad3.restaurantfinder.external.database.jpa.entities.AvaliacaoEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface AvaliacaoRepository extends JpaRepository<AvaliacaoEntity, Long> {

}