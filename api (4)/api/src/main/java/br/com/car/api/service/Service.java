package br.com.car.api.service;

import br.com.car.api.veiculo.DadosVeiculo;
import org.springframework.http.ResponseEntity;
import org.springframework.web.client.RestTemplate;

@org.springframework.stereotype.Service

public class Service {


    public DadosVeiculo consulta(String placa){
        RestTemplate restTemplate = new RestTemplate();
        String url = "https://my.api.mockaroo.com/veiculos?key=55ad1cd0&placa=" + placa;
        ResponseEntity<DadosVeiculo> resp = restTemplate.getForEntity(url, DadosVeiculo.class);

        return resp.getBody();
    }


}
