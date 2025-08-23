package com.devsuperior.dslist.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.devsuperior.dslist.Service.JogoService;
import com.devsuperior.dslist.jogodto.JogoDTO;
import com.devsuperior.dslist.jogodto.jogoMinDTO;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
 
@RestController
@RequestMapping("/jogos")
public class JogoController {
    @Autowired
    private JogoService jogoService;

@GetMapping(value = "/{id}") 
    public JogoDTO findById(@PathVariable Long id) {
        JogoDTO result = jogoService.findById(id);
        return result;
    }

    @GetMapping 
    public List<jogoMinDTO> findAll() {
        List<jogoMinDTO> result = jogoService.findAll();
        return result;
    }
}
