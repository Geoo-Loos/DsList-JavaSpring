package com.devsuperior.dslist.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.devsuperior.dslist.entities.JogoList;

public interface JogoListRepository extends JpaRepository<JogoList, Long> {
    
}
