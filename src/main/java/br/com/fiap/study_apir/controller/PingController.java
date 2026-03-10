package br.com.fiap.study_apir.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController

@RequestMapping("raiz")

public class PingController {

    @GetMapping("ping")//só preciso colocar barra para palavras compostas
    public String ping(){
        return "pong blz";
    }

     @GetMapping("rota1")
    public String rotal(){
        return "rota1";
    }

    @GetMapping("rota2")
    public String rota2(){
        return "rota2";
    }

    @GetMapping("rota3")
    public String rota3(){
        return "rota3";
    }
}
