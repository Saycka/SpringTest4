package ru.manyatkin.SpringTest4.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.servlet.ModelAndView;
import ru.manyatkin.SpringTest4.repository.PlayerRepository;
import ru.manyatkin.SpringTest4.repository.TeamRepository;

@Controller
public class IndexController {

    final PlayerRepository playerRepository;
    final TeamRepository teamRepository;

    public IndexController(PlayerRepository playerRepository, TeamRepository teamRepository) {
        this.playerRepository = playerRepository;
        this.teamRepository = teamRepository;
    }

    @GetMapping("/")
    public ModelAndView index() {




        return new ModelAndView("index");
    }
}
