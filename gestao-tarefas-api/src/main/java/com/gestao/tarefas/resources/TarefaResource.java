package com.gestao.tarefas.resources;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.gestao.tarefas.domain.Tarefa;
import com.gestao.tarefas.service.TarefaService;

@RestController
@RequestMapping(value = "/tarefa")
public class TarefaResource {
	
	@Autowired
	private TarefaService service;
	
	@GetMapping(value = "/{id}")
	public ResponseEntity<Tarefa> findById(@PathVariable Integer id) {
		Tarefa obj = service.findById(id);
		return ResponseEntity.ok().body(obj);
	}

}
