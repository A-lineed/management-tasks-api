package com.gestao.tarefas.service;

import java.util.Arrays;
import java.util.Date;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.gestao.tarefas.domain.Tarefa;
import com.gestao.tarefas.repositories.TarefaRepository;

@Service
public class DbService {
	@Autowired
	private TarefaRepository tarefaRepository;

	public void instaciaBaseDeDados() {

//		Tarefa tarefa1 = new Tarefa(1, "Bíblia", "Estudar Mateus", "Leandro",
//				 new Date());
//		Tarefa tarefa2 = new Tarefa(2, "Estudar", "Estudar o primeiro módulo", "Aline",
//				 new Date());
//		Tarefa tarefa3 = new Tarefa(3, "Estudar BI", "Estudar o segundo tema", "Leandro",
//				 new Date());
////		Tarefa tarefa2 = new Tarefa(null, "Estudar Java", "Estudar o segundo módulo do tema 3", "Aline",
////				 new Date());
////		Tarefa tarefa4 = new Tarefa(null, "Estudar a Bíblia", "Estudar Mateus", "Aline", new Date());
////
//		tarefaRepository.saveAll(Arrays.asList(tarefa1, tarefa2, tarefa3));
	}

}
