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

		Tarefa tarefa1 = new Tarefa(1, "Estudar Java", "Estudar o primeiro módulo de estruturas em Java", "Aline", "MÉDIA", "29/04/2021");

		tarefaRepository.saveAll(Arrays.asList(tarefa1));
	}

}
