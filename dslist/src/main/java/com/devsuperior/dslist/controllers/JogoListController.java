package com.devsuperior.dslist.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.devsuperior.dslist.Service.JogoListService;
import com.devsuperior.dslist.Service.JogoService;
import com.devsuperior.dslist.jogodto.JogoListDTO;
import com.devsuperior.dslist.jogodto.jogoMinDTO;
 
@RestController
@RequestMapping("/lists")
public class JogoListController {

    @Autowired
    private JogoListService jogoListService;

    @Autowired
    private JogoService jogoService;
    
       @GetMapping 
    public List<JogoListDTO> findAll() {
        List<JogoListDTO> result = jogoListService.findAll();
        return result;
    }
 

      @GetMapping(value = "/{listId}/games") 
    public List<jogoMinDTO> findByList(@PathVariable Long listId) {
        List<jogoMinDTO> result = jogoService.findAll();
        return result;
    }
}
