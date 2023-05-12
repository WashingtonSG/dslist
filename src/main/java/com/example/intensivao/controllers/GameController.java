package com.example.intensivao.controllers;

import com.example.intensivao.dto.GameDTO;
import com.example.intensivao.dto.GameMinDTO;
import com.example.intensivao.services.GameService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping(value = "/games")
public class GameController {
    @Autowired
    private GameService gameService;

    @GetMapping(value = "/{id}")
    public GameDTO findById(@PathVariable Long id) {
        return (GameDTO) gameService.findById(id);
    }

    @GetMapping
    public List<GameMinDTO> findAll() {
        return (List<GameMinDTO>) gameService.findAll();
    }
}