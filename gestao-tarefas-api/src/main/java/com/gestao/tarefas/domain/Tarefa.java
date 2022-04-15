package com.gestao.tarefas.domain;

import java.io.Serializable;
import java.util.Date;
import java.util.Objects;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.validation.constraints.NotEmpty;

import org.hibernate.validator.constraints.Length;

@Entity
public class Tarefa implements Serializable {

	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY) 
	private Integer id;
	
	@NotEmpty(message = "Campo TÍTULO é requerido")
	@Length(min = 5, max = 10, message = "O campo TÍTULO deve ter entre 05 a 10 caracteres")
	private String titulo;

	@NotEmpty(message = "Campo DESCRIÇÃO é requerido")
	@Length(min = 05, max = 30, message = "O campo DESCRIÇÃO deve ter entre 05 a 10 caracteres")
	private String descricao;
	@NotEmpty(message = "Campo RESPONSÁVEL é requerido")
	@Length(min = 3, max = 10, message = "O campo DESCRIÇÃO deve ter entre 03 a 10 caracteres")
	private String responsavel;
	// private Prioridade prioridade(Media, alta, baixa);
	private Date deadline;

	public Tarefa() {
		super();
	}

	public Tarefa(Integer id, String titulo, String descricao, String responsavel, Date deadline) {
		super();
		this.id = id;
		this.titulo = titulo;
		this.descricao = descricao;
		this.responsavel = responsavel;
		this.deadline = deadline;
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

	public static long getSerialversionuid() {
		return serialVersionUID;
	}

	@Override
	public int hashCode() {
		return Objects.hash(id);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Tarefa other = (Tarefa) obj;
		return Objects.equals(id, other.id);
	}

	@Override
	public String toString() {
		return "Tarefa [id=" + id + ", titulo=" + titulo + ", descricao=" + descricao + ", responsavel=" + responsavel
				+ ", deadline=" + deadline + "]";
	}

}
