package com.wiprobootcamp.classeA.ProjetoFinal.repository;

import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.wiprobootcamp.classeA.ProjetoFinal.model.LegalEntity;

@Repository
public interface LegalRepository extends JpaRepository<LegalEntity, Integer> {
	Optional<LegalEntity> findByCnpj(String cnpj);	
}
