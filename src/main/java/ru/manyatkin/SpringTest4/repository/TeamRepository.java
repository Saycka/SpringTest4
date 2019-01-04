package ru.manyatkin.SpringTest4.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import ru.manyatkin.SpringTest4.model.Team;

public interface TeamRepository extends JpaRepository<Team, Long> {
    
}
