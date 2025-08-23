package com.devsuperior.dslist.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import com.devsuperior.dslist.entities.Jogo;
import com.devsuperior.dslist.projection.JogoMinProjection;

public interface JogoRepository extends JpaRepository<Jogo, Long> {
    
   @Query(nativeQuery = true, value = """
    SELECT
        TB_JOGO.ID,
        TB_JOGO.TITLE,
        TB_JOGO.JOGO_YEAR AS year,
        TB_JOGO.IMG_URL AS imgUrl,
        TB_JOGO.SHORT_DESCRIPTION AS shortDescription,
        TB_BELONGING.POSITION
    FROM TB_JOGO
    INNER JOIN TB_BELONGING ON TB_JOGO.ID = TB_BELONGING.JOGO_ID
    WHERE TB_BELONGING.JOGO_LIST_ID = :listId
    ORDER BY TB_BELONGING.POSITION
""")
List<JogoMinProjection> searchByList(Long listId);
}
