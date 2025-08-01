package dev.desafioDevJava.CriandoImagensComIA.controller;

import dev.desafioDevJava.CriandoImagensComIA.service.IAService;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class IAController {

    private final IAService iaService;

    public IAController(IAService iaService){
        this.iaService = iaService;
    }

    @GetMapping("/")
    public String exibirImagem(){
        return "home";
    }

    @PostMapping("/gerar-imagens")
    public String gerarImagem(@RequestParam("textoDeImagem")String prompt, Model model){
        String imagemUrl = iaService.gerarImagem(prompt);
        model.addAttribute("caminhoImagem",imagemUrl);
        return "home";
    }

}
