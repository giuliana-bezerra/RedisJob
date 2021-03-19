package com.redis.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.data.redis.connection.lettuce.LettuceConnectionFactory;
import org.springframework.data.redis.core.RedisTemplate;

@Configuration
public class RedisConfiguration {
// Habilitar quando for utilizar cluster
//	@Value("${spring.redis.cluster.nodes}")
//	private Collection<String> nodes;
	
	@Bean
	LettuceConnectionFactory connectionFactory() {
		return new LettuceConnectionFactory();
		// Habilitar quando for utilizar cluster
	    //return new LettuceConnectionFactory(new RedisClusterConfiguration(nodes));
	}

	@Bean
	public RedisTemplate<String, Object> redisTemplate() {
	    RedisTemplate<String, Object> template = new RedisTemplate<>();
	    template.setConnectionFactory(connectionFactory());
	    return template;
	}
}
