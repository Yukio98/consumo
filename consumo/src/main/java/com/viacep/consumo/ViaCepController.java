package com.viacep.consumo;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class ViaCepController {

    private final ViaCepService viaCepService;

    public ViaCepController(ViaCepService viaCepService) {
        this.viaCepService = viaCepService;
    }

    @GetMapping("/cep{cep}")
    public ViaCepAddress bucarEnderecoPorCep(@PathVariable String cep){
        return viaCepService.buscarCep(cep);
    }
}
