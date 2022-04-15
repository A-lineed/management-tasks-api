package com.gestao.tarefas.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.gestao.tarefas.domain.Tarefa;

@Repository
public interface TarefaRepository extends JpaRepository<Tarefa, Integer> {

}
