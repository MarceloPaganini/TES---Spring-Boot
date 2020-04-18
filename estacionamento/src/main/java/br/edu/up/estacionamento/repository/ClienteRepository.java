package br.edu.up.estacionamento.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import br.edu.up.estacionamento.entity.Cliente;

public interface ClienteRepository extends JpaRepository<Cliente, Integer>{

}
