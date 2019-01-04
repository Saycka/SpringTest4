package ru.manyatkin.SpringTest4.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import ru.manyatkin.SpringTest4.model.Player;

public interface PlayerRepository extends JpaRepository<Player, Long> {
}
