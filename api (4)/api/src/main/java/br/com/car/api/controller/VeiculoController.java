package br.com.car.api.controller;

import br.com.car.api.conjunto.DadosConsolidados;
import br.com.car.api.repository.VeiculoRepository;
import br.com.car.api.service.Service;
import br.com.car.api.veiculo.DadosProprietario;
import br.com.car.api.veiculo.DadosVeiculo;
import br.com.car.api.veiculo.Veiculo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.client.RestTemplate;

@RestController
@RequestMapping("/veiculos")
public class VeiculoController {

private  final Service service;
private final VeiculoRepository repository;

@Autowired
    public VeiculoController(Service service, VeiculoRepository repository) {
        this.service = service;
        this.repository = repository;
}

    @PostMapping
    public ResponseEntity<DadosConsolidados> cadastro(@RequestBody  DadosProprietario dados){
        DadosVeiculo dadosVeiculo= consulta(dados.getPlaca()).getBody();
        DadosConsolidados dadosConsolidados = new DadosConsolidados(dados,dadosVeiculo);

        repository.save(new Veiculo(dadosConsolidados));
        return ResponseEntity.ok(dadosConsolidados);
    }


    @GetMapping("/{placa}")
    public ResponseEntity<DadosVeiculo> consulta(@PathVariable String placa) {
        DadosVeiculo dadosVeiculo = service.consulta(placa);
        if (dadosVeiculo != null) {
            return ResponseEntity.ok(dadosVeiculo);
        } else {
            return ResponseEntity.notFound().build();
        }
    }
}
