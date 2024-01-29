package br.com.car.api.veiculo;

import br.com.car.api.conjunto.DadosConsolidados;
import jakarta.persistence.*;

@Table(name = "veiculos", uniqueConstraints = @UniqueConstraint(columnNames = {"cpf","placa"}))
@Entity
public class Veiculo {

    @Id @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;
    private String proprietario;
    @Column(name ="cpf",nullable = false, unique = true)
    private String cpf;
    @Column(name= "placa",nullable = false, unique = true)

    private String placa;
    private String marca;
    private String modelo;
    private String chassi;
    private String licenciado;


    public Veiculo(DadosConsolidados dadosConsolidados) {
        this.proprietario = dadosConsolidados.dadosProprietario().getProprietario();
        this.cpf = dadosConsolidados.dadosProprietario().getCpf();
        this.placa = dadosConsolidados.dadosProprietario().getPlaca();
        this.marca = dadosConsolidados.dadosVeiculo().getMarca();
        this.modelo = dadosConsolidados.dadosVeiculo().getModelo();
        this.chassi = dadosConsolidados.dadosVeiculo().getChassi();
        this.licenciado = dadosConsolidados.dadosVeiculo().getLicenciado();
    }
}
