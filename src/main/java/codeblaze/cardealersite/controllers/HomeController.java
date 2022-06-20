package codeblaze.cardealersite.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class HomeController {
    @GetMapping("/carviews/index")
    public String getHomePage(Model model){
        return "/carviews/index";
    }
}
