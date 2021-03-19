package com.redis.reader;

import javax.sql.DataSource;

import org.springframework.batch.item.ItemReader;
import org.springframework.batch.item.database.builder.JdbcCursorItemReaderBuilder;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import com.redis.domain.PessoaRedis;

@Configuration
public class ItemReaderConfig {
	@Bean
	public ItemReader<PessoaRedis> reader(@Qualifier("appDataSource") DataSource dataSource) {
		return new JdbcCursorItemReaderBuilder<PessoaRedis>()
				.name("reader")
				.sql("select * from pessoa")
				.dataSource(dataSource)
				.beanRowMapper(PessoaRedis.class)
				.build();
	}
}
