package be.vdab.ouath.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.stereotype.Repository;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/")
class IndexController {
    @GetMapping
    public String index () {
        return "index";
    }
}
