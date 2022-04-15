package com.gestao.tarefas.dtos;

import java.io.Serializable;
import java.util.Date;

import com.gestao.tarefas.domain.Tarefa;

public class TarefaDTO implements Serializable {

	private static final long serialVersionUID = 1L;
	private Integer id;
	private String titulo;
	private String descricao;
	private String responsavel;
	// private Prioridade prioridade(Media, alta, baixa);
	private Date deadline;

	public TarefaDTO() {
		super();
	}

	public TarefaDTO(Tarefa obj) {
		super();
		this.id = obj.getId();
		this.titulo = obj.getTitulo();
		this.descricao = obj.getDescricao();
		this.responsavel = obj.getResponsavel();
		this.deadline = obj.getDeadline();
	}

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public String getTitulo() {
		return titulo;
	}

	public void setTitulo(String titulo) {
		this.titulo = titulo;
	}

	public String getDescricao() {
		return descricao;
	}

	public void setDescricao(String descricao) {
		this.descricao = descricao;
	}

	public String getResponsavel() {
		return responsavel;
	}

	public void setResponsavel(String responsavel) {
		this.responsavel = responsavel;
	}

	public Date getDeadline() {
		return deadline;
	}

	public void setDeadline(Date deadline) {
		this.deadline = deadline;
	}

}
