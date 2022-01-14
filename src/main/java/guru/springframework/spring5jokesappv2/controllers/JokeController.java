package guru.springframework.spring5jokesappv2.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class JokeController {
    @RequestMapping("/")
    public String getRandonJoke(Model model) {
        return "";
    }
}
