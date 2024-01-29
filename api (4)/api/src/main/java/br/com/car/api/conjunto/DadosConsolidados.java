package br.com.car.api.conjunto;

import br.com.car.api.veiculo.DadosProprietario;
import br.com.car.api.veiculo.DadosVeiculo;

public record DadosConsolidados(DadosProprietario dadosProprietario, DadosVeiculo dadosVeiculo) {
}
