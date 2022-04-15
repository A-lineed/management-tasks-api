package com.gestao.tarefas.service;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.gestao.tarefas.domain.Tarefa;
import com.gestao.tarefas.repositories.TarefaRepository;

@Service
public class TarefaService {
	
	@Autowired
	TarefaRepository repository;
	
	public Tarefa findById(Integer id) {
		Optional<Tarefa> obj = repository.findById(id);
		return obj.orElse(null);
	}

}
