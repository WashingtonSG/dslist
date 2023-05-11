package com.example.intensivao.controllers;

import com.example.intensivao.dto.GameListDTO;
import com.example.intensivao.services.GameListService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping(value = "/lists")
public class GameListController {
    @Autowired
    private GameListService gameListService;
    @GetMapping
    public List<GameListDTO> findAll() {
        return (List<GameListDTO>) gameListService.findAll();
    }
}
