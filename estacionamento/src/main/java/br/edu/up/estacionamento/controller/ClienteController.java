package br.edu.up.estacionamento.controller;

import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import br.edu.up.estacionamento.entity.Cliente;
import br.edu.up.estacionamento.repository.ClienteRepository;

@RestController
@RequestMapping("cliente")
public class ClienteController {

	@Autowired
	private ClienteRepository repository;
	
	@GetMapping(produces = "application/json")
	public @ResponseBody Iterable<Cliente>listAll(){
		Iterable<Cliente> list = repository.findAll();
		return list;
	}
	
	@GetMapping("/{id}")
	public @ResponseBody Cliente getById(@PathVariable Integer id) {
		Cliente cliente = repository.getOne(id);
		return cliente;
	}
	
	@PostMapping
	public Cliente add(@RequestBody @Valid Cliente cliente) {
		return repository.save(cliente);
	}
	
	@DeleteMapping("/{id}")
	public Cliente delete(@PathVariable Integer id) {
		Cliente cliente = repository.getOne(id);
		repository.delete(cliente);
		return cliente;
	}
}
