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

import br.edu.up.estacionamento.entity.Carro;
import br.edu.up.estacionamento.repository.CarroRepository;

@RestController
@RequestMapping("carro")
public class CarroController {
	
	@Autowired
	private CarroRepository repository;
	
	@GetMapping(produces = "application/json")
	public @ResponseBody Iterable<Carro>listAll(){
		Iterable<Carro> list = repository.findAll();
		return list;
	}
	
	@GetMapping("/{id}")
	public @ResponseBody Carro getById(@PathVariable Integer id) {
		Carro carro = repository.getOne(id);
		return carro;
	}
	
	@PostMapping
	public Carro add(@RequestBody @Valid Carro carro) {
		return repository.save(carro);
	}
	
	@DeleteMapping("/{id}")
	public Carro delete(@PathVariable Integer id) {
		Carro carro = repository.getOne(id);
		repository.delete(carro);
		return carro;
	}

}
