package br.com.car.api.veiculo;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class DadosProprietario {

    private String proprietario;
    private String cpf;
    private String placa;

}
