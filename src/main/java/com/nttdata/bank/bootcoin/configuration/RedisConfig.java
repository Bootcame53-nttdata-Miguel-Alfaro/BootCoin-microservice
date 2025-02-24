package com.nttdata.bank.bootcoin.configuration;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.data.redis.connection.RedisStandaloneConfiguration;
import org.springframework.data.redis.connection.lettuce.LettuceConnectionFactory;
import org.springframework.data.redis.core.ReactiveRedisTemplate;
import org.springframework.data.redis.serializer.GenericJackson2JsonRedisSerializer;
import org.springframework.data.redis.serializer.RedisSerializationContext;
import org.springframework.data.redis.serializer.StringRedisSerializer;

@Configuration
public class RedisConfig {

    @Bean
    public LettuceConnectionFactory redisConnectionFactory() {
        RedisStandaloneConfiguration redisConfig = new RedisStandaloneConfiguration();
        redisConfig.setHostName("10.0.73.169");
        redisConfig.setPort(6380);
        return new LettuceConnectionFactory(redisConfig);
    }

    @Bean
    public ReactiveRedisTemplate<String, Object> reactiveRedisTemplate(LettuceConnectionFactory factory) {
        RedisSerializationContext<String, Object> serializationContext = RedisSerializationContext
                .<String, Object>newSerializationContext(new StringRedisSerializer())
                .hashValue(new GenericJackson2JsonRedisSerializer())
                .build();

        return new ReactiveRedisTemplate<>(factory, serializationContext);
    }
}