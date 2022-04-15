package com.gestao.tarefas.resources;

import java.net.URI;
import java.util.List;
import java.util.stream.Collectors;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.servlet.support.ServletUriComponentsBuilder;

import com.gestao.tarefas.domain.Tarefa;
import com.gestao.tarefas.dtos.TarefaDTO;
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

	@GetMapping
	public ResponseEntity<List<TarefaDTO>> findAll() {
		List<Tarefa> list = service.findAll();
		List<TarefaDTO> listDTO = list.stream().map(obj -> new TarefaDTO(obj)).collect(Collectors.toList());
		return ResponseEntity.ok().body(listDTO);

	}
	
	@PostMapping
	public ResponseEntity<Tarefa> create(@RequestBody Tarefa obj){
		obj = service.create(obj);
		URI uri = ServletUriComponentsBuilder.fromCurrentRequest().path("/{id}").buildAndExpand(obj.getId()).toUri();
		return ResponseEntity.created(uri).build(); // body(obj); para retornar a tarefa criada
	}
	
	@PutMapping(value = "/{id}")
	public ResponseEntity<TarefaDTO> update(@PathVariable Integer id, @RequestBody TarefaDTO objDto){
		Tarefa newObj = service.update(id, objDto);
		return ResponseEntity.ok().body(new TarefaDTO(newObj));
	}
	
	@DeleteMapping(value = "/{id}")
	public ResponseEntity<Void> delete(@PathVariable Integer id){
		service.delete(id);
		return ResponseEntity.noContent().build();
	}

}
