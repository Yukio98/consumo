package com.viacep.consumo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

@RestController
public class ViaCepController {

    @Autowired
    private RestTemplate restTemplate;

    @GetMapping("/cep/{cep}")
    public String getCepInfo(@PathVariable String cep) {
        String url = "http://localhost:8080/cep/" + cep;
        String response = restTemplate.getForObject(url, String.class);
        return response;
    }
}

