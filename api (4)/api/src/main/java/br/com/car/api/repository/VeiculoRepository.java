package br.com.car.api.repository;

import br.com.car.api.veiculo.Veiculo;
import org.springframework.data.jpa.repository.JpaRepository;

public interface VeiculoRepository extends JpaRepository<Veiculo,Long> {
}
