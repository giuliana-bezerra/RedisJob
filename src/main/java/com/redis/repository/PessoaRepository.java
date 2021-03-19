package com.redis.repository;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.redis.domain.PessoaRedis;

@Repository
public interface PessoaRepository extends CrudRepository<PessoaRedis, String> {}
