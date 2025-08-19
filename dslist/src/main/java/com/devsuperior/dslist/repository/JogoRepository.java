package com.devsuperior.dslist.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.devsuperior.dslist.entities.Jogo;

public interface JogoRepository extends JpaRepository<Jogo, Long> {
    
}
