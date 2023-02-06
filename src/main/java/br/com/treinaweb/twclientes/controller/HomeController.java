package br.com.treinaweb.twclientes.controller;


import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;


@Controller
@RequestMapping("/")
public class HomeController {

   // @RequestMapping(path = "/", method   = RequestMethod.GET) pode ser utlizado ou o GetMapping
   @GetMapping("/")
    public String home(ModelMap model) {
        model.addAttribute("boasvindas", "Bem vindo ao curso de Spring com Thymeleaf!");

        List<String> aulas = new ArrayList<>();
        aulas.add("Aula 01 - Introdução");
        aulas.add("Aula 02 - Templante engines");
        aulas.add("Aula 03 - Arquivos estáticos");

        model.addAttribute("aulas", aulas);
        
        return "home";
    }
    
    @GetMapping("/mensagem")
    public ModelAndView mensagem (){
        ModelAndView modelAndView = new ModelAndView();

        modelAndView.setViewName("mensagem");
        modelAndView.addObject("mensagem", "Mensagem vinda do servidor!");

        return modelAndView;
    }

    @GetMapping("/saudacao")
    public ModelAndView saudacao(@RequestParam(required = false, defaultValue = "Teinaweb") String nome){
        ModelAndView modelAndView = new ModelAndView();

        modelAndView.setViewName("saudacao");
        modelAndView.addObject("nome", nome);
        
        return modelAndView;
    }
}
