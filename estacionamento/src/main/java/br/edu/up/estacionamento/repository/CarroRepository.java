package br.edu.up.estacionamento.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import br.edu.up.estacionamento.entity.Carro;

public interface CarroRepository extends JpaRepository<Carro, Integer>{

}
