package com.example.intensivao.services;

import com.example.intensivao.dto.GameDTO;
import com.example.intensivao.dto.GameMinDTO;
import com.example.intensivao.projections.GameMinProjection;
import com.example.intensivao.repositories.GameRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.example.intensivao.entities.Game;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Service
public class GameService {
        @Autowired
        private GameRepository gameRepository;

        @Transactional(readOnly = true)
        public GameDTO findById(Long id) {
            Game result = gameRepository.findById(id).get();
            return new GameDTO(result);
        }
        @Transactional(readOnly = true)
        public List<GameMinDTO> findAll() {
            List<Game> result = gameRepository.findAll();
            List<GameMinDTO> dto = result.stream().map(x -> new GameMinDTO(x)).toList();
            return dto;
        }
        @Transactional(readOnly = true)
        public List<GameMinDTO> findByList(Long listId) {
            List<GameMinProjection> result = gameRepository.searchByList(listId);
            List<GameMinDTO> dto = result.stream().map(x -> new GameMinDTO(x)).toList();
        return dto;
    }
}
