package br.com.car.api.veiculo;


import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class DadosVeiculo {

    private String marca;
    private String modelo;
    private String chassi;
    private String licenciado;
}
