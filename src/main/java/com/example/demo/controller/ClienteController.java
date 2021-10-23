package com.example.demo.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.model.ClienteModel;
import com.example.demo.repository.ClienteRepository;

@RestController
@RequestMapping(value = "/api")
public class ClienteController {
	
	@Autowired
	private ClienteRepository clienteRepository;
	
	@GetMapping("/listar/clientes/sql")
	public List<ClienteModel> procuraTodos(){
		
		return clienteRepository.procuraTodos();
	}
	
	
	@GetMapping("/listar/pessoas-fisicas/{tipo}")
	public  ResponseEntity<List<ClienteModel>> filtroId(@PathVariable Integer tipo){
		return ResponseEntity.ok(clienteRepository.procuraPessoasFisicas(tipo));
	}
	
	@GetMapping("/listar/clientes/sql/alfabetico")
	public  List<ClienteModel> procuraTodosAlfabeto(){
		return clienteRepository.procuraTodosAlfabetico();
	}
	
	
	
	
	@PostMapping("salvar/clientes")
	ResponseEntity<ClienteModel> post(@RequestBody ClienteModel clientinho){
		return ResponseEntity.status(HttpStatus.CREATED).body(clienteRepository.save(clientinho));
	}
	
	
	
	
	
	
	
	

}
