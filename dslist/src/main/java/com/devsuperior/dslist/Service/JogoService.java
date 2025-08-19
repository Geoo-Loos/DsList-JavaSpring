package com.devsuperior.dslist.Service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.devsuperior.dslist.entities.Jogo;
import com.devsuperior.dslist.jogodto.jogoMinDTO;
import com.devsuperior.dslist.repository.JogoRepository;

@Service
public class JogoService {

    @Autowired
    private JogoRepository jogorepository;

    public List<jogoMinDTO> findAll() {
      List<Jogo> result =  jogorepository.findAll();
      return result.stream().map(x -> new jogoMinDTO(x)).toList();
       
       
    }
}
