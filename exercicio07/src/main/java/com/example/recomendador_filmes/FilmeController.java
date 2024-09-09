package com.example.recomendador_filmes;


import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class FilmeController {

    @GetMapping("/recomendar")
    public String recomendarFilme(@RequestParam String genero, @RequestParam String ambiente) {
        if ("acao".equalsIgnoreCase(genero) && "futurista".equalsIgnoreCase(ambiente)) {
            return "Homens de Preto";
        } else if ("romance".equalsIgnoreCase(genero) && "histórico".equalsIgnoreCase(ambiente)) {
            return "Orgulho e Preconceito";
        } else if ("terror".equalsIgnoreCase(genero) && "sobrenatural".equalsIgnoreCase(ambiente)) {
            return "O Exorcista";
        } else {
            return "Nenhuma recomendação disponível para os critérios fornecidos.";
        }
    }
}
