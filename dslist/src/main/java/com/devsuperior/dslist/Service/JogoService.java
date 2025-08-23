package com.devsuperior.dslist.Service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.devsuperior.dslist.entities.Jogo;
import com.devsuperior.dslist.jogodto.JogoDTO;
import com.devsuperior.dslist.jogodto.jogoMinDTO;
import com.devsuperior.dslist.projection.JogoMinProjection;
import com.devsuperior.dslist.repository.JogoRepository;

import org.springframework.transaction.annotation.Transactional;

@Service
public class JogoService {

    @Autowired
    private JogoRepository jogorepository;

    @Transactional(readOnly = true)
    public JogoDTO findById(Long id) {
     Jogo result=   jogorepository.findById(id).get();
     JogoDTO dto = new JogoDTO(result);
      return dto;
      
      }

    @Transactional(readOnly = true)
    public List<jogoMinDTO> findAll() {
      List<Jogo> result =  jogorepository.findAll();
      return result.stream().map(x -> new jogoMinDTO(x)).toList();
       
       
    }

     @Transactional(readOnly = true)
    public List<jogoMinDTO> findByList(Long listId) {
      List<JogoMinProjection> result =  jogorepository.searchByList(listId);
      return result.stream().map(x -> new jogoMinDTO(x)).toList();
       
       
    }
}
