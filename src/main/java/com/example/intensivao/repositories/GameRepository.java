package com.example.intensivao.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import com.example.intensivao.entities.Game;
public interface GameRepository extends JpaRepository<Game, Long> {


}
