package com.redis.step;

import org.springframework.batch.core.Step;
import org.springframework.batch.core.configuration.annotation.StepBuilderFactory;
import org.springframework.batch.item.ItemReader;
import org.springframework.batch.item.ItemWriter;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import com.redis.domain.PessoaRedis;

@Configuration
public class StepConfig {
	@Autowired
	private StepBuilderFactory stepBuilderFactory;
	
	@Bean
	public Step step(ItemReader<PessoaRedis> reader, ItemWriter<PessoaRedis> writer) {
		return stepBuilderFactory
				.get("step")
				.<PessoaRedis, PessoaRedis>chunk(100)
				.reader(reader)
				.writer(writer)
				.build();
	}
}
