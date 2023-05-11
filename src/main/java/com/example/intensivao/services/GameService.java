package com.example.intensivao.services;

import com.example.intensivao.dto.GameMinDTO;
import com.example.intensivao.repositories.GameRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.example.intensivao.entities.Game;

import java.util.List;

@Service
public class GameService {
        @Autowired
        private GameRepository gameRepository;
        public List<GameMinDTO> findAll() {
            List<Game> result = gameRepository.findAll();
            List<GameMinDTO> dto = result.stream().map(x -> new GameMinDTO(x)).toList();
            return dto;
        }
}
