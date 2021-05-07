package com.redis.domain;

import java.io.Serializable;

import org.springframework.data.redis.core.RedisHash;

@RedisHash("Pessoa")
public class PessoaRedis implements Serializable {
	private static final long serialVersionUID = 1L;
	private int id;
	private String nome;
	private String email;
	private String dataNascimento;
	private int idade;

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getDataNascimento() {
		return dataNascimento;
	}

	public void setDataNascimento(String dataNascimento) {
		this.dataNascimento = dataNascimento;
	}

	public int getIdade() {
		return idade;
	}

	public void setIdade(int idade) {
		this.idade = idade;
	}

}
