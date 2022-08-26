package br.edu.unisep.tads.exemplo1.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import br.edu.unisep.tads.exemplo1.model.Cidade;
import br.edu.unisep.tads.exemplo1.repository.CidadeRepository;

@RestController
@RequestMapping("/api/V1")
public class CidadeController {
    
    @Autowired
    private CidadeRepository cidadeRepository;

    @GetMapping("/cidade")
    public List<Cidade> getAllCidades(){
        return cidadeRepository.findAll();
    }
}
