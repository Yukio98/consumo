package com.viacep.consumo;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;


@Service
public class ViaCepService {

    @Value("${viacep.url}")
    private String viaCepUrl;
    private final RestTemplate restTemplate;

    public ViaCepService(RestTemplate restTemplate) {
        this.restTemplate = restTemplate;
    }

    public ViaCepAddress buscarCep(String cep) {
        String url = String.format("%s/%s/json", viaCepUrl, cep);
        return restTemplate.getForObject(url, ViaCepAddress.class);
    }
}
