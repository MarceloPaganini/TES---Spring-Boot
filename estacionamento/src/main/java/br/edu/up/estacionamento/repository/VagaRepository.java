package br.edu.up.estacionamento.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import br.edu.up.estacionamento.entity.Vaga;

public interface VagaRepository extends JpaRepository<Vaga, Integer>{
}
