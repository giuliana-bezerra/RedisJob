package com.redis.writer;

import org.springframework.batch.item.ItemWriter;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import com.redis.domain.PessoaRedis;
import com.redis.repository.PessoaRepository;

@Configuration
public class ItemWriterConfig {
	@Autowired
	private PessoaRepository repository;
	
	@Bean
	public ItemWriter<PessoaRedis> writer() {
		return items -> items.forEach(repository::save);
	}
}
