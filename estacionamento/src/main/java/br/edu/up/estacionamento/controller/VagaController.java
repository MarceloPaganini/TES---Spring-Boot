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

import br.edu.up.estacionamento.entity.Vaga;
import br.edu.up.estacionamento.repository.VagaRepository;

@RestController
@RequestMapping("vaga")
public class VagaController {
	
	@Autowired
	private VagaRepository repository;
	
	@GetMapping(produces = "application/json")
	public @ResponseBody Iterable<Vaga>listAll(){
		Iterable<Vaga> list = repository.findAll();
		return list;
	}
	
	@GetMapping("/{id}")
	public @ResponseBody Vaga getById(@PathVariable Integer id) {
		Vaga vaga = repository.getOne(id);
		return vaga;
	}
	
	@PostMapping
	public Vaga add(@RequestBody @Valid Vaga vaga) {
		return repository.save(vaga);
	}
	
	@DeleteMapping("/{id}")
	public Vaga delete(@PathVariable Integer id) {
		Vaga vaga = repository.getOne(id);
		repository.delete(vaga);
		return vaga;
	}
}
