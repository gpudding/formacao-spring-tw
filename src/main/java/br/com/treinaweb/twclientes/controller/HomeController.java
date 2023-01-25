package br.com.treinaweb.twclientes.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@Controller
@RequestMapping("/")
public class HomeController {

   // @RequestMapping(path = "/", method   = RequestMethod.GET) pode ser utlizado ou o GetMapping
   @GetMapping("/")
    public String home() {
        return "home";
    }
    
    @GetMapping("/mensagem")
    public String mensagem (Model model){
        model.addAttribute("mensagem", "Mensagem vinda do servidor!");

        return "mensagem";
    }
}
