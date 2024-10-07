package com.example.fipe;

import org.springframework.web.bind.annotation.*;
import org.springframework.web.client.RestTemplate;
import java.time.LocalDate;
import java.time.format.TextStyle;
import java.util.Locale;

@RestController
@RequestMapping("/fipe")
public class FipeController {

    @PostMapping("/valor")
    public FipeResponse getValorFipe(@RequestBody CarroRequest carroRequest) {
        // Exemplo de URL da API da Tabela FIPE
        String apiUrl = String.format("https://api.fipe.org/carros/%s/%s/%d", carroRequest.getMarca(), carroRequest.getModelo(), carroRequest.getAno());

        RestTemplate restTemplate = new RestTemplate();

        // Chamando a API da FIPE (exemplo)
        // Substituir por URL real e lógica de tratamento
        Double valorFipe = restTemplate.getForObject(apiUrl, Double.class);

        // Pegando o mês e ano atual para o retorno
        LocalDate now = LocalDate.now();
        String mes = now.getMonth().getDisplayName(TextStyle.FULL, new Locale("pt", "BR"));
        String mesAno = mes + " de " + now.getYear();

        // Retorna o valor e o mês
        return new FipeResponse(valorFipe, mesAno);
    }
}