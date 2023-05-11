package com.example.intensivao.controllers;

import com.example.intensivao.dto.GameMinDTO;
import com.example.intensivao.services.GameService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.intensivao.entities.Game;
import java.util.List;

@RestController
@RequestMapping(value = "/games")
public class GameControllers {
    @Autowired
    private GameService gameService;
    @GetMapping
    public List<GameMinDTO> findAll() {
        return (List<GameMinDTO>) gameService.findAll();
    }
}
