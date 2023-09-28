package BsmApplication.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

@RestController
@RequestMapping("/bsm")

public class Bsmcontroller {
    @GetMapping
    public String bsm() {
        return "Persistência\n" +
                "Mentalidade de Crescimento\n" +
                "Orientação ao Futuro\n" +
                "Responsabilidade Pessoal\n" +
                "Trabalho em Equipe\n" +
                "Comunicação\n" +
                "Orientação aos Detalhes\n" +
                "Proatividade";
    }
}
