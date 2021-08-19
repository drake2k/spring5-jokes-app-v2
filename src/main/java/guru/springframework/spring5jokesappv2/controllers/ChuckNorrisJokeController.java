package guru.springframework.spring5jokesappv2.controllers;

import guru.springframework.spring5jokesappv2.services.ChuckNorrisJokeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.Mapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class ChuckNorrisJokeController {

    private ChuckNorrisJokeService chuckNorrisJokeService;

    public ChuckNorrisJokeController(ChuckNorrisJokeService chuckNorrisJokeService) {
        this.chuckNorrisJokeService = chuckNorrisJokeService;
    }

    @RequestMapping(value={"/", ""})
    public String displayJoke(Model model){
        model.addAttribute("joke", chuckNorrisJokeService.getJoke());
        return "index";
    }
}
